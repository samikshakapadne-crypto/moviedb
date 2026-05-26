package com.example.moviedb.controller;

import com.example.moviedb.entity.Movie;
import com.example.moviedb.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {

        return service.saveMovie(movie);
    }

    @GetMapping
    public List<Movie> getMovies() {

        return service.getAllMovies();
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable int id,
                             @RequestBody Movie movie) {

        return service.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable int id) {

        return service.deleteMovie(id);
    }
}