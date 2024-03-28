package com.hsocial.vn.entity.user;


public interface UserOnlineStatus {
	Long getId();
	void setId(Long id);
	
	User getUser();
	void setUser(User user);
	
	UserStatus getUserOnlineStatus();
	void setUserOnlineStatus(UserStatus status);
	
}
