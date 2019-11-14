package by.ipps.dao.controller.base;

import by.ipps.dao.entity.BaseEntity;
import by.ipps.dao.service.base.BaseEntityService;
import by.ipps.dao.utils.constant.FilterName;
import org.hibernate.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseEntityAbstractController<T extends BaseEntity, S extends BaseEntityService<T>>
        implements BaseEntityController<T> {

    @PersistenceContext
    private EntityManager entityManager;

    protected final S baseEntityServuce;

    protected BaseEntityAbstractController(S s) {
        this.baseEntityServuce = s;
    }

    @Override
    public ResponseEntity<T> get(Long id, String language) {
//        entityManager.unwrap(Session.class).enableFilter(FilterName.LANGUAGE).setParameter("language", language);
        T entity = baseEntityServuce.findById(id);
//        entityManager.unwrap(Session.class).disableFilter(FilterName.LANGUAGE);
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

//    @GetMapping
    @Override
    public ResponseEntity<Page<T>> getAll(
            @PageableDefault()
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "id", direction = Sort.Direction.DESC),
            }) Pageable pageable, String language) {
        entityManager.unwrap(Session.class).enableFilter(FilterName.LANGUAGE).setParameter("language", language);
        Page<T> ts = baseEntityServuce.findPagingRecords(pageable);
        entityManager.unwrap(Session.class).disableFilter(FilterName.LANGUAGE);
        return new ResponseEntity<>(ts, ts != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
