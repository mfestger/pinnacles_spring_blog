package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{firstNumber}/and/{secondNumber}")
//    @ResponseBody
    public String add(@PathVariable int firstNumber, @PathVariable int secondNumber, Model model) {
        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("secondNumber", secondNumber);
        model.addAttribute("result", firstNumber + secondNumber);
//        return firstNumber + secondNumber;
        return "arithmetic/addition/result";
    }

    @GetMapping("/subtract/{firstNumber}/from/{secondNumber}")
    @ResponseBody
    public int subtract(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber - secondNumber;
    }

    @GetMapping("/multiply/{firstNumber}/and/{secondNumber}")
    @ResponseBody
    public int multiply(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber * secondNumber;
    }

    @GetMapping("/divide/{firstNumber}/by/{secondNumber}")
    @ResponseBody
    public double divide(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return (double) firstNumber / secondNumber;
    }




}
