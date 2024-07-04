package com.ksw.service.forObject.object;

import com.ksw.dao.object.NoteRepository;
import com.ksw.dao.relation.NoteCategoryMapper;
import com.ksw.dao.relation.ViewUserNoteMapper;
import com.ksw.dto.forObject.object.NoteDTO;
import com.ksw.object.entity.jpa.Note;
import com.ksw.object.vo.combined.ViewHistoryVO;
import com.ksw.object.vo.object.NoteVO;
import com.ksw.service.forObject.relation.FavoriteNoteService;
import com.ksw.service.function.ViewHistoryService;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;
    
    @Autowired
    ViewHistoryService viewHistoryService;
    
    @Autowired
    FavoriteNoteService favoriteNoteService;
    
//    @Transactional(readOnly = true)
//    public Note getRandomUnviewedNoteByCategory(int categoryNo, int userNo) {
//        // ����ڰ� Ư�� ī�װ����� �� ��Ʈ ����� �����ɴϴ�.
//        List<ViewHistoryVO> viewHistoriesByCategory = viewHistoryService.getHistoryByCategory(userNo, categoryNo);
//        
//        // ����ڰ� Ư�� ī�װ����� �� ��Ʈ ����� ��ȣ�� ����.  
//        List<Integer> viewedNoteNosByCategory = viewHistoriesByCategory.stream()
//                .map(ViewHistoryVO::getNoteNo)
//                .collect(Collectors.toList());
//
//        // ����ڰ� �Ⱦ��ϴ� ��Ʈ ����� �����ɴϴ�.
//        List<Integer> dislikedNoteNos = favoriteNoteService.findDislikedNoteNosByUserNo(userNo);
//
//        // Ư�� ī�װ��� ���ϴ� ��� ��Ʈ ID�� �����ɴϴ�.
//        List<Integer> noteNosInCategory = noteRepository.findNoteNosByCategory(categoryNo);
//        
//        // ���� ��Ʈ ��ȣ�� ��ȯ�� �ĺ����� ���� ����Ʈ ���� 
//        List<Note> notesToChooseFrom;
//
//        if (viewedNoteNosByCategory.isEmpty()) {
//            // ����ڰ� Ư�� ī�װ����� �� ��Ʈ�� ������, ī�װ��� ��� ��Ʈ�� �߿��� �����մϴ�.
//            notesToChooseFrom = noteRepository.findNotesByNoteNos(noteNosInCategory);
//        } else {
//            // ����ڰ� Ư�� ī�װ����� �� ��Ʈ�� ������, �� ��Ʈ�� �߿��� �Ⱦ��ϴ� ��Ʈ�� ������ ��Ͽ��� �����մϴ�.
//            notesToChooseFrom = noteRepository.findNotesByNoteNos(
//                    viewedNoteNosByCategory.stream()
//                            .filter(noteNo -> !dislikedNoteNos.contains(noteNo))
//                            .collect(Collectors.toList())
//            );
//        }
//
//        if (notesToChooseFrom.isEmpty()) {
//            throw new IllegalStateException("No notes available in this category for the user");
//        }
//
//        // �������� ��Ʈ�� �����մϴ�.
//        Random random = new Random();
//        int randomIndex = random.nextInt(notesToChooseFrom.size());
//        return notesToChooseFrom.get(randomIndex);
//    }
	

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

    // DTO -> Entity�� ��ȯ
    public Note convertToEntity(NoteDTO noteDTO) {
        Note note = new Note();
        note.setNoteNo(noteDTO.getNoteNo());
        note.setNoteTitle(noteDTO.getNoteTitle());
        note.setNoteContent(noteDTO.getNoteContent());
        note.setNoteCommentary(noteDTO.getNoteCommentary());
        note.setNoteHint(noteDTO.getNoteHint());
        note.setNoteAnswer(noteDTO.getNoteAnswer());
        note.setIsActive(noteDTO.getIsActive());
        note.setCreatedAt(noteDTO.getCreatedAt());
        note.setUpdatedAt(noteDTO.getUpdatedAt());
        return note;
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
