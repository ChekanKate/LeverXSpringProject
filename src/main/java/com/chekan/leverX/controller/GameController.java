package com.chekan.leverX.controller;

import com.chekan.leverX.entity.Game;
import com.chekan.leverX.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/games")
    public String showAllGames(Model model){
        List<Game> allGames = gameService.getAllGames();
        model.addAttribute("allG", allGames);
        return "allGames";
    }

    @RequestMapping("/addGame")
    public String addGame(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        return "addGame";
    }

    @RequestMapping("/saveGame")
    public String saveGame(@Valid @ModelAttribute("game") Game game, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addGame";
        } else {
            gameService.saveGame(game);
            return "redirect:/";
        }
    }

}
