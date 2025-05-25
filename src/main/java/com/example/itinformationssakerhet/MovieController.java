package com.example.itinformationssakerhet;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @PostMapping
    public ResponseEntity <Movie> addMovie(@RequestBody Movie movie) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(movieService.addMovie(movie));
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{index}")
    public ResponseEntity <Movie> getMovie(@PathVariable int index){
        Movie movie = movieService.getMovie(index);
        if(movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/{index}")
    public ResponseEntity <Movie> updateMovie(@PathVariable int index, @RequestBody Movie movie){
        Movie updated = movieService.updateMovie(index, movie);
        if(movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{index}")
    public ResponseEntity <Void> deleteMovie(@PathVariable int index){
        if(movieService.deleteMovie(index) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

}
