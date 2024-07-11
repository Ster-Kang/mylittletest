package com.ksw.dto.forObject.relation;

import com.ksw.dto.forObject.entity.CategoryDTO;
import com.ksw.dto.forObject.entity.NoteDTO;

public class NoteCategoryDTO {

    private CategoryDTO categoryDTO;
    private NoteDTO noteDTO;

    // 기본 생성자
    public NoteCategoryDTO() {}
    
    public NoteCategoryDTO(NoteDTO noteDTO, CategoryDTO categoryDTO) {
    	super();
    	this.categoryDTO = categoryDTO;
    	this.noteDTO = noteDTO;
    }

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public NoteDTO getNoteDTO() {
		return noteDTO;
	}

	public void setNoteDTO(NoteDTO noteDTO) {
		this.noteDTO = noteDTO;
	}
}
