package com.hsocial.vn.entity.user;

import java.time.LocalDate;
import java.util.UUID;

public interface Friendship {
	Long getId();
    void setId(Long id);

    UUID getUser1Id();
    void setUser1Id(UUID user1Id);

    UUID getUser2Id();
    void setUser2Id(UUID user2Id);

    LocalDate getFriendshipDate();
    void setFriendshipDate(LocalDate friendshipDate);
}
