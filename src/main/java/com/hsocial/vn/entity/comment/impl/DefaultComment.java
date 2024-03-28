package com.hsocial.vn.entity.comment.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.comment.CommentReaction;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class DefaultComment implements Comment {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
    private Post post;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
    private User user;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "comment" , orphanRemoval = true)
    private List<CommentReaction> commentReactions;
	
    private String content;
    
    private LocalDateTime timestamp;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Post getPost() {
        return post;
    }

    @Override
    public void setPost(Post post) {
        this.post = post;
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
    public List<CommentReaction> getCommentReactions() {
        return commentReactions;
    }

    @Override
    public void setCommentReactions(List<CommentReaction> commentReactions) {
        this.commentReactions = commentReactions;
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
}
