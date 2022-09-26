package com.example.demo;

import com.example.demo.role.Role;

import java.util.Set;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
