package com.exam.examportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.examportal.entity.Role;
import com.exam.examportal.entity.UserRole;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {


}


    

