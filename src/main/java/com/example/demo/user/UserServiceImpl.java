// Below is the code for the UserServiceImpl.java file.
package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // save operation
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // read operation
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    // update operation
    @Override
    public User updateUser(User user, Long userId) {
        User userDB = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())) {
            userDB.setUsername(user.getUsername());
        }

        return userRepository.save(userDB);
    }

    // delete operation
    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

}