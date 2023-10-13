package com.bookmyshow.consumer.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    @JoinColumn(name = "bookingid")
    private Bookings bookings;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "showid")
    private Show show;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "seatid")
    private TheatreSeat theatreSeat;

    public SeatBookings(TheatreSeat seat, Show show) {
        this.theatreSeat = seat;
        this.show = show;
    }

    @Override
    public String toString() {
        return "SeatBookings{" +
                "seatBookingId=" + seatBookingId +
                ", bookings=" + bookings +
                ", show=" + show +
                ", theatreSeat=" + theatreSeat +
                '}';
    }
}