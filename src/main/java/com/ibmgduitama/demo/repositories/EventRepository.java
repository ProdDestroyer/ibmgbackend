package com.ibmgduitama.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibmgduitama.demo.models.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
