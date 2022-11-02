package com.signup.service.signupService.repository;

import com.signup.service.signupService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
