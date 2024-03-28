package com.hsocial.vn.entity.event;

import java.util.UUID;

import com.hsocial.vn.entity.ParticipantStatus;

public interface EventParticipant {
	Long getId();
    void setId(Long id);

    Long getEventId();
    void setEventId(Long eventId);

    UUID getUserId();
    void setUserId(UUID userId);

    ParticipantStatus getParticipationStatus();
    void setParticipationStatus(ParticipantStatus participationStatus);
}
