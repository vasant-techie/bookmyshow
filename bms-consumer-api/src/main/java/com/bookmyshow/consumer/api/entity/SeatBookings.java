package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seatbookings", schema = "bms")
@NoArgsConstructor
public class SeatBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatbookingid", nullable = false)
    private Long seatBookingId;

    @ManyToOne
    @JoinColumn(name = "bookingid")
    private Bookings bookings;

    @ManyToOne
    @JoinColumn(name = "showid")
    private Show show;
    @OneToOne
    @JoinColumn(name = "seatid")
    private TheatreSeat theatreSeat;

    public SeatBookings(TheatreSeat seat, Show show) {
        this.theatreSeat = seat;
        this.show = show;
    }
}