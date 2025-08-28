package com.example.demo.events.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exposition extends Event{
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;
    private int duration;
    private String location;
    private String title;

    @ManyToMany
    private List<Guest> guests;
}
