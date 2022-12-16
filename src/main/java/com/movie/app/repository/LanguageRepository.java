package com.movie.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.app.Model.Languages;

public interface LanguageRepository extends CrudRepository<Languages, Integer> {}