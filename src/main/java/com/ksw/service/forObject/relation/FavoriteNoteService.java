package com.ksw.service.forObject.relation;

import com.ksw.dto.forObject.relation.FavoriteNoteDTO;
import com.ksw.object.entity.mybatis.FavoriteNote;
import com.ksw.object.vo.relation.FavoriteNoteVO;

import org.springframework.stereotype.Service;

@Service
public class FavoriteNoteService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public FavoriteNoteDTO convertToDTO(FavoriteNote favoriteNoteEntity) {
        return new FavoriteNoteDTO.Builder()
                .userNo(favoriteNoteEntity.getUserNo())
                .noteNo(favoriteNoteEntity.getNoteNo())
                .favoriteNo(favoriteNoteEntity.getFavoriteNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public FavoriteNoteVO convertToVO(FavoriteNoteDTO favoriteNoteDTO) {
        return new FavoriteNoteVO.Builder()
                .userNo(favoriteNoteDTO.getUserNo())
                .noteNo(favoriteNoteDTO.getNoteNo())
                .favoriteNo(favoriteNoteDTO.getFavoriteNo())
                .build();
    }
}
