package com.example.demo.user;


import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> findAll();

    // update operation
    User updateUser(User user, Long userid);

    // delete operation
    void deleteUserById(Long userid);
}