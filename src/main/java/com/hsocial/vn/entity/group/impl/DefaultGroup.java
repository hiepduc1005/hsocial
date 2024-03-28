package com.hsocial.vn.entity.group.impl;

import java.util.List;

import com.hsocial.vn.entity.group.Group;
import com.hsocial.vn.entity.group.GroupMember;
import com.hsocial.vn.entity.post.Post;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "group")
public class DefaultGroup implements Group {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
	
    private String name;
    
    private String description;
    
    @Column(name = "group_picture")
    private String groupPicture;
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "group" , orphanRemoval = true)
    private List<GroupMember> groupMembers;
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "group" , orphanRemoval = true)
    private List<Post> groupPosts;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getGroupPicture() {
        return groupPicture;
    }

    @Override
    public void setGroupPicture(String groupPicture) {
        this.groupPicture = groupPicture;
    }

    @Override
    public List<GroupMember> getGroupMembers() {
        return groupMembers;
    }

    @Override
    public void setGroupMembers(List<GroupMember> groupMembers) {
        this.groupMembers = groupMembers;
    }

    @Override
    public List<Post> getGroupPosts() {
        return groupPosts;
    }

    @Override
    public void setGroupPosts(List<Post> groupPosts) {
        this.groupPosts = groupPosts;
    }
}
