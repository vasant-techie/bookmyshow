package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "shows", schema = "bms")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showid")
    private Long showId;

    @ManyToOne
    @JoinColumn(name = "theatreid")
    private Theatre theatre;

    @ManyToOne
    @JoinColumn(name = "movieid")
    private Movie movie;

    @Column(name = "enabled", nullable = false)
    private int enabled;

    @Column(name = "ticketcost", nullable = false)
    private int ticketCost;

    @Column(name = "showtime", nullable = false)
    private LocalTime showTime;

    @Column(name = "startdate", nullable = false)
    private LocalDate startDate;

    @Column(name = "enddate", nullable = false)
    private LocalDate endDate;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "modified", nullable = false)
    private LocalDateTime modified;

}
