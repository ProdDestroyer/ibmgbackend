package com.ibmgduitama.demo.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EventAssignmentId implements Serializable {

    private Integer eventId;

    private Integer memberId;

    public EventAssignmentId() {
    }

    public EventAssignmentId(Integer eventId, Integer memberId) {
        this.eventId = eventId;
        this.memberId = memberId;
    }

    // Getters and setters

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    // Override equals and hashCode — very important for composite keys

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventAssignmentId)) return false;
        EventAssignmentId that = (EventAssignmentId) o;
        return Objects.equals(eventId, that.eventId) && Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, memberId);
    }
}
