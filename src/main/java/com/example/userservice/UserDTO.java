package com.example.userservice;

import lombok.Value;

import java.io.Serializable;

@Value
public class UserDTO implements Serializable {

    private final long id;
    private final String name;
    private final String email;
    private final String address;
    private final int age;
}
