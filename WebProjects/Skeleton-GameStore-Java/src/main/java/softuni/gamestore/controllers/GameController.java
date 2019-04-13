package softuni.gamestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import softuni.gamestore.entity.Game;
import softuni.gamestore.gameBindingModel.GameBindingModel;
import softuni.gamestore.repository.GameRepository;

import java.util.List;


@Controller
public class GameController {

    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        List<Game> games = this.gameRepository.findAll();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("games", games);
        modelAndView.addObject("view", "game/index");

        //TODO
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "game/create");
        //TODO

        return modelAndView;

    }

    @PostMapping("/create")
    public String create(Game game) {
        this.gameRepository.saveAndFlush(game);
        //TODO
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView, @PathVariable int id) {
        Game game = this.gameRepository.getOne(id);
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("game", game);
        modelAndView.addObject("view", "game/delete");

        //TODO
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView, @PathVariable int id) {
        Game game = gameRepository.getOne(id);
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "game/edit");
        modelAndView.addObject("game", game);
        //TODO
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public String delete(@PathVariable int id, GameBindingModel gameBindingModel) {
        Game game = gameRepository.getOne(id);
        game.setName(gameBindingModel.getName());
        game.setDlc(gameBindingModel.getDlc());
        game.setPrice(gameBindingModel.getPrice());
        game.setPlatform(gameBindingModel.getPlatform());
        this.gameRepository.saveAndFlush(game);
        //TODO
        return "redirect:/";
    }


    @PostMapping("/delete/{id}")
    public String deleteProcess(@PathVariable int id) {
        this.gameRepository.delete(gameRepository.getOne(id));
        //TODO
        return "redirect:/";

    }


}
