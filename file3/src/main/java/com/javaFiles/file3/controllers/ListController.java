package com.javaFiles.file3.controllers;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "/controller-route")
public class ListController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // In browser: http://localhost:8010/file3/controller-route/
    @GetMapping("/") 
    public String getView(Model model ) {
        
        logger.info("\n\nAccessing the view index\n");

        String [] names = {"Harry", "Ron", "Hermione", "Snape"};

        List<String> myList = Arrays.asList(names);
        
        model.addAttribute("list", myList);

        return "/views/index"; 
    }

}
