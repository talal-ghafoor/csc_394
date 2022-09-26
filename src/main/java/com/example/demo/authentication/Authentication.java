package com.example.demo.authentication;

public record Authentication(long id, String hash, String salt) {
}
