package org.example.movies.service;

import org.example.movies.data.MovieRepository;
import org.example.movies.model.Genre;
import org.example.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository mr;
    public MovieService(MovieRepository mr) {
        this.mr = mr;
    }
    public Collection findMoviesByGenre(Genre genre) {

        return mr.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDuration(int duration) {
        return mr.findAll().stream()
                .filter(movie -> movie.getMinutes() == duration).collect(Collectors.toList());
    }
}
