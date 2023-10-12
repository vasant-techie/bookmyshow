package com.bookmyshow.consumer.api.endpoints;

import com.bookmyshow.consumer.api.entity.Booking;
import com.bookmyshow.consumer.api.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(path = "/book-seats/${city}/${moviename}/${showdate}/${showtime}", method = RequestMethod.POST)
    public ResponseEntity<Booking> bookSeats(String city, String movieName, String showDate, String showTime) {
        Booking booking = bookingService.bookSeats(city, movieName, showDate, showTime);
        return ResponseEntity.created(null).body(booking);
    }
}
