package com.codeup.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class PostsController {

    @GetMapping("/posts")
    @ResponseBody
    public String viewAll() {
        return "posts index page";
    }


    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewIndividualPost(@PathVariable long id) {
        return "view an individual post with ID: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showPostForm() {
        return "view the form for creating a post";
    }

    @GetMapping("posts/create")
    @ResponseBody
    public String savePost() {
        return "create a new post";
    }




//    @RequestMapping(path = "/posts", method = RequestMethod.GET)
//    @ResponseBody
//    public String index() {
//        return "here is the index page";
//    }
//
//    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String individualPost(@PathVariable int id) {
//        return "viewing an individual post. ID number is: " + id;
//    }
}
