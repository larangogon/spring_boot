package com.movie.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.app.Model.Movies;

public interface MoviesRepository extends CrudRepository<Movies, Integer> {}