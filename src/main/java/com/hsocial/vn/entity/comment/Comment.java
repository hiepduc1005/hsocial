package com.hsocial.vn.entity.comment;

import java.time.LocalDateTime;
import java.util.List;

import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.user.User;

public interface Comment {
	
	Long getId();
    void setId(Long id);
    
    Post getPost();
    void setPost(Post post);

    User getUser();
    void setUser(User user);
    
    List<CommentReaction> getCommentReactions();
    void setCommentReactions(List<CommentReaction> commentReactions);

    String getContent();
    void setContent(String content);

    LocalDateTime getTimestamp();
    void setTimestamp(LocalDateTime timestamp);
}
