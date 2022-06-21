package com.exam.examportal.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.examportal.entity.User;
import com.exam.examportal.entity.UserRole;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    
    public User findByUsername(String username);
}
