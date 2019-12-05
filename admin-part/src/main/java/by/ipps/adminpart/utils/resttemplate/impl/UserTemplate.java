package by.ipps.adminpart.utils.resttemplate.impl;

import by.ipps.adminpart.entity.User;
import by.ipps.adminpart.utils.resttemplate.UserRestTemplate;
import by.ipps.adminpart.utils.resttemplate.base.AbstractBaseEntityRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserTemplate extends AbstractBaseEntityRestTemplate<User> implements UserRestTemplate {


    @Override
    public User getUserByLogin(String login) {
        ResponseEntity<User> response = restTemplate.postForEntity( URL_SERVER + "users/auth",
                login, User.class);
        return response.getBody();
    }
}
