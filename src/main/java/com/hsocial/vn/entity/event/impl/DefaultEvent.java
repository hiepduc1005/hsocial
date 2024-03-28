package com.hsocial.vn.entity.event.impl;

import java.time.LocalDate;

import com.hsocial.vn.entity.event.Event;

public class DefaultEvent implements Event {

    private Long id;
    private String name;
    private String description;
    private String location;
    private LocalDate date;
    private String eventPicture;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String getEventPicture() {
        return eventPicture;
    }

    @Override
    public void setEventPicture(String eventPicture) {
        this.eventPicture = eventPicture;
    }
}
