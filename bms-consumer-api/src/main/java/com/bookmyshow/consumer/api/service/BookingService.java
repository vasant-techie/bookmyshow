package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.dto.BookingDetails;
import com.bookmyshow.consumer.api.entity.*;
import com.bookmyshow.consumer.api.repo.BookingRepository;
import com.bookmyshow.consumer.api.repo.SeatBookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final SeatBookingsRepository seatBookingsRepository;
    private final ShowService showService;
    private final UserService userService;
    private final TheatreSeatService theatreSeatService;

    @Autowired
    public BookingService(BookingRepository bookingRepository, SeatBookingsRepository seatBookingsRepository, ShowService showService, UserService userService, TheatreSeatService theatreSeatService) {
        this.bookingRepository = bookingRepository;
        this.seatBookingsRepository = seatBookingsRepository;
        this.showService = showService;
        this.userService = userService;
        this.theatreSeatService = theatreSeatService;
    }

    public Bookings bookSeats(BookingDetails bookingDetails) {
        Show show = showService.findShowByShowId(bookingDetails.getShowId());
        Customer user = userService.findByUserId(bookingDetails.getUserId());
        List<TheatreSeat> theatreSeats = bookingDetails.getSeatNumbers().stream().map(theatreSeatService::findBySeatNo).toList();
        List<SeatBookings> seatBookings = theatreSeats.stream().map(seat -> new SeatBookings(seat, show)).toList();
        Bookings bookings = new Bookings(show, user, seatBookings);
        bookingRepository.save(bookings);
        // Set the relationship with the booking for each seat booking
        for (SeatBookings seatBooking : seatBookings) {
            seatBooking.setBookings(bookings);
        }

        // Save the seat bookings with the updated relationship
        seatBookingsRepository.saveAll(seatBookings);

        return bookings;
    }

}
