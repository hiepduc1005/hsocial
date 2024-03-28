package com.hsocial.vn.entity.user.impl;


import com.hsocial.vn.entity.user.Profile;
import com.hsocial.vn.entity.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class DefaultProfile implements Profile{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String profilePic;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}


	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return this.phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNum) {
		// TODO Auto-generated method stub
		this.phoneNumber = phoneNum;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}


	@Override
	public String getProfilePicture() {
		// TODO Auto-generated method stub
		return this.profilePic;
	}

	@Override
	public void setProfilePicture(String profilePicture) {
		// TODO Auto-generated method stub
		this.profilePic = profilePicture;
	}



	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return this.user;
	}

	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub
		this.user = user;
	}

}
