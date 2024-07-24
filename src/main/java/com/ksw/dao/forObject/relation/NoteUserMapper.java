package com.ksw.dao.forObject.relation;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ksw.object.entity.User;
import com.ksw.object.relation.NoteUser;

@Mapper
public interface NoteUserMapper {
	
	@Select("SELECT DISTINCT(c.categoryNo) "
			+ "FROM category c "
			+ "JOIN noteCategory nc ON c.categoryNo = nc.categoryNo "
			+ "JOIN noteUser nu ON nu.noteNo = nc.noteNo "
			+ "WHERE nu.userNo = #{userNo} ")
	List<Map<String,Object>> getCategoryListByUserNo(@Param("userNo") Integer userNo);
	
	@Select("SELECT DISTINCT(c.categoryNo) "
			+ "FROM category c "
			+ "JOIN noteCategory nc ON c.categoryNo = nc.categoryNo "
			+ "JOIN noteUser nu ON nu.noteNo = nc.noteNo "
			+ "WHERE nu.userNo = #{userNo} AND c.categoryTitle LIKE CONCAT('%', #{searchInput}, '%') ")
	List<Map<String,Object>> getSimilarCategoryListByUserNo(@Param("userNo") Integer userNo, @Param("searchInput") String searchInput);
	
	@Select("SELECT c.categoryTitle, n.noteTitle, n.createdAt, n.noteNo, "
	        + "COUNT(CASE WHEN f.favoriteType = 2 THEN 1 ELSE NULL END) AS favorite_count, "
	        + "COUNT(r.replyNo) AS reply_count "
	        + "FROM note n "
	        + "JOIN noteUser nu ON nu.noteNo = n.noteNo "
	        + "JOIN noteCategory nc ON nc.noteNo = n.noteNo "
	        + "JOIN category c ON c.categoryNo = nc.categoryNo "
	        + "LEFT JOIN favoriteNote fn ON fn.noteNo = n.noteNo "
	        + "LEFT JOIN favorite f ON fn.favoriteNo = f.favoriteNo "
	        + "LEFT JOIN noteReply nr ON nr.noteNo = n.noteNo "
	        + "LEFT JOIN reply r ON r.replyNo = nr.replyNo "
	        + "JOIN noteView nv ON nv.noteNo = n.noteNo "
	        + "JOIN view v ON v.viewNo = nv.viewNo "
	        + "WHERE nu.userNo = #{userNo} "
	        + "GROUP BY c.categoryTitle, n.noteTitle, n.createdAt, n.noteNo "
	        + "ORDER BY n.createdAt DESC ")
	List<Map<String,Object>> getNoteListByUserNo(@Param("userNo") Integer userNo);

	@Insert(""
			+ "INSERT INTO noteUser "
			+ "(noteNo, userNo) "
			+ "VALUES "
			+ "(#{note.noteNo}, #{user.userNo})")
	void insert(NoteUser noteUser);
	
	@Select(""
			+ "SELECT u.* "
			+ "FROM user u JOIN noteUser nu on u.userNo = nu.userNo "
			+ "WHERE nu.noteNo = #{noteNo}" )
	User getUserByNoteNo(Integer noteNo); 
}
