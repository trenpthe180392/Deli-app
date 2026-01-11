package edu.mo.coffee.fooddelivery.service;

import edu.mo.coffee.fooddelivery.model.User;
import edu.mo.coffee.fooddelivery.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepositoryPa) {
        this.userRepository = userRepositoryPa;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
