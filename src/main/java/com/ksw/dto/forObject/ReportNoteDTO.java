package com.ksw.dto.forObject;

public class ReportNoteDTO {

    private Integer userNo;
    private Integer noteNo;
    private Integer reportNo;

    // �⺻ ������
    public ReportNoteDTO() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(Integer noteNo) {
        this.noteNo = noteNo;
    }

    public Integer getReportNo() {
        return reportNo;
    }

    public void setReportNo(Integer reportNo) {
        this.reportNo = reportNo;
    }

    // ���� ���� ����
    public static class Builder {
        private Integer userNo;
        private Integer noteNo;
        private Integer reportNo;

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public Builder noteNo(Integer noteNo) {
            this.noteNo = noteNo;
            return this;
        }

        public Builder reportNo(Integer reportNo) {
            this.reportNo = reportNo;
            return this;
        }

        public ReportNoteDTO build() {
            ReportNoteDTO reportNoteDTO = new ReportNoteDTO();
            reportNoteDTO.userNo = this.userNo;
            reportNoteDTO.noteNo = this.noteNo;
            reportNoteDTO.reportNo = this.reportNo;
            return reportNoteDTO;
        }
    }
}
