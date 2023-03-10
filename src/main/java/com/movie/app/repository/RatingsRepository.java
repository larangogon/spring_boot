package com.movie.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.movie.app.Model.Ratings;

public interface RatingsRepository extends CrudRepository<Ratings, Integer> {
	@Query("Select rating from Ratings rating where rating.movieId= :movieId")

	List<Ratings> fetchRatingByMovieId(@Param("movieId") Integer movieId);
}
