package com.bookmyshow.consumer.api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bookings", schema = "bms")
@NoArgsConstructor
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingid")
    private Long bookingId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "showid")
    private Show show;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "userid")
    private Customer user;

    @Transient
    @JsonManagedReference
    @OneToMany(mappedBy = "bookings", cascade = CascadeType.ALL)
    private List<SeatBookings> seatBookings;

    @Column(name = "bookingdate", nullable = false)
    private LocalDate bookingDate;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "modified", nullable = false)
    private LocalDateTime modified;

    public Bookings(Show show, Customer user, List<SeatBookings> seatBookings) {
        this.show = show;
        this.user = user;
        this.bookingDate = LocalDate.now();
        this.amount = show.getTicketCost() * seatBookings.size();
        this.seatBookings = seatBookings;
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", show=" + show +
                ", user=" + user +
                ", seatBookings=" + seatBookings +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
