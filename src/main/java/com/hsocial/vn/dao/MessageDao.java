package com.hsocial.vn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsocial.vn.entity.message.Message;

public interface MessageDao extends JpaRepository<Message, Long>{

}
