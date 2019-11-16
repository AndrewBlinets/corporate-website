package by.ipps.dao.repository;

import by.ipps.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseEntityRepository<User> {
    Optional<User> findByLogin(String login);
}
