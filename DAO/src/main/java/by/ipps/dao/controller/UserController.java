package by.ipps.dao.controller;

import by.ipps.dao.controller.base.BaseEntityAbstractController;
import by.ipps.dao.controller.base.BaseEntityController;
import by.ipps.dao.entity.User;
import by.ipps.dao.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserController extends BaseEntityAbstractController<User, UserService>
        implements BaseEntityController<User> {

    private UserService userService;

    protected UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }

    @PostMapping("/auth")
    @ResponseBody
    public ResponseEntity auth(@RequestBody String login){
        User user = userService.getUserByLogin(login);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
