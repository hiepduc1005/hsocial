package com.hsocial.vn.entity.group;

import java.util.List;

import com.hsocial.vn.entity.post.Post;

public interface Group {
	Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    String getDescription();
    void setDescription(String description);

    String getGroupPicture();
    void setGroupPicture(String groupPicture);
    
    List<Post> getGroupPosts();
    void setGroupPosts(List<Post> groupPosts);
    
    List<GroupMember> getGroupMembers();
    void setGroupMembers(List<GroupMember> groupMembers);
}
