package com.hsocial.vn.entity.post.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.group.Group;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.post.PostReaction;
import com.hsocial.vn.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class DefaultPost implements Post {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
	
    private String content;
    
    private LocalDateTime timestamp;
    
    @Column(name = "image_video_url")
    private List<String> imageVideoUrls;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @OneToMany(
    		cascade = CascadeType.ALL ,
    		mappedBy = "post" ,
    		orphanRemoval = true
    		)
    private List<Comment> comments;
    
    @OneToMany(
    		cascade = CascadeType.ALL,
    		mappedBy = "post" ,
    		orphanRemoval = true
    		)
    private List<PostReaction> postReactions;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public List<String>  getImageVideoUrls() {
        return imageVideoUrls;
    }

    @Override
    public void setImageVideoUrls(List<String>  imageVideoUrl) {
        this.imageVideoUrls = imageVideoUrl;
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
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public List<PostReaction> getPostReactions() {
        return postReactions;
    }

    @Override
    public void setPostReactions(List<PostReaction> postReactions) {
        this.postReactions = postReactions;
    }

	@Override
	public Group getGroup() {
		// TODO Auto-generated method stub
		return this.group;
	}

	@Override
	public void setGroup(Group group) {
		// TODO Auto-generated method stub
		this.group = group;
	}
}
