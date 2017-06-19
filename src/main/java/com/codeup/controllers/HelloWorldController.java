package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //@WebServlet
public class HelloWorldController {
    @GetMapping("/hello")  //(urlPatterns)
    // @ResponseBody          // I commented this out because Thymelead doesn't need it
    public String hello() {
        return "hello";
    } // it'll kook for the view within templates if no ResponseBody annotation is found

    @GetMapping("/hello/{name}/{lastName}") // shortcut for RequestMapping (method = GET)
    @ResponseBody
    public String helloFriend(@PathVariable String name, @PathVariable String lastName) {
        return String.format("Hello %s %s" , name, lastName);
    }

    @RequestMapping(path = "increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        // if, switch, while, do-while, for logic can work here
        return number + " plus one is" + (number + 1) + "!";
    }

}
