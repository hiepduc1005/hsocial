package com.hsocial.vn.entity.user.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.hsocial.vn.entity.comment.Comment;
import com.hsocial.vn.entity.comment.CommentReaction;
import com.hsocial.vn.entity.group.GroupMember;
import com.hsocial.vn.entity.post.Post;
import com.hsocial.vn.entity.post.PostReaction;
import com.hsocial.vn.entity.user.Profile;
import com.hsocial.vn.entity.user.User;
import com.hsocial.vn.entity.user.UserOnlineStatus;
import com.hsocial.vn.entity.user.UserRole;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "user")
public class DefaultUser implements User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	
	@Column(name = "username")
	private String userName;
	
	private String password;
	
	private String email;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@OneToMany(
			cascade = CascadeType.ALL ,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private List<Post> posts;
	
	@OneToMany(
			cascade = CascadeType.ALL ,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private List<Comment> comments;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private Profile profile;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private UserOnlineStatus userOnlineStatus;
	
	@OneToMany(
			cascade = CascadeType.ALL ,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private List<PostReaction> postReactions;
	
	@OneToMany(
			cascade = CascadeType.ALL ,
			orphanRemoval = true ,
			mappedBy = "user"
			)
	private List<CommentReaction> commentReactions;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "userMember" , orphanRemoval = true)
	private List<GroupMember> groupMembers;
	
	@ElementCollection(targetClass = UserRole.class)
	@CollectionTable(name = "users_roles" , joinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	private List<UserRole> roles;
	
	@Override
	public void setId(UUID id) {
		this.uuid = id;
	}

	@Override
	public UUID getId() {
		return this.uuid;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public void setUsername(String username) {
		this.userName = username;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public List<Post> getPosts() {
		return this.posts;
	}

	@Override
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public List<Comment> getComments() {
		return this.comments;
	}

	@Override
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public Profile getProfile() {
		return this.profile;
	}

	@Override
	public void setRoles(List<UserRole> roles) {
		// TODO Auto-generated method stub
		this.roles = roles;
	}

	@Override
	public List<UserRole> getRoles() {
		// TODO Auto-generated method stub
		return this.roles;
	}

	
}
