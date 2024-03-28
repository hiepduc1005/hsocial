package com.hsocial.vn.entity.user;


public interface Profile {
	
	Long getId();
    void setId(Long id);

    User getUser();
    void setUser(User user);

    String getFirstName();
    void setFirstName(String firstName);
    
    String getPhoneNumber();
    void setPhoneNumber(String phoneNum);

    String getLastName();
    void setLastName(String lastName);

    String getProfilePicture();
    void setProfilePicture(String profilePicture);

    
}
