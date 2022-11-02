package com.movie.service.movieService.Controller;


import com.movie.service.movieService.Model.Movie;
import com.movie.service.movieService.Service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;


    @PostMapping(value = "/saveMovie" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String savingAMovie(@RequestBody Movie movie){
        return service.saveMovie(movie);
    }

    @GetMapping("/getMovies")
    public List<Movie> GatMovie() {
        return  service.getMovies();
    }

    @DeleteMapping("/deleteMovie/{id}")
    public String deleteMovie(@PathVariable("id") ObjectId id) {
        return  service.deleteMovies(id);
    }

    @PostMapping(value = "/updateMovie" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateMovie(@RequestBody Movie movie){
        return service.updateMovies(movie);
    }


}
