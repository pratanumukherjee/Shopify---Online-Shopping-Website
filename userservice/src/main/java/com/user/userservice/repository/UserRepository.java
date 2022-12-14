package com.user.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.userservice.UserserviceApplication;
import com.user.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	UserserviceApplication save(UserserviceApplication user);
	
}
