package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}