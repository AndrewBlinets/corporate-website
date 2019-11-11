package by.ipps.dao.service.base;

import by.ipps.dao.entity.AbstractEntity;
import by.ipps.dao.repository.AbstractEntityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.Date;

@Transactional
public class BaseEntityServiceImpl<T extends AbstractEntity, R extends AbstractEntityRepository<T>> implements BaseEntityService<T> {

    private final R repository;

    public BaseEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T create(T t) {
        return repository.save(t);
    }

    @Override
    public Page<T> findPagingRecords(Pageable page) {
        return repository.findAll(page);
    }


    @Override
    public T findById(Long id) {
        return repository.findByIdAndStatusR(id, "R").orElse(null);
    }

    @Override
    public T update(T t) {
        return repository.save(t);
    }

    @Override
    public boolean delete(T t) {
        try {
            t.setStatusR("R");
            t.setDateChangeStatusR(new Date());
            repository.save(t);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
