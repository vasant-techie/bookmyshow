package com.bookmyshow.consumer.api.endpoints;

import com.bookmyshow.consumer.api.entity.Show;
import com.bookmyshow.consumer.api.service.ShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/show")
public class ShowController {

    private ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @RequestMapping(name = "/get-shows-by-movie-date-time", method = RequestMethod.GET)
    public ResponseEntity<List<Show>> getShowsByMovieDateTime() {
        return ResponseEntity.ok(showService.getShowsByMovieDateTime());
    }
}
