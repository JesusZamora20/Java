package org.example.movies.service;

import org.example.movies.data.MovieRepository;
import org.example.movies.model.Genre;
import org.example.movies.model.Movie;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    @Test
    public void return_movies_by_genre() {
        MovieRepository movrep = Mockito.mock(MovieRepository.class);
        Mockito.when(movrep.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Dark Knight 2", 113, Genre.THRILLER),
                        new Movie(3, "Dark Day", 112, Genre.HORROR),
                        new Movie(4, "Dark Day 2", 132, Genre.COMEDY),
                        new Movie(5, "Memento", 142, Genre.ACTION),
                        new Movie(6, "Matrix", 165, Genre.COMEDY)
                )
        );
        MovieService ms = new MovieService(movrep);

        Collection<Movie> movies = ms.findMoviesByGenre(Genre.COMEDY);

        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        assertEquals(Arrays.asList(4,6), movieIds);
    }
}