package com.example.rockway.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rockway.models.Author;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}