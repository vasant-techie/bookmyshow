package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.entity.TheatreSeat;
import com.bookmyshow.consumer.api.repo.TheatreSeatRepository;
import org.springframework.stereotype.Service;

@Service
public class TheatreSeatService {

    private final TheatreSeatRepository theatreSeatRepository;


    public TheatreSeatService(TheatreSeatRepository theatreSeatRepository) {
        this.theatreSeatRepository = theatreSeatRepository;
    }

    public TheatreSeat findBySeatNo(String seatNo) {
        return theatreSeatRepository.findBySeatNumber(seatNo);
    }
}
