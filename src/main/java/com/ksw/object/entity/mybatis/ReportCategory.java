package com.ksw.object.entity.mybatis;

public class ReportCategory {

    private Integer userNo;
    private Integer categoryNo;
    private Integer reportNo;

    // �⺻ ������
    public ReportCategory() {}

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

    public Integer getReportNo() {
        return reportNo;
    }

    public void setReportNo(Integer reportNo) {
        this.reportNo = reportNo;
    }
}
