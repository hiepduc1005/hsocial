package com.hsocial.vn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsocial.vn.entity.user.Profile;

public interface UserProfileDao extends JpaRepository<Profile, Long>{

}
