package com.ksw.object.entity.mybatis;

public class NoteCategory {

    private Integer categoryNo;
    private Integer noteNo;

    // �⺻ ������
    public NoteCategory() {}

    // Getter �� Setter
    public Integer getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(Integer categoryNo) {
        this.categoryNo = categoryNo;
    }

    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }
}
