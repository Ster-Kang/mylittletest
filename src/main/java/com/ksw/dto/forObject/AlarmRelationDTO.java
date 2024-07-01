package com.ksw.dto.forObject;

public class AlarmRelationDTO {

    private Integer alarmNo;
    private Integer userNo;
    private Integer makerNo;

    // �⺻ ������
    public AlarmRelationDTO() {}

    // Getter �� Setter
    public Integer getAlarmNo() {
        return alarmNo;
    }

    public void setAlarmNo(Integer alarmNo) {
        this.alarmNo = alarmNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getMakerNo() {
        return makerNo;
    }

    public void setMakerNo(Integer makerNo) {
        this.makerNo = makerNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer alarmNo;
        private Integer userNo;
        private Integer makerNo;

        public Builder alarmNo(Integer alarmNo) {
            this.alarmNo = alarmNo;
            return this;
        }

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public Builder makerNo(Integer makerNo) {
            this.makerNo = makerNo;
            return this;
        }

        public AlarmRelationDTO build() {
            AlarmRelationDTO alarmRelationDTO = new AlarmRelationDTO();
            alarmRelationDTO.alarmNo = this.alarmNo;
            alarmRelationDTO.userNo = this.userNo;
            alarmRelationDTO.makerNo = this.makerNo;
            return alarmRelationDTO;
        }
    }
}