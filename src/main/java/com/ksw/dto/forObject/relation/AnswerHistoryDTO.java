package com.ksw.dto.forObject.relation;

import java.sql.Timestamp;

public class AnswerHistoryDTO {

	private Integer noteNo;
    private Integer answerNo;
    private Integer userNo;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Timestamp getUpdatedAt() {
    	return updatedAt;
    }
    
    public void setUpdatedAt(Timestamp updatedAt) {
    	this.updatedAt = updatedAt;
    }

    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public Integer getAnswerNo() {
        return answerNo;
    }

    public void setAnswerNo(Integer answerNo) {
        this.answerNo = answerNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
