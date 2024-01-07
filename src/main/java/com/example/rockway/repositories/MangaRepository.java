package com.example.rockway.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rockway.models.Manga;

public interface MangaRepository extends CrudRepository<Manga, Integer> {

}