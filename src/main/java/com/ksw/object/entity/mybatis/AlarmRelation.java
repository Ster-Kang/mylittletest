package com.ksw.object.entity.mybatis;

public class AlarmRelation {

    private Integer alarmNo;
    private Integer userNo;
    private Integer makerNo;

    // �⺻ ������
    public AlarmRelation() {}

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
}
