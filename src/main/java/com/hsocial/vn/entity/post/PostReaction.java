package com.hsocial.vn.entity.post;

import com.hsocial.vn.entity.ReactionType;
import com.hsocial.vn.entity.user.User;

public interface PostReaction {
	
	Long getId();
	void setId(Long id);
	
	Post getPost();
	void setPost(Post post);
	
	User getUser();
	void setUser(User user);
	
	ReactionType getReactionType();
	void setReactionType(ReactionType reactionType);
}
