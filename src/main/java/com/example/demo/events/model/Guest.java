package com.example.demo.events.model;

import com.example.demo.events.enums.GuestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;
}
