package com.bookmyshow.consumer.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "bms")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "userid", nullable = false)
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isEnabled;
    private String email;
    private String mobile;
    private String address;
    @Column(name = "created")
    private LocalDateTime createdOn;
    @Column(name = "modified")
    private LocalDateTime lastModifiedOn;

}