package com.hsocial.vn.entity.user.impl;

import java.time.LocalDate;
import java.util.UUID;

import com.hsocial.vn.entity.user.Friendship;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "friendship")
@Entity
public class DefaultFriendship implements Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user1_id", columnDefinition = "BINARY(16)")
    private UUID user1Id;

    @Column(name = "user2_id", columnDefinition = "BINARY(16)")
    private UUID user2Id;

    @Column(name = "friendship_date")
    private LocalDate friendshipDate;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public UUID getUser1Id() {
        return user1Id;
    }

    @Override
    public void setUser1Id(UUID user1Id) {
        this.user1Id = user1Id;
    }

    @Override
    public UUID getUser2Id() {
        return user2Id;
    }

    @Override
    public void setUser2Id(UUID user2Id) {
        this.user2Id = user2Id;
    }

    @Override
    public LocalDate getFriendshipDate() {
        return friendshipDate;
    }

    @Override
    public void setFriendshipDate(LocalDate friendshipDate) {
        this.friendshipDate = friendshipDate;
    }
}
