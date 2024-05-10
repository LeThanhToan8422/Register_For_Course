package com.iuh.sa_final_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ttt")
public class Ttt {
    @GetMapping
    public String test() {
        return "ttt";
    }
}
