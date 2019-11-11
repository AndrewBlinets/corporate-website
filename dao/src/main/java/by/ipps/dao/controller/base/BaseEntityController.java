package by.ipps.dao.controller.base;

import by.ipps.dao.entity.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


public interface BaseEntityController<T extends AbstractEntity> {

    @PostMapping
    ResponseEntity<Object> create(@RequestBody @Valid T entity);

    @GetMapping(value = "/{id}")
    ResponseEntity<T> get(@PathVariable Long id);

    @PutMapping
    ResponseEntity<Object> update(@RequestBody @Valid T entity);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Object> remove(@PathVariable Long id);

}
