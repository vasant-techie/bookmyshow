package com.bookmyshow.consumer.api.endpoints;

import com.bookmyshow.consumer.api.dto.BookingDetails;
import com.bookmyshow.consumer.api.entity.Bookings;
import com.bookmyshow.consumer.api.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingService bookingService;

    @Autowired(required = true)
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @RequestMapping(path = "/book-seats", method = RequestMethod.POST)
    public ResponseEntity<Bookings> bookSeats(@RequestBody BookingDetails bookingDetails) {
        Bookings bookings = bookingService.bookSeats(bookingDetails);
        return ResponseEntity.status(201).body(bookings);
    }
}
