package com.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.cartTable.*;

@Repository
public interface cartRepository extends JpaRepository<CartTableApplication, Integer> {

}
