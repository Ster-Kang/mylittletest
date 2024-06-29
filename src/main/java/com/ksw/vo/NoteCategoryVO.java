package com.ksw.vo;

public class NoteCategoryVO {

    private Integer categoryNo;
    private Integer noteNo;

    // �⺻ ������
    public NoteCategoryVO() {}

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

    // ���� ���� ����
    public static class Builder {
        private Integer categoryNo;
        private Integer noteNo;

        public Builder categoryNo(Integer categoryNo) {
            this.categoryNo = categoryNo;
            return this;
        }

        public Builder noteNo(Integer noteNo) {
            this.noteNo = noteNo;
            return this;
        }

        public NoteCategoryVO build() {
            NoteCategoryVO noteCategoryVO = new NoteCategoryVO();
            noteCategoryVO.categoryNo = this.categoryNo;
            noteCategoryVO.noteNo = this.noteNo;
            return noteCategoryVO;
        }
    }
}
