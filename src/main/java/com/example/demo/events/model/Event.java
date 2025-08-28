package com.example.demo.events.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private int duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Guest> list;
}
