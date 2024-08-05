package com.ksw.service.forObject.relation;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksw.dao.forObject.relation.NoteUserMapper;
import com.ksw.dto.forObject.entity.UserDTO;
import com.ksw.dto.forObject.relation.NoteUserDTO;
import com.ksw.object.entity.Note;
import com.ksw.object.entity.User;
import com.ksw.object.relation.NoteUser;
import com.ksw.service.forObject.entity.NoteService;
import com.ksw.service.forObject.entity.UserService;
import com.ksw.vo.forObject.relation.NoteUserVO;

@Service
public class NoteUserService {

	@Autowired
	private NoteService noteService;
	@Autowired
	private UserService userService;
	@Autowired
	private NoteUserMapper noteUserMapper; 

	public List<Map<String, Object>> getCategoryListByUserNo(Integer userNo) {
		return noteUserMapper.getCategoryListByUserNo(userNo);
	}
	
	public List<Map<String, Object>> getSimilarCategoryListByUserNo(Integer userNo, String searchInput) {
		return noteUserMapper.getSimilarCategoryListByUserNo(userNo, searchInput);
	}
	
	public List<Map<String,Object>> getNoteListByUserNo(Integer userNo){
		List<Map<String,Object>> result = noteUserMapper.getNoteListByUserNo(userNo);
		return result;
	}	
	
	public List<Map<String,Object>> getNoteList(    		
			Integer userNo, 
    		String sort,
    		Integer limit,
    		Integer offset,
    		Integer searchType,
    		String searchInput){
		List<Map<String,Object>> result = noteUserMapper.getNoteList(userNo, sort, limit, offset, searchType, searchInput);
		return result;
	}
	
	public UserDTO getUserByNoteNo(Integer noteNo) {
		UserDTO user = new UserDTO();
		if (noteNo == null) {
			return user;
		}
		user = userService.convertToDTO(noteUserMapper.getUserByNoteNo(noteNo));
		return user;
	}
	
    // Entity -> DTO 변환 메소드
    public NoteUserDTO convertToDTO(NoteUser noteUserEntity) {
    	NoteUserDTO dto = new NoteUserDTO();
    	if (noteUserEntity == null) {
    		System.out.println("NoteUser to NoteUserDTO failed. Empty NoteUserDTO created. NoteUser is null");   	
    		return dto;
    	}
    	dto.setNoteDTO(noteService.convertToDTO(noteUserEntity.getNote()));
    	dto.setUserDTO(userService.convertToDTO(noteUserEntity.getUser()));
        return dto;
    }

    public NoteUser convertToEntity(NoteUserDTO noteUserDTO) {
    	NoteUser noteUser = new NoteUser();
    	if (noteUserDTO == null) {
    		System.out.println("NoteUserDTO to NoteUser failed. Empty NoteUser created. NoteUserDTO is null");   	
    		return noteUser;
    	}
    	Note note = noteService.convertToEntity(noteUserDTO.getNoteDTO());
    	User user = userService.convertToEntity(noteUserDTO.getUserDTO());
    	
    	noteUser.setNote(note);
    	noteUser.setUser(user);
    	return noteUser;
    }
    
    // DTO -> VO 변환 메소드
    public NoteUserVO convertToVO(NoteUserDTO noteUserDTO) {
    	if (noteUserDTO == null) {
    		System.out.println("NoteUserDTO to NoteUserVO failed. Empty NoteUserVO created. NoteUserDTO is null");   	
    		return new NoteUserVO.Builder().build();
    	}
        return new NoteUserVO.Builder()
                .userVO(userService.convertToVO(noteUserDTO.getUserDTO()))
                .noteVO(noteService.convertToVO(noteUserDTO.getNoteDTO()))
                .build();
    }
}
