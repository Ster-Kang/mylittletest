package com.ksw.service.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ksw.dao.NoteRepository;
import com.ksw.dto.forObject.NoteDTO;
import com.ksw.object.entity.jpa.Note;
import com.ksw.service.object.NoteService;

public class WriteService {

	@Autowired
	private NoteRepository noteRepository;
	
	@Autowired
	private NoteService noteService;
	
	@Transactional
	public Note noteWrite(NoteDTO noteDTO) {
		
		Note note = noteService.convertToEntity(noteDTO);
		
		return noteRepository.save(note);
	}
	
	
	
}
