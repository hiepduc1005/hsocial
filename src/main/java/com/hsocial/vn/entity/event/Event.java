package com.hsocial.vn.entity.event;

import java.time.LocalDate;

public interface Event {
	Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    String getDescription();
    void setDescription(String description);

    String getLocation();
    void setLocation(String location);

    LocalDate getDate();
    void setDate(LocalDate date);

    String getEventPicture();
    void setEventPicture(String eventPicture);
    
    
}
