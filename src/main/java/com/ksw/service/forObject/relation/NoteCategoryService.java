package com.ksw.service.forObject.relation;

import com.ksw.dto.forObject.relation.NoteCategoryDTO;
import com.ksw.object.entity.mybatis.NoteCategory;
import com.ksw.object.vo.relation.NoteCategoryVO;

import org.springframework.stereotype.Service;

@Service
public class NoteCategoryService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public NoteCategoryDTO convertToDTO(NoteCategory noteCategoryEntity) {
        return new NoteCategoryDTO.Builder()
                .categoryNo(noteCategoryEntity.getCategoryNo())
                .noteNo(noteCategoryEntity.getNoteNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public NoteCategoryVO convertToVO(NoteCategoryDTO noteCategoryDTO) {
        return new NoteCategoryVO.Builder()
                .categoryNo(noteCategoryDTO.getCategoryNo())
                .noteNo(noteCategoryDTO.getNoteNo())
                .build();
    }
}
