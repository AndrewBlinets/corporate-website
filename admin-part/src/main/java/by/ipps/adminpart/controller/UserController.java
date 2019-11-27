package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.dao.dto.UserDto;
import by.ipps.dao.entity.User;
import by.ipps.dao.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserController extends BaseEntityAbstractController<User, UserService>
        implements BaseEntityController<User> {

    private UserService userService;
    private ModelMapper modelMapper;

    protected UserController(UserService userService, ModelMapper modelMapper) {
        super(userService);
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/auth")
    @ResponseBody
    public ResponseEntity auth(@RequestBody String login){
        User user = userService.getUserByLogin(login);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
