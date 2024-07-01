package com.ksw.object.entity.jpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userNo;

    @Column(nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private Integer securityQuestion;

    @Column(nullable = false, length = 255)
    private String securityAnswer;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean isActive = true;

    @Column(columnDefinition = "INT DEFAULT 1")
    private Integer type = 1;

    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

	public Integer getUserNo() {
		return userNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getEmail() {
		return email;
	}

	public Integer getSecurityQuestion() {
		return securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public Integer getType() {
		return type;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSecurityQuestion(Integer securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}