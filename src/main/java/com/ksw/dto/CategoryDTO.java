package com.ksw.dto;

import java.sql.Timestamp;

public class CategoryDTO {

    private Integer categoryNo;
    private String categoryTitle;
    private Boolean isActive;
    private Timestamp createdAt;

    // �⺻ ������
    public CategoryDTO() {}

    // Getters and Setters
    public Integer getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(Integer categoryNo) {
        this.categoryNo = categoryNo;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
