package com.ksw.dto.forObject;

public class NoteCategoryDTO {

    private Integer categoryNo;
    private Integer noteNo;

    // �⺻ ������
    public NoteCategoryDTO() {}

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

        public NoteCategoryDTO build() {
            NoteCategoryDTO noteCategoryDTO = new NoteCategoryDTO();
            noteCategoryDTO.categoryNo = this.categoryNo;
            noteCategoryDTO.noteNo = this.noteNo;
            return noteCategoryDTO;
        }
    }
}
