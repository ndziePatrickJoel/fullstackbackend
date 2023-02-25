package com.diceprime.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diceprime.fullstackbackend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
