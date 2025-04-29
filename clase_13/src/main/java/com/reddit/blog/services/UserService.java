package com.reddit.blog.services;

import com.reddit.blog.api.UserRestApi;
import com.reddit.blog.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRestApi userApi;

  public ResponseEntity<User[]> getUsers() {
    return userApi.getUsers();
  }

  public User getUser(int id) {
    return userApi.getUser(id);
  }

  public User save(User user) {
    return userApi.save(user);
  }

  public User update(int id, User user) {
    return userApi.update(id, user);
  }

  public User delete(int id) {
    return userApi.delete(id);
  }
}
