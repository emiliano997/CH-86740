package com.project.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

  @GetMapping("/hello-world")
  public String helloWorld() {
    return "Hello World!";
  }
}
