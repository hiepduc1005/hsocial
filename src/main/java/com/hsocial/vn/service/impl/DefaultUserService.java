package com.hsocial.vn.service.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsocial.vn.dao.UserDao;
import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.user.Profile;
import com.hsocial.vn.entity.user.User;
import com.hsocial.vn.exception.UserLoginException;
import com.hsocial.vn.service.UserService;

@Service
public class DefaultUserService implements UserService{
	
	private static Logger logger = LoggerFactory.getLogger(DefaultUserService.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public User saveUser(User user) {
		String email = user.getEmail();
		
		if(user)
		
		if(user == null) {
			throw new UserLoginException("")
		}
		
		if(email == null || email.isEmpty()) {
			throw new UserLoginException("Email is empty");
		}
		
		User userSaved  = userDao.save(user);
		return user2;
	}

	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(UUID userUuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profile getUserProfile(UUID userUuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getUserProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateUserProfile(UUID userId, Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateUserProfile(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFriend(UUID userId, UUID userFriendId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFriendByAuthenticatedUser(UUID userFriendId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFriend(UUID userId, UUID userFriendId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFriendByAuthenticatedUser(UUID userFriendId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post createPost(Post post, UUID userUuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Long postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(Long postId, UUID userUuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void likePost(Long postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void likePost(Long postId, UUID userUuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment commentOnPost(Comment comment, Long postId, UUID userUuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment commentOnPost(Comment comment, Long postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUser(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
