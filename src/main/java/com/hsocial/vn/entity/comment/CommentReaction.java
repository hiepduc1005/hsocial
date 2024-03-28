package com.hsocial.vn.entity.comment;

import com.hsocial.vn.entity.ReactionType;
import com.hsocial.vn.entity.user.User;

public interface CommentReaction {
	Long getId();
	void setId(Long id);
	
	Comment getComment();
	void setComment(Comment comment);
	
	User getUser();
	void setUser(User user);
	
	ReactionType getReactionType();
	void setReactionType(ReactionType reactionType);
}
