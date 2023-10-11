package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> getShowsByMovieDateTime();
}