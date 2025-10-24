package com.ibmgduitama.demo.services;

import org.springframework.stereotype.Service;

import com.ibmgduitama.demo.models.Event;
import com.ibmgduitama.demo.repositories.EventRepository;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
}
