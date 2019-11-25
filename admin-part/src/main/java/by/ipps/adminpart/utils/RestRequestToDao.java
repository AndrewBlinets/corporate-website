package by.ipps.adminpart.utils;

import by.ipps.adminpart.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRequestToDao {

    public User getUserByLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> response = restTemplate.postForEntity( "http://localhost:8082/dao/users/auth",
                login, User.class);
        return response.getBody();
    }
}
