package com.movie.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;
import info.movito.themoviedbapi.model.core.MovieResultsPage;

@CrossOrigin
@RestController
@RequestMapping("/moviesDB")
public class movieDB {
    
    private static final Logger LOG = LoggerFactory.getLogger(MoviesController.class);

    //https://api.themoviedb.org/3/movie/550?api_key=cad0d95925c6869c60ed49f550af6c90
	//buscando pelicula por id
	@GetMapping("/{movieId}")
	public ModelAndView getMovieInfoDB(@PathVariable("movieId") Integer movieId) {

        LOG.info("Detail of the movie in api bd...");

		TmdbMovies movies = new TmdbApi("<apikey>").getMovies();

		MovieDb movie = movies.getMovie(movieId, "en");

		ModelAndView mav = new ModelAndView("show");

		mav.addObject("movie", movie);
        return mav;
	}

	//https://api.themoviedb.org/3/movie/popular?api_key=cad0d95925c6869c60ed49f550af6c90
	//populares
	@GetMapping("/getPopularMovies")
	public String getPopularMovies(
		@RequestParam(required = false, defaultValue = "0") Integer page,
		@RequestParam(required = false, defaultValue = "20") Integer size,
		@RequestParam(required = false, defaultValue = "false") Boolean enablePagination,
		Model model
	) {
		LOG.info("All the movies in api bd...");

		TmdbMovies movies = new TmdbApi("<apikey>").getMovies();

		MovieResultsPage moviesPMovieResultsPage = movies.getPopularMovies(null, null);

		model.addAttribute("movies", moviesPMovieResultsPage);

        return "index";
	}
}
