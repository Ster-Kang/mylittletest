package com.ksw.dto;

import java.sql.Timestamp;

public class FavoriteDTO {

    private Integer favoriteNo;
    private Timestamp createdAt;

    // �⺻ ������
    public FavoriteDTO() {}

    // Getters and Setters
    public Integer getFavoriteNo() {
        return favoriteNo;
    }

    public void setFavoriteNo(Integer favoriteNo) {
        this.favoriteNo = favoriteNo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
