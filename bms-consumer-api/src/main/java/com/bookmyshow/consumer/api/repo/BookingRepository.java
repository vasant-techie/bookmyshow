package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings, Long> {
}