package com.javaFiles.file5.views.controllers.form;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaFiles.file5.dto.FormInputDTO;

import org.springframework.ui.Model;

@Controller
public class FormViewController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // In browser: http://localhost:8010/file5/view/form/index
    @RequestMapping(value = "/view/form/index", method = RequestMethod.GET)
    public String getView(Model model ) {
        
        logger.info("\n\nAccessing the view index\n");
        
        model.addAttribute("title", "FORM");

        return "/views/form/index"; 
    }

    @RequestMapping(value = "/view/form/viewFormInputsByConsole", method = RequestMethod.POST)
    public ResponseEntity<?> viewFormInputsByConsole(@ModelAttribute FormInputDTO form) {
        Map<String, Object> outcome = new HashMap<>();

        logger.info("\n\nController info:\n\n form: {}\n\n", form);

        outcome.put("processedData", form);

        return new ResponseEntity<>(outcome, HttpStatus.OK);
    }
}
