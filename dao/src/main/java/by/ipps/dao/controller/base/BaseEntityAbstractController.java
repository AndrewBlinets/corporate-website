package by.ipps.dao.controller.base;

import by.ipps.dao.entity.AbstractEntity;
import by.ipps.dao.service.base.BaseEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseEntityAbstractController<T extends AbstractEntity, S extends BaseEntityService<T>>
        implements BaseEntityController<T> {

    protected final S baseEntityServuce;

    protected BaseEntityAbstractController(S s) {
        this.baseEntityServuce = s;
    }

    @Override
    public ResponseEntity<T> get(Long id) {
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
    public ResponseEntity<Object> remove(Long id){
        boolean flag = baseEntityServuce.delete(baseEntityServuce.findById(id));
        return new ResponseEntity<>(flag ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
