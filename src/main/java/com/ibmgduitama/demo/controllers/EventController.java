package com.ibmgduitama.demo.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibmgduitama.demo.models.Event;
import com.ibmgduitama.demo.services.EventService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    public HashMap<String, String> sayHello() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot!");
        return response;
    }

    @PostMapping
    public Event createEvent(@Valid @RequestBody Event event) {
        System.out.println("you hit me with: " + event);
        return eventService.createEvent(event);
    }
}
