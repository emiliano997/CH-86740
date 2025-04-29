package com.reddit.blog.controllers;

import com.reddit.blog.entities.User;
import com.reddit.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<User[]> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUser(@PathVariable int id) {
    try {
      return ResponseEntity.ok(userService.getUser(id));
    } catch (HttpClientErrorException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> save(@RequestBody User user) {
    return ResponseEntity.ok(userService.save(user));
  }

  @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> update(@PathVariable int id, @RequestBody User user) {
    try {
      return ResponseEntity.ok(userService.update(id, user));
    } catch (HttpClientErrorException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<User> delete(@PathVariable int id) {
    try {
      return ResponseEntity.ok(userService.delete(id));
    } catch (HttpClientErrorException e) {
      return ResponseEntity.notFound().build();
    }
  }

}
