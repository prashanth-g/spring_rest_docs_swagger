package com.prashanth.spring.swagger.docs.controller;

import com.prashanth.spring.swagger.docs.model.SwaggerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerDocsController {

    @GetMapping("/")
    public SwaggerResponse getResponse() {
        return new SwaggerResponse("1", "name01");
    }

}
