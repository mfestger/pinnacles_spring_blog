package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/3/and/4")
    @ResponseBody
    public String example1(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        firstNumber = 3;
        secondNumber = 4;
        int result = firstNumber + secondNumber;
        return String.format("The result is" + result);
    }




}
