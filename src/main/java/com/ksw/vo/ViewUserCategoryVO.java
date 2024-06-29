package com.ksw.vo;

public class ViewUserCategoryVO {

    private Integer userNo;
    private Integer categoryNo;
    private Integer categoryViewNo;

    // �⺻ ������
    public ViewUserCategoryVO() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(Integer categoryNo) {
        this.categoryNo = categoryNo;
    }

    public Integer getCategoryViewNo() {
        return categoryViewNo;
    }

    public void setCategoryViewNo(Integer categoryViewNo) {
        this.categoryViewNo = categoryViewNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer userNo;
        private Integer categoryNo;
        private Integer categoryViewNo;

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public Builder categoryNo(Integer categoryNo) {
            this.categoryNo = categoryNo;
            return this;
        }

        public Builder categoryViewNo(Integer categoryViewNo) {
            this.categoryViewNo = categoryViewNo;
            return this;
        }

        public ViewUserCategoryVO build() {
            ViewUserCategoryVO viewUserCategoryVO = new ViewUserCategoryVO();
            viewUserCategoryVO.userNo = this.userNo;
            viewUserCategoryVO.categoryNo = this.categoryNo;
            viewUserCategoryVO.categoryViewNo = this.categoryViewNo;
            return viewUserCategoryVO;
        }
    }
}
