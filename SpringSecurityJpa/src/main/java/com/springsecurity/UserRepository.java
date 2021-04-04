package com.springsecurity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	Optional<User> findByUserName(String userName);
}
