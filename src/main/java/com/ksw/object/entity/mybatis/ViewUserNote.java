package com.ksw.object.entity.mybatis;

public class ViewUserNote {

    private Integer userNo;
    private Integer noteNo;
    private Integer noteViewNo;

    // �⺻ ������
    public ViewUserNote() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public Integer getPostViewNo() {
        return noteViewNo;
    }

    public void setNoteViewNo(Integer noteViewNo) {
        this.noteViewNo = noteViewNo;
    }
}
