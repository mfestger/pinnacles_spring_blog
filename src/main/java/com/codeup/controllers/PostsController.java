package com.codeup.controllers;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping("posts/create")
    @ResponseBody
    public String savePost() {
        return "create a new post";
    }

    @GetMapping("resume")
    @ResponseBody
    public String resume() {return "Here is my resume";}


}
