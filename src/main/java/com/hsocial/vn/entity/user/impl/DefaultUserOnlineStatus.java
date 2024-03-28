package com.hsocial.vn.entity.user.impl;

import com.hsocial.vn.entity.user.User;
import com.hsocial.vn.entity.user.UserOnlineStatus;
import com.hsocial.vn.entity.user.UserStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_online_status")
public class DefaultUserOnlineStatus implements UserOnlineStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
    private User user;
	
	@Enumerated(EnumType.STRING)
    private UserStatus userOnlineStatus;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public UserStatus getUserOnlineStatus() {
        return userOnlineStatus;
    }

    @Override
    public void setUserOnlineStatus(UserStatus status) {
        this.userOnlineStatus = status;
    }
}

