package com.ksw.vo;

public class AnnouncementUserVO {

    private Integer announcementNo;
    private Integer userNo;

    // �⺻ ������
    public AnnouncementUserVO() {}

    // Getter �� Setter
    public Integer getAnnouncementNo() {
        return announcementNo;
    }

    public void setAnnouncementNo(Integer announcementNo) {
        this.announcementNo = announcementNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer announcementNo;
        private Integer userNo;

        public Builder announcementNo(Integer announcementNo) {
            this.announcementNo = announcementNo;
            return this;
        }

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public AnnouncementUserVO build() {
            AnnouncementUserVO announcementUserVO = new AnnouncementUserVO();
            announcementUserVO.announcementNo = this.announcementNo;
            announcementUserVO.userNo = this.userNo;
            return announcementUserVO;
        }
    }
}
