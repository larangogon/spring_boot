package com.movie.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import com.movie.reviews.Model.Movies;

public interface MoviesRepository extends CrudRepository<Movies, Integer> {}