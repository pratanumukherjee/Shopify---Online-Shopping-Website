package com.orderDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderDetails.application.*;

@Repository
public interface statusRepository extends JpaRepository<status, Integer> {

}
