package com.movie.reviews.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.reviews.Model.Languages;

public interface LanguageRepository extends CrudRepository<Languages, Integer> {

}
