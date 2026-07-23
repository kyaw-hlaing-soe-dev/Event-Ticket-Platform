package com.example.eventticketplatform.services;

import com.example.eventticketplatform.domain.CreateEventRequest;
import com.example.eventticketplatform.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event creatEvent(UUID organizerId, CreateEventRequest createEventRequest);
}
