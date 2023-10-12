package com.bookmyshow.consumer.api.dto;


import lombok.Data;

@Data
public class BookingDetails {
    private String movieName;
    private String theatreName;
    private String showTime;
    private String seatNumbers;
    private String email;
    private String phoneNumber;
    private String movieId;
    private String theatreId;
    private String showId;
    private String userId;
    private String bookingId;
}
