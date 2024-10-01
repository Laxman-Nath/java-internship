package com.appsoft.services;

import com.appsoft.models.User;

public interface UserService {
User register(User user);
boolean login(String name,String password);
boolean isUserWithSameNameExists(String name);
}
