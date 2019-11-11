package by.ipps.dao.service.impl;

import by.ipps.dao.entity.User;
import by.ipps.dao.repository.UserRepository;
import by.ipps.dao.service.UserService;
import by.ipps.dao.service.base.BaseEntityServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseEntityServiceImpl<User, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
