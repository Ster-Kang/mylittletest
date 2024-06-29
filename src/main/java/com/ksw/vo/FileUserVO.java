package com.ksw.vo;

public class FileUserVO {

    private Integer userNo;
    private Integer fileNo;

    // �⺻ ������
    public FileUserVO() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getFileNo() {
        return fileNo;
    }

    public void setFileNo(Integer fileNo) {
        this.fileNo = fileNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer userNo;
        private Integer fileNo;

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public Builder fileNo(Integer fileNo) {
            this.fileNo = fileNo;
            return this;
        }

        public FileUserVO build() {
            FileUserVO fileUserVO = new FileUserVO();
            fileUserVO.userNo = this.userNo;
            fileUserVO.fileNo = this.fileNo;
            return fileUserVO;
        }
    }
}
