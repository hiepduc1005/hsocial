package com.hsocial.vn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsocial.vn.entity.post.Post;

public interface PostDao extends JpaRepository<Post,Long>{

}
