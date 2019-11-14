package by.ipps.dao.controller;

import by.ipps.dao.controller.base.BaseEntityAbstractController;
import by.ipps.dao.controller.base.BaseEntityController;
import by.ipps.dao.entity.User;
import by.ipps.dao.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserController extends BaseEntityAbstractController<User, UserService>
        implements BaseEntityController<User> {

    protected UserController(UserService userService) {
        super(userService);
    }
}
