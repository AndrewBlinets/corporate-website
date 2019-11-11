package by.ipps.dao.service.base;

import by.ipps.dao.entity.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseEntityService<T extends AbstractEntity> {

    T create(T t);

    Page<T> findPagingRecords(Pageable page);
    T findById(Long id);

    T update(T t);

    boolean delete(T t);
}
