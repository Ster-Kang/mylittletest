package com.ksw.object.entity.mybatis;

public class ReplyUser {

    private Integer userNo;
    private Integer replyNo;

    // �⺻ ������
    public ReplyUser() {}

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
}
