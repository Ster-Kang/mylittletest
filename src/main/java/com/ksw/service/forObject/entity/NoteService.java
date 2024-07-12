package com.ksw.service.forObject.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksw.dao.forObject.entity.NoteRepository;
import com.ksw.dao.forObject.relation.NoteCategoryMapper;
import com.ksw.dto.forObject.entity.NoteDTO;
import com.ksw.object.entity.Note;
import com.ksw.service.forObject.relation.FavoriteNoteService;
import com.ksw.vo.forObject.entity.NoteVO;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;
    
    @Autowired
    FavoriteNoteService favoriteNoteService;
    
    @Autowired
    NoteCategoryMapper noteCategoryMapper;
    
	/*
	 * @Transactional(readOnly = true) public Note
	 * getRandomUnviewedNoteByCategory(int categoryNo, int userNo) { // 사용자가 특정
	 * 카테고리에서 본 노트 목록을 가져옵니다. List<ViewHistoryVO> viewHistoriesByCategory =
	 * viewHistoryService.getHistoryByCategory(userNo, categoryNo);
	 * 
	 * // 사용자가 특정 카테고리에서 본 노트 목록의 번호를 생성. List<Integer> viewedNoteNosByCategory =
	 * viewHistoriesByCategory.stream() .map(ViewHistoryVO::getNoteNo)
	 * .collect(Collectors.toList());
	 * 
	 * // 사용자가 싫어하는 노트 목록을 가져옵니다. List<Integer> dislikedNoteNos =
	 * favoriteNoteService.findDislikedNoteNosByUserNo(userNo);
	 * 
	 * // 특정 카테고리에 속하는 모든 노트 ID를 가져옵니다. List<Integer> noteNosInCategory =
	 * noteCategoryMapper.findNoteNosByCategoryNo(categoryNo);
	 * 
	 * // 최종 노트 번호를 반환할 후보군을 위한 리스트 생성 List<Note> notesToChooseFrom;
	 * 
	 * if (viewedNoteNosByCategory.isEmpty()) { // 사용자가 특정 카테고리에서 본 노트가 없으면, 카테고리의
	 * 모든 노트들 중에서 선택합니다. notesToChooseFrom =
	 * noteRepository.findNotesByNoteNos(noteNosInCategory); } else { // 사용자가 특정
	 * 카테고리에서 본 노트가 있으면, 그 노트들 중에서 싫어하는 노트를 제외한 목록에서 선택합니다. notesToChooseFrom =
	 * noteRepository.findNotesByNoteNos( viewedNoteNosByCategory.stream()
	 * .filter(noteNo -> !dislikedNoteNos.contains(noteNo))
	 * .collect(Collectors.toList()) ); }
	 * 
	 * if (notesToChooseFrom.isEmpty()) { throw new
	 * IllegalStateException("No notes available in this category for the user"); }
	 * 
	 * // 랜덤으로 노트를 선택합니다. Random random = new Random(); int randomIndex =
	 * random.nextInt(notesToChooseFrom.size()); return
	 * notesToChooseFrom.get(randomIndex); }
	 */

    // Entity -> DTO 변환 메소드
    public NoteDTO convertToDTO(Note note) {
    	if (note == null) {
    		return null;
    	}
    	
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

    // DTO -> Entity로 변환
    public Note convertToEntity(NoteDTO noteDTO) {
    	if (noteDTO == null) {
    		return null;
    	}
    	
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
    
    // DTO -> VO 변환 메소드
    public NoteVO convertToVO(NoteDTO noteDTO) {
    	if (noteDTO == null) {
    		return null;
    	}
    	
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
