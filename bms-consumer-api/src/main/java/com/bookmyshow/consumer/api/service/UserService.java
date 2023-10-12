package com.bookmyshow.consumer.api.service;

import com.bookmyshow.consumer.api.entity.Customer;
import org.springframework.stereotype.Service;
import com.bookmyshow.consumer.api.repo.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Customer findByUserId(Long userId) {
        return userRepository.findById(userId).get();
    }
}
