package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Getter
@Setter
@Entity
@Table(name = "theatres", schema = "bms")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatreid")
    private Long theatreId;

    @Column(name = "theatrename", length = 60, nullable = false)
    private String theatreName;

    @Column(name = "address", length = 500, nullable = false)
    private String address;

    @Column(name = "city", length = 45, nullable = false)
    private String city;

    @Column(name = "state", length = 45, nullable = false)
    private String state;

    @Column(name = "pincode", nullable = false)
    private int pincode;

    @OneToMany(targetEntity = TheatreSeat.class, cascade = ALL, mappedBy = "theatre", fetch = FetchType.LAZY)
    private List<TheatreSeat> theatreSeats;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "modified", nullable = false)
    private Date modified;

}
