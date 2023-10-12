package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.TheatreSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreSeatRepository extends JpaRepository<TheatreSeat, Integer> {
    TheatreSeat findBySeatNumber(String seatNo);
}
