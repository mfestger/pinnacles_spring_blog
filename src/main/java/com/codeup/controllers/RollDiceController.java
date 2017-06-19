package com.codeup.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{userGuess}")
    @ResponseBody
    public String Guess(@PathVariable int userGuess, Model model) {
        model.addAttribute("userGuess", userGuess);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6);
        return "Your guess was: " + userGuess + " and the correct number was: " + randomInt;
    }


}
