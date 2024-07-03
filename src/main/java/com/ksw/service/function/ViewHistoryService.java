package com.ksw.service.function;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ksw.dao.object.NoteViewRepository;
import com.ksw.dao.relation.NoteCategoryMapper;
import com.ksw.dao.relation.ViewUserNoteMapper;
import com.ksw.dto.function.ViewHistoryDTO;
import com.ksw.object.entity.jpa.NoteView;
import com.ksw.object.entity.mybatis.ViewUserNote;
import com.ksw.object.vo.combined.ViewHistoryVO;

@Service
public class ViewHistoryService {

    @Autowired
    private NoteViewRepository noteViewRepository;

    @Autowired
    private ViewUserNoteMapper viewUserNoteMapper;
	
    @Autowired
    private NoteCategoryMapper noteCategoryMapper;
    
    @Transactional(readOnly = true)
    public List<ViewHistoryVO> getHistory(int userNo) {
        List<ViewUserNote> viewUserNotes = viewUserNoteMapper.findByUserNo(userNo);
        return viewUserNotes.stream()
                .map(this::convertToDTO)
                .map(this::convertToVO)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<ViewHistoryVO> getHistoryByCategory(Integer userNo, Integer categoryNo) {
        // Ư�� ī�װ��� ��� ��Ʈ ID�� �����ɴϴ�.
        List<Integer> noteNosInCategory = noteCategoryMapper.findNoteNosByCategoryNo(categoryNo);

        // ����ڰ� �̹� �� ��Ʈ ID�� �����ɴϴ�.
        List<ViewUserNote> viewUserNotes = viewUserNoteMapper.findByUserNo(userNo);

        // ī�װ� ������ ����ڰ� �� ��Ʈ�鸸 ���͸��մϴ�.
        List<ViewUserNote> filteredViewUserNotes = viewUserNotes.stream()
                .filter(viewUserNote -> noteNosInCategory.contains(viewUserNote.getNoteNo()))
                .collect(Collectors.toList());

        return filteredViewUserNotes.stream()
                .map(this::convertToDTO)
                .map(this::convertToVO)
                .collect(Collectors.toList());
    }
    
    private ViewHistoryDTO convertToDTO(ViewUserNote viewUserNote) {
        NoteView noteView = noteViewRepository.findById(viewUserNote.getNoteViewNo()).orElse(null);
        if (noteView != null) {
            ViewHistoryDTO dto = new ViewHistoryDTO();
            dto.setNoteNo(viewUserNote.getNoteNo());
            dto.setNoteViewNo(viewUserNote.getNoteViewNo());
            dto.setCreateAt(noteView.getCreatedAt());
            return dto;
        }
        return null;
    }
    
    public ViewHistoryVO convertToVO(ViewHistoryDTO viewHistoryDTO) {
        return new ViewHistoryVO.Builder()
                .noteNo(viewHistoryDTO.getNoteNo())
                .noteViewNo(viewHistoryDTO.getNoteViewNo())
                .createAt(viewHistoryDTO.getCreateAt())
                .build();
    }
}

