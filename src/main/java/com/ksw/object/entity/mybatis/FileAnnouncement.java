package com.ksw.object.entity.mybatis;

public class FileAnnouncement {

    private Integer announcementNo;
    private Integer fileNo;

    // �⺻ ������
    public FileAnnouncement() {}

    // Getter �� Setter
    public Integer getAnnouncementNo() {
        return announcementNo;
    }

    public void setAnnouncementNo(Integer announcementNo) {
        this.announcementNo = announcementNo;
    }

    public Integer getFileNo() {
        return fileNo;
    }

    public void setFileNo(Integer fileNo) {
        this.fileNo = fileNo;
    }
}
