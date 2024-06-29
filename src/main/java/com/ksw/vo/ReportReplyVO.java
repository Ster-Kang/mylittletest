package com.ksw.vo;

public class ReportReplyVO {

    private Integer userNo;
    private Integer replyNo;
    private Integer reportNo;

    // �⺻ ������
    public ReportReplyVO() {}

    // Getter �� Setter
    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getReplyNo() {
        return replyNo;
    }

    public void setReplyNo(Integer replyNo) {
        this.replyNo = replyNo;
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
        private Integer replyNo;
        private Integer reportNo;

        public Builder userNo(Integer userNo) {
            this.userNo = userNo;
            return this;
        }

        public Builder replyNo(Integer replyNo) {
            this.replyNo = replyNo;
            return this;
        }

        public Builder reportNo(Integer reportNo) {
            this.reportNo = reportNo;
            return this;
        }

        public ReportReplyVO build() {
            ReportReplyVO replyReportVO = new ReportReplyVO();
            replyReportVO.userNo = this.userNo;
            replyReportVO.replyNo = this.replyNo;
            replyReportVO.reportNo = this.reportNo;
            return replyReportVO;
        }
    }
}
