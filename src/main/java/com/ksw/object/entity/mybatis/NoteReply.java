package com.ksw.object.entity.mybatis;

public class NoteReply {

    private Integer noteNo;
    private Integer replyNo;

    // �⺻ ������
    public NoteReply() {}

    // Getter �� Setter
    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public Integer getReplyNo() {
        return replyNo;
    }

    public void setReplyNo(Integer replyNo) {
        this.replyNo = replyNo;
    }
}
