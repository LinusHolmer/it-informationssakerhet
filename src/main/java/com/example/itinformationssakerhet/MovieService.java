package com.example.itinformationssakerhet;


import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private final RandomIdGenerator randomIdGenerator;
    private List<Movie> movies = new ArrayList<Movie>();
    private final TextFormatter textFormatter;

    public MovieService(RandomIdGenerator randomIdGenerator, TextFormatter textFormatter) {
        this.randomIdGenerator = randomIdGenerator;
        this.textFormatter = textFormatter;
    }

    public Movie addMovie(Movie movie) {
        String id = randomIdGenerator.generateId();
        String formatTitle = textFormatter.formatTitle(movie.getTitle());
        movie.setId(id);
        movie.setTitle(formatTitle);
        movies.add(movie);
        return movie;
    }
    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovie(int index){
        if(index < 0 || index >= movies.size()){
            return null;
        }
        return movies.get(index);
    }

    public Movie updateMovie( int index, Movie updated){
        if(index < 0 || index >= movies.size()) {
            return null;
        }
        movies.set(index, updated);
        return updated;
    }

    public Movie deleteMovie(int index){
        if(index < 0 || index >= movies.size()) {
            return null;
        }
        movies.remove(index);
        return movies.get(index);
    }

}
