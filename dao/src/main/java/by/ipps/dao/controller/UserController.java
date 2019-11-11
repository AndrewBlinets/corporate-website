package by.ipps.dao.controller;

import by.ipps.dao.controller.base.BaseEntityAbstractController;
import by.ipps.dao.controller.base.BaseEntityController;
import by.ipps.dao.entity.User;
import by.ipps.dao.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserController extends BaseEntityAbstractController<User, UserService>
        implements BaseEntityController<User> {

    protected UserController(UserService userService) {
        super(userService);
    }

    @GetMapping
    public ResponseEntity<Page<User>> getAll(
            @PageableDefault()
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "id", direction = Sort.Direction.DESC),
            }) Pageable pageable) {
        Page<User> users = super.baseEntityServuce.findPagingRecords(pageable);
        return new ResponseEntity<>(users, users != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }
}
