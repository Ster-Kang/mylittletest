package com.ksw.dto.forObject;

public class NoteReplyDTO {

    private Integer noteNo;
    private Integer replyNo;

    // �⺻ ������
    public NoteReplyDTO() {}

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

    // ���� ���� ����
    public static class Builder {
        private Integer noteNo;
        private Integer replyNo;

        public Builder noteNo(Integer noteNo) {
            this.noteNo = noteNo;
            return this;
        }

        public Builder replyNo(Integer replyNo) {
            this.replyNo = replyNo;
            return this;
        }

        public NoteReplyDTO build() {
            NoteReplyDTO noteReplyDTO = new NoteReplyDTO();
            noteReplyDTO.noteNo = this.noteNo;
            noteReplyDTO.replyNo = this.replyNo;
            return noteReplyDTO;
        }
    }
}
