package com.service;

import java.util.List;

import com.models.User;

public interface UserService {
void register(User user);
boolean login(String name,String password);
List<User> getAllUser();
}
