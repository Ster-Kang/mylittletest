package com.ksw.dto.forObject;

public class FileNoteDTO {

    private Integer noteNo;
    private Integer fileNo;

    // �⺻ ������
    public FileNoteDTO() {}

    // Getter �� Setter
    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public Integer getFileNo() {
        return fileNo;
    }

    public void setFileNo(Integer fileNo) {
        this.fileNo = fileNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer noteNo;
        private Integer fileNo;

        public Builder noteNo(Integer noteNo) {
            this.noteNo = noteNo;
            return this;
        }

        public Builder fileNo(Integer fileNo) {
            this.fileNo = fileNo;
            return this;
        }

        public FileNoteDTO build() {
            FileNoteDTO fileNoteDTO = new FileNoteDTO();
            fileNoteDTO.noteNo = this.noteNo;
            fileNoteDTO.fileNo = this.fileNo;
            return fileNoteDTO;
        }
    }
}
