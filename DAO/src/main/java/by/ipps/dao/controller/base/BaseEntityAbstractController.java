package by.ipps.dao.controller.base;

import by.ipps.dao.entity.BaseEntity;
import by.ipps.dao.entity.Partners;
import by.ipps.dao.service.base.BaseEntityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

public abstract class BaseEntityAbstractController<T extends BaseEntity, S extends BaseEntityService<T>>
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
    public ResponseEntity<T> create(T entity) {
        T saved = baseEntityServuce.create(entity);
        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<T> update(T entity) {
        T saved = baseEntityServuce.update(entity);
        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<Boolean> remove(Long id) {
        boolean flag = baseEntityServuce.delete(baseEntityServuce.findById(id));
        return new ResponseEntity<>(flag ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Transactional
    @Override
    public ResponseEntity<Page<T>> getAll(Pageable pageable, String language) {
        Page<T> ts = baseEntityServuce.findPagingRecords(pageable);
        return new ResponseEntity<>(ts, ts != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<List<T>> getAll(){
        List<T> ts = baseEntityServuce.findAll();
        return new ResponseEntity<>(ts, ts != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }


}
