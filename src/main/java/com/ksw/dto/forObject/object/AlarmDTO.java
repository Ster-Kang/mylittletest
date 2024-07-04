package com.ksw.dto.forObject.object;

import java.sql.Timestamp;

public class AlarmDTO {

    private Integer alarmNo;
    private String alarmNote;
    private Integer alarmType;
    private Boolean isRead;
    private Timestamp createdAt;

    // 기본 생성자
    public AlarmDTO() {}

    // Getters and Setters
    public Integer getAlarmNo() {
        return alarmNo;
    }

    public void setAlarmNo(Integer alarmNo) {
        this.alarmNo = alarmNo;
    }

    public String getAlarmNote() {
        return alarmNote;
    }

    public void setAlarmNote(String alarmNote) {
        this.alarmNote = alarmNote;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    
    // Builder 패턴
    public static class Builder {
        private Integer alarmNo;
        private String alarmNote;
        private Integer alarmType;
        private Boolean isRead;
        private Timestamp createdAt;

        public Builder alarmNo(Integer alarmNo) {
            this.alarmNo = alarmNo;
            return this;
        }

        public Builder alarmNote(String alarmNote) {
            this.alarmNote = alarmNote;
            return this;
        }

        public Builder alarmType(Integer alarmType) {
            this.alarmType = alarmType;
            return this;
        }

        public Builder isRead(Boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder createdAt(Timestamp createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public AlarmDTO build() {
            AlarmDTO alarmDTO = new AlarmDTO();
            alarmDTO.alarmNo = this.alarmNo;
            alarmDTO.alarmNote = this.alarmNote;
            alarmDTO.alarmType = this.alarmType;
            alarmDTO.isRead = this.isRead;
            alarmDTO.createdAt = this.createdAt;
            return alarmDTO;
        }
    }
}
