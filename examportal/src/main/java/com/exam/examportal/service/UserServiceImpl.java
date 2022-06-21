package com.exam.examportal.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examportal.entity.User;
import com.exam.examportal.entity.UserRole;
import com.exam.examportal.repo.RoleRepo;
import com.exam.examportal.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        
        User local = userRepo.findByUsername(user.getUsername());
        if(local != null) {
            System.out.println("User with username " + user.getUsername() + " already exist");

        }
        else {
            for (UserRole ur : userRoles) {
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepo.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        // TODO Auto-generated method stub
        return this.userRepo.findByUsername(username);
    }

   

    
    
}
