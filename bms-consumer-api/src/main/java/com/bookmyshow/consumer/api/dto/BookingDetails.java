package com.bookmyshow.consumer.api.dto;


import lombok.Data;

import java.util.List;

@Data
public class BookingDetails {
    private Long theatreId;
    private List<String> seatNumbers;
    private Long showId;
    private Long userId;
}
