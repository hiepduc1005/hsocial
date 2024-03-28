package com.hsocial.vn.entity.group.impl;

import com.hsocial.vn.entity.group.Group;
import com.hsocial.vn.entity.group.GroupMember;
import com.hsocial.vn.entity.group.GroupRole;
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
@Table(name = "group_member")
public class DefaultGroupMember implements GroupMember {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "group_id")
    private Group group;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
    private User userMember;
	
	@Enumerated(EnumType.STRING)
    private GroupRole groupRole;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Group getGroup() {
        return group;
    }

    @Override
    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public User getUserMember() {
        return userMember;
    }

    @Override
    public void setUserMember(User userMember) {
        this.userMember = userMember;
    }

    @Override
    public GroupRole getGroupRole() {
        return groupRole;
    }

    @Override
    public void setGroupRole(GroupRole groupRole) {
        this.groupRole = groupRole;
    }
}
