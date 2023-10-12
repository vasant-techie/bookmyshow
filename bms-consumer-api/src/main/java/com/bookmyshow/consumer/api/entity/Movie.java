package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "movies", schema = "bms")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieid")
    private Long movieId;

    @Column(name = "moviename", length = 50, nullable = false)
    private String movieName;

    @Column(name = "description", length = 400, nullable = false)
    private String description;

    @Column(name = "language", length = 80, nullable = false)
    private String language;

    @Column(name = "director", length = 80, nullable = false)
    private String director;

    @Column(name = "casting", length = 400, nullable = false)
    private String cast;

    @Column(name = "genre", length = 45, nullable = false)
    private String genre;

    @Column(name = "releasedate", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "modified", nullable = false)
    private LocalDateTime modified;

}
