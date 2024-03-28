package com.hsocial.vn.entity.comment.impl;

import com.hsocial.vn.entity.ReactionType;
import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.comment.CommentReaction;
import com.hsocial.vn.entity.user.User;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class DefaultCommentReaction implements CommentReaction {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "comment_id")
    private Comment comment;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
    private User user;
	
	@Enumerated(EnumType.STRING)
    private ReactionType reactionType;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Comment getComment() {
        return comment;
    }

    @Override
    public void setComment(Comment comment) {
        this.comment = comment;
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
    public ReactionType getReactionType() {
        return reactionType;
    }

    @Override
    public void setReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
    }
}
