package com.ksw.service.forObject.object;

import com.ksw.dto.forObject.object.NoteViewDTO;
import com.ksw.object.entity.NoteView;
import com.ksw.vo.forObject.object.NoteViewVO;

import org.springframework.stereotype.Service;

@Service
public class NoteViewService {

    // Entity -> DTO 변환 메소드
    public NoteViewDTO convertToDTO(NoteView noteViewEntity) {
        return new NoteViewDTO.Builder()
                .noteViewNo(noteViewEntity.getNoteViewNo())
                .createdAt(noteViewEntity.getCreatedAt())
                .build();
    }

    // DTO -> VO 변환 메소드
    public NoteViewVO convertToVO(NoteViewDTO noteViewDTO) {
        return new NoteViewVO.Builder()
                .noteViewNo(noteViewDTO.getNoteViewNo())
                .createdAt(noteViewDTO.getCreatedAt())
                .build();
    }
}
