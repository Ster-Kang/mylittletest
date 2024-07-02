package com.ksw.service.object;

import com.ksw.dto.forObject.NoteViewDTO;
import com.ksw.object.entity.jpa.NoteView;
import com.ksw.object.vo.NoteViewVO;
import org.springframework.stereotype.Service;

@Service
public class NoteViewService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public NoteViewDTO convertToDTO(NoteView noteViewEntity) {
        return new NoteViewDTO.Builder()
                .noteViewNo(noteViewEntity.getNoteViewNo())
                .createdAt(noteViewEntity.getCreatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public NoteViewVO convertToVO(NoteViewDTO noteViewDTO) {
        return new NoteViewVO.Builder()
                .noteViewNo(noteViewDTO.getNoteViewNo())
                .createdAt(noteViewDTO.getCreatedAt())
                .build();
    }
}
