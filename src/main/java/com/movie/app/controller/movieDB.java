package com.movie.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;

@CrossOrigin
@RestController
@RequestMapping("/moviesDB")
public class movieDB {
    
    private static final Logger LOG = LoggerFactory.getLogger(MoviesController.class);

    //https://api.themoviedb.org/3/movie/550?api_key=cad0d95925c6869c60ed49f550af6c90

    
	@GetMapping("/{movieId}")
	public MovieDb getMovieInfoDB(@PathVariable("movieId") Integer movieId) {

        LOG.info("Detail of the movie in api bd...");

		TmdbMovies movies = new TmdbApi("<apikey>").getMovies();

		MovieDb movie = movies.getMovie(movieId, "en");

        return movie;
	}
}
