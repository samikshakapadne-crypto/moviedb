package com.example.moviedb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;
    private String heroName;
    private String director;
    private int releaseYear;
    private double rating;

    public Movie() {

    }

    public Movie(int id,
                 String movieName,
                 String heroName,
                 String director,
                 int releaseYear,
                 double rating) {

        this.id = id;
        this.movieName = movieName;
        this.heroName = heroName;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}