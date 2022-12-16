package com.movie.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.app.Model.Genres;

public interface GenreRepository extends CrudRepository<Genres, Integer> {}