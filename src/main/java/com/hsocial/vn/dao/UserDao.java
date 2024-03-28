package com.hsocial.vn.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hsocial.vn.entity.user.User;

	
	public interface UserDao extends JpaRepository<User, UUID>{
		
		@Query("SELECT u FROM User u WHERE u.email = :email")
		User getUserByEmail(@Param("email") String email);
		
		@Query("SELECT * FROM user WHERE username LIKE")
		List<User> searchUser(@Param("searchQuery") String searchQuery);

	}
