package br.senai.controller;


import br.senai.model.Games;
import br.senai.service.GamesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Games_LikeController {


    @Autowired
    GamesServiceImpl gamesService;


    @GetMapping ("/games")
    public List<Games> findAll() {
        return null;
    }
}
