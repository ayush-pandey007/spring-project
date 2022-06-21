package com.exam.examportal.service;

import java.util.Set;

import com.exam.examportal.entity.User;
import com.exam.examportal.entity.UserRole;

public interface UserService {

    public User createUser(User user,Set<UserRole> userRoles);
    public User getUser(String username);
}
