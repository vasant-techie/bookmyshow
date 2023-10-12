package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.entity.Booking;
import com.bookmyshow.consumer.api.entity.Show;
import com.bookmyshow.consumer.api.repo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final ShowService showService;

    @Autowired(required = true)
    public BookingService(BookingRepository bookingRepository, ShowService showService) {
        this.bookingRepository = bookingRepository;
        this.showService = showService;
    }
    public Booking bookSeats(String city, String movieName, String showDate, String showTime) {
        Show show = showService.findShowByCityAndMovieNameAndShowDateAndTime(city, movieName, showDate, showTime);
        Booking booking = new Booking(show);
        return bookingRepository.save(booking);
    }
}
