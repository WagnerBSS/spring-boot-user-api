package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, User> userMap = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public User createUser(User user) {
        long id = idCounter.incrementAndGet();
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    public Optional<User> updateUser(Long id, User updatedUser) {
        if (userMap.containsKey(id)) {
            updatedUser.setId(id);
            userMap.put(id, updatedUser);
            return Optional.of(updatedUser);
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteUser(Long id) {
        return userMap.remove(id) != null;
    }
}