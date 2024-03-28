package com.hsocial.vn.entity.group;


import com.hsocial.vn.entity.user.User;

public interface GroupMember {
	Long getId();
    void setId(Long id);

    Group getGroup();
    void setGroup(Group group);
    
    User getUserMember();
    void setUserMember(User userMember);

    GroupRole getGroupRole();
    void setGroupRole(GroupRole groupRole);
}
