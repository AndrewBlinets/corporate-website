package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.User;
import by.ipps.adminpart.utils.resttemplate.UserRestTemplate;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController extends BaseEntityAbstractController<User, UserRestTemplate>
        implements BaseEntityController<User> {

    protected UserController(UserRestTemplate userRestTemplate) {
        super(userRestTemplate, "/users");
    }
}
