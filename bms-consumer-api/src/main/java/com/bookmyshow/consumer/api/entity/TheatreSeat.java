package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "theatreseats", schema = "bms")
@Getter
@Setter
public class TheatreSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatid")
    private Long seatId;

    @ManyToOne(targetEntity = Theatre.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "theatreid")
    private Theatre theatre;

    @Column(name = "seatno")
    private String seatNumber;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;
}