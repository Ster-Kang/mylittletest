package com.ksw.object.entity.mybatis;

public class ReportManagement {

    private Integer userNo;
    private Integer managerNo;
    private Integer solverNo;

    // �⺻ ������
    public ReportManagement() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(Integer managerNo) {
        this.managerNo = managerNo;
    }

    public Integer getSolverNo() {
        return solverNo;
    }

    public void setSolverNo(Integer solverNo) {
        this.solverNo = solverNo;
    }
}
