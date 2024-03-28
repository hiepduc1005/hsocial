package com.hsocial.vn.entity.post;

import java.time.LocalDateTime;
import java.util.List;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.group.Group;
import com.hsocial.vn.entity.user.User;

public interface Post {
	Long getId();
    void setId(Long id);

    String getContent();
    void setContent(String content);

    LocalDateTime getTimestamp();
    void setTimestamp(LocalDateTime timestamp);

    List<String> getImageVideoUrls();
    void setImageVideoUrls(List<String> imageVideoUrls);
    
    void setUser(User user);
    User getUser();
    
    Group getGroup();
    void setGroup(Group group);
    
    List<Comment> getComments();
    void setComments(List<Comment> comments);
    
    List<PostReaction> getPostReactions();
    void setPostReactions(List<PostReaction> postReaction);
}
