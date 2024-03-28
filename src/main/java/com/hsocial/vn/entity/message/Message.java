package com.hsocial.vn.entity.message;

import java.time.LocalDateTime;
import java.util.UUID;


public interface Message {
	    Long getId();
	    void setId(Long id);

	    UUID getUserSenderUuid();
	    void setUserSenderUuid(UUID userSender);

	    UUID getReceiverUserUuid();
	    void setReceiverUserUuid(UUID receiverUser);

	    String getContent();
	    void setContent(String content);

	    LocalDateTime getTimestamp();
	    void setTimestamp(LocalDateTime timestamp);
}
