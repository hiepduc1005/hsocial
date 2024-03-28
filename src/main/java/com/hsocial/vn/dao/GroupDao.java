package com.hsocial.vn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsocial.vn.entity.group.Group;

public interface GroupDao extends JpaRepository<Group,Long>{

}
