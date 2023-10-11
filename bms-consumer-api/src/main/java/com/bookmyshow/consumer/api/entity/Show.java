package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "modified", nullable = false)
    private Date modified;

}
