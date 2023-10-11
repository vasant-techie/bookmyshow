package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "bookings", schema = "bms")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingid")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "showid")
    private Show show;

    @ManyToOne
    @JoinColumn(name = "userid")
    private Customer user;

    @Column(name = "seats", nullable = false)
    private int seats;

    @Column(name = "bookingdate", nullable = false)
    private Date bookingDate;

    @Column(name = "amount", nullable = false)
    private int amount;

    // Constructors, getters, and setters
}
