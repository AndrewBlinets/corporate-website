package by.ipps.dao.repository;

import by.ipps.dao.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface AbstractEntityRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
    Optional<T> findByIdAndStatusR(Long id, String r);
}
