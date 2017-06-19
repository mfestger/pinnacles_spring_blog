package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //@WebServlet
public class HelloWorldController {
    @GetMapping("/hello")  //(urlPatterns)
    @ResponseBody          // response.getWriter.println("hello world!")
    public String hello() {
        return "Hello world!";
    }

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
