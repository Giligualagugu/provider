package org.example.controller;

import org.example.mapper.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/info")
    public Object pr() {
        projectService.testQuery();
        return "ok 呵呵";
    }
}
