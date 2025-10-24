package com.ibmgduitama.demo.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_assignments")
public class EventAssignment {

    @EmbeddedId
    private EventAssignmentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("eventId")
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("memberId")
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    public EventAssignment() {
    }

    public EventAssignment(Event event, Member member) {
        this.event = event;
        this.member = member;
        this.id = new EventAssignmentId(event.getId(), member.getId());
    }

    // Getters and setters

    public EventAssignmentId getId() {
        return id;
    }

    public void setId(EventAssignmentId id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
