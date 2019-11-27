package by.ipps.adminpart.controller.base;

import by.ipps.adminpart.entity.BaseEntity;
import by.ipps.adminpart.utils.restTemplate.BaseEntityTemplate;
import by.ipps.dao.entity.BaseEntity;
import by.ipps.dao.service.base.BaseEntityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;

public abstract class BaseEntityAbstractController<T extends BaseEntity, S extends BaseEntityTemplate>
        implements BaseEntityController<T> {

    protected final S baseEntityServuce;

    protected BaseEntityAbstractController(S s) {
        this.baseEntityServuce = s;
    }

    @Override
    public ResponseEntity<T> get(Long id, String language) {
        T entity = baseEntityServuce.findById(id);
        return new ResponseEntity<>(entity, entity != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Object> create(T entity) {
        T saved = baseEntityServuce.create(entity);
        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<Object> update(T entity) {
        T saved = baseEntityServuce.update(entity);
        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<Object> remove(Long id) {
        boolean flag = baseEntityServuce.delete(baseEntityServuce.findById(id));
        return new ResponseEntity<>(flag ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Transactional
    @Override
    public ResponseEntity<Page<T>> getAll(Pageable pageable, String language) {
        Page<T> ts = baseEntityServuce.findPagingRecords(pageable);
        return new ResponseEntity<>(ts, ts != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
