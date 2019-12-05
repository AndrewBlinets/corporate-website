package by.ipps.adminpart.utils.resttemplate;

import by.ipps.adminpart.entity.User;
import by.ipps.adminpart.utils.resttemplate.base.BaseEntityRestTemplate;
import org.springframework.stereotype.Component;

@Component
public interface UserRestTemplate extends BaseEntityRestTemplate<User> {
    public User getUserByLogin(String login);
}
