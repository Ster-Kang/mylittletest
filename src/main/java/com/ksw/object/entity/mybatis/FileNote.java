package com.ksw.object.entity.mybatis;

public class FileNote {

    private Integer noteNo;
    private Integer fileNo;

    // �⺻ ������
    public FileNote() {}

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
}
