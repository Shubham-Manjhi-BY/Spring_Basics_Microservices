package com.movie.service.movieService.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/getMovies")
    public String GatMovie(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return  "service.getMovies()";
    }
}
