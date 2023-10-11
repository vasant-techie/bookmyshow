package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}