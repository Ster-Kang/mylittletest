package com.ksw.dto;

import java.sql.Timestamp;

public class NoteDTO {

    private Integer noteNo;
    private String noteTitle;
    private String noteContent;
    private String noteHint;
    private String noteAnswer;
    private Boolean isActive;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // �⺻ ������
    public NoteDTO() {}

    // Getters and Setters
    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteHint() {
        return noteHint;
    }

    public void setNoteHint(String noteHint) {
        this.noteHint = noteHint;
    }

    public String getNoteAnswer() {
        return noteAnswer;
    }

    public void setNoteAnswer(String noteAnswer) {
        this.noteAnswer = noteAnswer;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
