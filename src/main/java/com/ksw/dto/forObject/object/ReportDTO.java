package com.ksw.dto.forObject.object;

import java.sql.Timestamp;

public class ReportDTO {

    private Integer reportNo;
    private Integer reportType;
    private String reportNote;
    private Integer solvedType;
    private Timestamp createdAt;
    private Timestamp solvedAt;

    // �⺻ ������
    public ReportDTO() {}

    // Getters and Setters
    public Integer getReportNo() {
        return reportNo;
    }

    public void setReportNo(Integer reportNo) {
        this.reportNo = reportNo;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportNote() {
        return reportNote;
    }

    public void setReportNote(String reportNote) {
        this.reportNote = reportNote;
    }

    public Integer getSolvedType() {
        return solvedType;
    }

    public void setSolvedType(Integer solvedType) {
        this.solvedType = solvedType;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getSolvedAt() {
        return solvedAt;
    }

    public void setSolvedAt(Timestamp solvedAt) {
        this.solvedAt = solvedAt;
    }
    // Builder Ŭ����
    public static class Builder {
        private Integer reportNo;
        private Integer reportType;
        private String reportNote;
        private Integer solvedType;
        private Timestamp createdAt;
        private Timestamp solvedAt;

        public Builder reportNo(Integer reportNo) {
            this.reportNo = reportNo;
            return this;
        }

        public Builder reportType(Integer reportType) {
            this.reportType = reportType;
            return this;
        }

        public Builder reportNote(String reportNote) {
            this.reportNote = reportNote;
            return this;
        }

        public Builder solvedType(Integer solvedType) {
            this.solvedType = solvedType;
            return this;
        }

        public Builder createdAt(Timestamp createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder solvedAt(Timestamp solvedAt) {
            this.solvedAt = solvedAt;
            return this;
        }

        public ReportDTO build() {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.reportNo = this.reportNo;
            reportDTO.reportType = this.reportType;
            reportDTO.reportNote = this.reportNote;
            reportDTO.solvedType = this.solvedType;
            reportDTO.createdAt = this.createdAt;
            reportDTO.solvedAt = this.solvedAt;
            return reportDTO;
        }
    }
}
