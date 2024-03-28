package com.hsocial.vn.entity.post.impl;

import com.hsocial.vn.entity.ReactionType;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.post.PostReaction;
import com.hsocial.vn.entity.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "post_reaction")
public class DefaultPostReaction implements PostReaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
    private Post post;
	
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
    public ReactionType getReactionType() {
        return reactionType;
    }

    @Override
    public void setReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
    }
}
