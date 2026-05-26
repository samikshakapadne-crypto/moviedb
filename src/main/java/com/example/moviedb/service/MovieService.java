package com.example.moviedb.service;

import com.example.moviedb.entity.Movie;
import com.example.moviedb.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Movie saveMovie(Movie movie) {

        return repository.save(movie);
    }

    public List<Movie> getAllMovies() {

        return repository.findAll();
    }

    public Movie updateMovie(int id, Movie updatedMovie) {

        Movie movie = repository.findById(id).orElse(null);

        if(movie != null) {

            movie.setMovieName(updatedMovie.getMovieName());
            movie.setHeroName(updatedMovie.getHeroName());
            movie.setDirector(updatedMovie.getDirector());
            movie.setReleaseYear(updatedMovie.getReleaseYear());
            movie.setRating(updatedMovie.getRating());

            return repository.save(movie);
        }

        return null;
    }

    public String deleteMovie(int id) {

        repository.deleteById(id);

        return "Movie Deleted Successfully";
    }
}