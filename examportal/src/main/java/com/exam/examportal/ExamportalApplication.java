package com.exam.examportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examportal.entity.Role;
import com.exam.examportal.entity.User;
import com.exam.examportal.entity.UserRole;
import com.exam.examportal.service.UserService;
import com.exam.examportal.service.UserServiceImpl;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {

	@Autowired
	private UserService Userservice;

	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);

		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting");

		// User user = new User();

		// user.setFirstname("ayush");
		// user.setLastname("Pandey");
		// user.setUsername("ayush007");
		// user.setPassword("duckduckgo");
		// user.setEmail("ayushpandey1151@gmail.com");
		// user.setPhone("9899898989");

		// Role role1 = new Role();

		// role1.setRoleId(44L);
		// role1.setRoleName("ADMIN");

		// Set<UserRole> userRolesSet = new HashSet<>();

		

		
		// User user1 = this.Userservice.createUser(user, userRolesSet);

		// System.out.println(user1.getUsername());


		


		
	}

}
