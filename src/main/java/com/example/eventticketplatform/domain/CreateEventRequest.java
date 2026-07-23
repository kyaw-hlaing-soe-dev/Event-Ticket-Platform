package com.example.eventticketplatform.domain;

import com.example.eventticketplatform.domain.entities.EventStatusEnum;
import com.example.eventticketplatform.domain.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEventRequest {

    private String name;
    private LocalDateTime start;
    private LocalDateTime end;
    private String description;
    private String venue;
    private LocalDateTime startSales;
    private LocalDateTime endSales;
    private EventStatusEnum status;
    private List<CreateTicketTypeRequest> ticketTypes = new ArrayList<>();

}