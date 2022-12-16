package com.movie.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import com.movie.reviews.Model.Genres;

public interface GenreRepository extends CrudRepository<Genres, Integer> {}