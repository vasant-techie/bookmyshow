package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}