package com.hsocial.vn.service;

import java.util.List;
import java.util.UUID;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.user.Profile;
import com.hsocial.vn.entity.user.User;

public interface UserService {
	
	User saveUser(User user);
	
	User login(String userName , String password);
	
	User updateUser(User user);

	void deleteUser(UUID userUuid);
	
	Profile getUserProfile(UUID userUuid);
	
	Profile getUserProfile();
	
	Profile updateUserProfile(UUID userId , Profile profile);
	
	Profile updateUserProfile(Profile profile);
		
	List<User> getAllUsers();
	
	User getUserByEmail();
	
	void addFriend(UUID userId , UUID userFriendId);
	
	void addFriendByAuthenticatedUser(UUID userFriendId);
	
	void removeFriend(UUID userId , UUID userFriendId);
	
	void removeFriendByAuthenticatedUser(UUID userFriendId);
	
	Post createPost(Post post);
	
	Post createPost(Post post , UUID userUuid);
	
	void deletePost(Long postId);
	
	void deletePost(Long postId , UUID userUuid);
	
	void likePost(Long postId);
	
	void likePost(Long postId , UUID userUuid);
	
	Comment commentOnPost(Comment comment , Long postId , UUID userUuid);
	
	Comment commentOnPost(Comment comment , Long postId);
	
	User searchUser(String keyword);
}
