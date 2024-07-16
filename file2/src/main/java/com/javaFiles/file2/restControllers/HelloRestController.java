package com.javaFiles.file2.restControllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaFiles.file2.dto.request.HelloReqDTO;
import com.javaFiles.file2.dto.response.HelloResDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/rest-controller-route")
public class HelloRestController {

    @GetMapping("/{var}")
    public ResponseEntity<?> getHelloPathVar(@PathVariable("var") String hello) {
        return ResponseEntity.ok(hello + " world (path var solution)");
    }

    @GetMapping("/")
    public ResponseEntity<?> getHelloParamVar(@RequestParam("var") String hello) {
        return ResponseEntity.ok(hello + " world (param var solution)");
    }

    @PostMapping("/add")
    public ResponseEntity<?> postHello(@RequestBody HelloReqDTO helloReqDTO) {
        HelloResDTO response = HelloResDTO.builder()
            .result(helloReqDTO.getKey1() + " " + helloReqDTO.getKey2())
            .uppercaseResult(helloReqDTO.getKey1().toUpperCase() + " " + helloReqDTO.getKey2().toUpperCase()) 
            .build();

        return ResponseEntity.ok(response);
    }

}
