package com.javaFiles.file1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping(value = "/controller-route")
public class HelloController {

    @GetMapping("/{var}") /* browser result: http://localhost:8010/file1/controller-route/Hello */
    public String getHelloPathVar(@PathVariable("var") String hello, Model model) {
        model.addAttribute("helloWorld", hello + " world (path var solution)"); /* attribute in index */
        return "/views/index"; /* resources/templates/views/index.html */
    }

    @GetMapping("/") /* browser result: http://localhost:8010/file1/controller-route/?var=Hello */
    public String getHelloParamVar(@RequestParam("var") String hello, Model model) {
        model.addAttribute("helloWorld", hello + " world (param var solution)"); /* attribute in index */
        return "/views/index"; /* resources/templates/views/index.html */
    }

}
