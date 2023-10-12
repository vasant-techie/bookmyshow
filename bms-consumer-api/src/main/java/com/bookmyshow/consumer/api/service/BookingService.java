package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.dto.BookingDetails;
import com.bookmyshow.consumer.api.entity.Booking;
import com.bookmyshow.consumer.api.entity.Customer;
import com.bookmyshow.consumer.api.entity.Show;
import com.bookmyshow.consumer.api.entity.TheatreSeat;
import com.bookmyshow.consumer.api.repo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final ShowService showService;
    private final UserService userService;
    private final TheatreSeatService theatreSeatService;

    @Autowired
    public BookingService(BookingRepository bookingRepository, ShowService showService, UserService userService, TheatreSeatService theatreSeatService) {
        this.bookingRepository = bookingRepository;
        this.showService = showService;
        this.userService = userService;
        this.theatreSeatService = theatreSeatService;
    }

    public Booking bookSeats(BookingDetails bookingDetails) {
        Show show = showService.findShowByShowId(bookingDetails.getShowId());
        Customer user = userService.findByUserId(bookingDetails.getUserId());
        List<TheatreSeat> theatreSeats = bookingDetails.getSeatNumbers().stream().map(theatreSeatService::findBySeatNo).toList();
        Booking booking = new Booking(show, user, theatreSeats);
        bookingRepository.save(booking);
        return booking;
    }

}
