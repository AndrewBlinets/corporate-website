package by.ipps.adminpart.controller.base;

import by.ipps.adminpart.custom.CustomPage;
import by.ipps.adminpart.entity.BaseEntity;
import by.ipps.adminpart.utils.restTemplate.BaseEntityTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public abstract class BaseEntityAbstractController<T extends BaseEntity, S extends BaseEntityTemplate>
        implements BaseEntityController<T> {

    protected final S baseEntityTemplate;
    protected final String url;

    protected BaseEntityAbstractController(S s, String url) {
        this.baseEntityTemplate = s;
        this.url = url;
    }

    @Override
    public ResponseEntity<T> get(Long id, String language) {
        T entity = baseEntityTemplate.findById(id, url);
        return new ResponseEntity<>(entity, entity != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

//    @Override
//    public ResponseEntity<Object> create(T entity) {
//        T saved = baseEntityTemplate.create(entity);
//        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
//    }
//
//    @Override
//    public ResponseEntity<Object> update(T entity) {
//        T saved = baseEntityTemplate.update(entity);
//        return new ResponseEntity<>(saved, saved != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
//    }
//
//    @Override
//    public ResponseEntity<Object> remove(Long id) {
//        boolean flag = baseEntityTemplate.delete(baseEntityTemplate.findById(id, url));
//        return new ResponseEntity<>(flag ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
//    }
//

    @Override
    public ResponseEntity<CustomPage<T>> getAll(long page, int size, String sort, String language) {
        CustomPage<T> ts = baseEntityTemplate.findPagingRecords(page, size, sort, language, url);
        return new ResponseEntity<>(ts, ts != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
