package com.ksw.service;

import com.ksw.dto.forObject.NoteDTO;
import com.ksw.object.entity.jpa.Note;
import com.ksw.object.vo.NoteVO;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    // Entity -> DTO ��ȯ �޼ҵ�
    public NoteDTO convertToDTO(Note note) {
        return new NoteDTO.Builder()
                .noteNo(note.getNoteNo())
                .noteTitle(note.getNoteTitle())
                .noteContent(note.getNoteContent())
                .noteHint(note.getNoteHint())
                .noteAnswer(note.getNoteAnswer())
                .isActive(note.getIsActive())
                .createdAt(note.getCreatedAt())
                .updatedAt(note.getUpdatedAt())
                .build();
    }

    // DTO -> VO ��ȯ �޼ҵ�
    public NoteVO convertToVO(NoteDTO noteDTO) {
        return new NoteVO.Builder()
                .noteNo(noteDTO.getNoteNo())
                .noteTitle(noteDTO.getNoteTitle())
                .noteContent(noteDTO.getNoteContent())
                .noteHint(noteDTO.getNoteHint())
                .noteAnswer(noteDTO.getNoteAnswer())
                .isActive(noteDTO.getIsActive())
                .createdAt(noteDTO.getCreatedAt())
                .updatedAt(noteDTO.getUpdatedAt())
                .build();
    }
}
