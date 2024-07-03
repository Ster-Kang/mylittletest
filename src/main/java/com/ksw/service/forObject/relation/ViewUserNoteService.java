package com.ksw.service.forObject.relation;

import com.ksw.dao.relation.ViewUserNoteMapper;
import com.ksw.dto.forObject.relation.ViewUserNoteDTO;
import com.ksw.object.entity.mybatis.ViewUserNote;
import com.ksw.object.vo.relation.ViewUserNoteVO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ViewUserNoteService {
	
    // Entity -> DTO ��ȯ �޼ҵ�
    public ViewUserNoteDTO convertToDTO(ViewUserNote viewUserNoteEntity) {
        return new ViewUserNoteDTO.Builder()
                .userNo(viewUserNoteEntity.getUserNo())
                .noteNo(viewUserNoteEntity.getNoteNo())
                .noteViewNo(viewUserNoteEntity.getNoteViewNo())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public ViewUserNoteVO convertToVO(ViewUserNoteDTO viewUserNoteDTO) {
        return new ViewUserNoteVO.Builder()
                .userNo(viewUserNoteDTO.getUserNo())
                .noteNo(viewUserNoteDTO.getNoteNo())
                .noteViewNo(viewUserNoteDTO.getPostViewNo())
                .build();
    }
}
