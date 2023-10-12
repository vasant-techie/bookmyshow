package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.entity.Show;
import com.bookmyshow.consumer.api.entity.Theatre;
import com.bookmyshow.consumer.api.repo.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public List<Show> getShowsByMovieDateTime() {
        return showRepository.findAll();
    }

    public List<Theatre> findTheatresByMovieCityAndMovieDateAndMovieTimeAndMovieName(String city, String movieName, String showDate, String showTime) {
        return showRepository.findTheatresByMovieCityAndMovieNameAndMovieDateAndMovieTime(city, movieName, LocalDate.parse(showDate), LocalTime.parse(showTime));
    }
}
