package com.bookmyshow.consumer.api.endpoints;

import com.bookmyshow.consumer.api.entity.Theatre;
import com.bookmyshow.consumer.api.service.ShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/show")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @RequestMapping(name = "/get-shows-by-movie-date-time/${city}/${movieName}/${showDate}/${showTime}", path = "/get-shows-by-movie-date-time/{movieName}/{showDate}/{showTime}/{city}", method = RequestMethod.GET)
    public ResponseEntity<List<Theatre>> getShowsByMovieDateTime(@PathVariable("movieName") String movieName, @PathVariable("showDate") String showDate, @PathVariable("showTime") String showTime, @PathVariable("city") String city) {
        return ResponseEntity.ok(showService.findTheatresByMovieCityAndMovieDateAndMovieTimeAndMovieName(city, movieName, showDate, showTime));
    }
}
