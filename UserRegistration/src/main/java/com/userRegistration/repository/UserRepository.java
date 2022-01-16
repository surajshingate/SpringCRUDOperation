package com.userRegistration.repository;

import org.springframework.data.repository.CrudRepository;

import com.userRegistration.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
