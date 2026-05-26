package com.example.moviedb.repository;

import com.example.moviedb.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}