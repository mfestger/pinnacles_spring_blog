package com.codeup.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController {

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "here is the index page";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String individualPost(@PathVariable int id) {
        return "viewing an individual post. ID number is: " + id;
    }
}
