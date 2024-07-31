package com.javaFiles.file4.views.controllers.list;

import java.util.Arrays;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

@Controller
public class ListViewController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private String [] names = {"This", "List", "Is to export", "As PDF"};
    private List<String> myList = Arrays.asList(names);

    // In browser: http://localhost:8010/file4/view/list/index
    @RequestMapping(value = "/view/list/index", method = RequestMethod.GET)
    public String getView(Model model) {
        
        logger.info("\n\nAccessing the view ... index\n");

        model.addAttribute("list", myList);

        return "/views/list/index"; 
    }


    @RequestMapping(value = "/view/list/generatePdf", method = RequestMethod.POST)
    public ResponseEntity<?> createPdf() {
        Map<String, Object> outcome = new HashMap<>();

        /* some validations */
        outcome.put("myList", myList);

        return new ResponseEntity<>(outcome, HttpStatus.OK);
    }

}
