package com.reddit.blog.api;

import com.reddit.blog.entities.User;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserRestApi {

  final String url = "https://jsonplaceholder.typicode.com/users";

  public ResponseEntity<User[]> getUsers() {
    RestTemplate restTemplate = new RestTemplate();

    //    ResponseEntity<User[]> response = restTemplate.exchange(
    //            url,
    //            HttpMethod.GET,
    //            null,
    //            User[].class
    //    );

    return restTemplate.getForEntity(url, User[].class);
  }

  public User getUser(int id) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = new HashMap<String, String>();
    params.put("id", String.valueOf(id));


    return restTemplate.getForObject(url + "/{id}", User.class, params);
  }

  public User save(User user) {
    RestTemplate restTemplate = new RestTemplate();

    return restTemplate.postForObject(url, user, User.class);
  }

  public User update(int id, User user) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = Map.of("id", String.valueOf(id));

    restTemplate.put(url + "/{id}", user, params);

    return user;
  }

  public User delete(int id) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = Map.of("id", String.valueOf(id));

    User user = restTemplate.getForObject(
            url + "/{id}",
            User.class,
            params
    );

    restTemplate.delete(url + "/{id}", params);

    return user;
  }
}
