package com.hsocial.vn.entity.message.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import com.hsocial.vn.entity.message.Message;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "message")
public class DefaultMessage implements Message{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column(name = "user_sender")
	private UUID userSender;
	
	@Column(name = "user_recived")
	private UUID userRecived;
	
	private String content;
	
	private LocalDateTime timestamp;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public UUID getUserSenderUuid() {
		// TODO Auto-generated method stub
		return this.userSender;
	}

	@Override
	public void setUserSenderUuid(UUID userSender) {
		// TODO Auto-generated method stub
		this.userSender = userSender;
	}

	@Override
	public UUID getReceiverUserUuid() {
		// TODO Auto-generated method stub
		return this.userRecived;
	}

	@Override
	public void setReceiverUserUuid(UUID receiverUser) {
		// TODO Auto-generated method stub
		this.userRecived = receiverUser;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return this.content;
	}

	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}

	@Override
	public LocalDateTime getTimestamp() {
		// TODO Auto-generated method stub
		return this.timestamp;
	}

	@Override
	public void setTimestamp(LocalDateTime timestamp) {
		// TODO Auto-generated method stub
		this.timestamp = timestamp;
	}

}
