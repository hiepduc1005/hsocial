package com.hsocial.vn.entity.user;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.post.Post;

public interface User {
	void setId(UUID id);
	UUID getId();
	
	String getUsername();
    void setUsername(String username);

    String getPassword();
    void setPassword(String password);

    String getEmail();
    void setEmail(String email);

    LocalDate getDateOfBirth();
    void setDateOfBirth(LocalDate dateOfBirth);
    
    void setPosts(List<Post> posts);
    List<Post> getPosts();
    
    void setComments(List<Comment> comments);
    List<Comment> getComments();
    
    void setProfile(Profile profile);
    Profile getProfile();
    
    void setRoles(List<UserRole> roles);
    List<UserRole> getRoles();
    
}
