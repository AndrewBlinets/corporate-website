package by.ipps.adminpart.controller.base;

import by.ipps.adminpart.custom.CustomPage;
import by.ipps.adminpart.entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


public interface BaseEntityController<T extends BaseEntity> {

//    @PostMapping
//    ResponseEntity<Object> create(@RequestBody @Valid T entity);

    @GetMapping(value = "/{id}")
    ResponseEntity<T> get(@PathVariable Long id,
                          @RequestParam(value = "language", required = false, defaultValue = "ru") String language);

//    @PutMapping
//    ResponseEntity<Object> update(@RequestBody @Valid T entity);
//
//    @DeleteMapping(value = "/{id}")
//    ResponseEntity<Object> remove(@PathVariable Long id);
//
//
    @GetMapping
    ResponseEntity<CustomPage<T>> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") long page,
            @RequestParam(value = "size", required = false, defaultValue = "0") int size,
            @RequestParam(value = "size", required = false, defaultValue = "") String sort,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language);

}
