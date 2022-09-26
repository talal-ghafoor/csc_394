package com.example.demo.user;

import java.util.List;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    Object findAll();

}
