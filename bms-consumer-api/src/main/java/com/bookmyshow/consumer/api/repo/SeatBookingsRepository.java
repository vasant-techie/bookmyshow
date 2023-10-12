package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.SeatBookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookingsRepository extends JpaRepository<SeatBookings, Long> {
}