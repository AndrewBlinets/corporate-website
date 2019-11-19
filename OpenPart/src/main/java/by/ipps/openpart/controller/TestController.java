package by.ipps.openpart.controller;

import by.ipps.openpart.entity.Project;
import com.google.common.reflect.TypeToken;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.data.web.PageableDefault;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
public class TestController {

    private static final String URL_DB = "http://localhost:8082/dao/";
    private RestTemplate restTemplate;

    public TestController() {
        restTemplate = new RestTemplate();
    }

    @GetMapping(value = "/project/{id}")
    @ResponseBody
    public ResponseEntity<Project> getProjectByid(@PathVariable long id) {
        return restTemplate.getForEntity(URL_DB + "project/" + id, Project.class);
    }

    @GetMapping(value = "/projects")
    @ResponseBody
    public ResponseEntity<Project> getProject(
            @PageableDefault() Pageable pageable,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("page", String.valueOf(pageable.getPageNumber()));
        params.put("size", String.valueOf(pageable.getPageSize()));
        params.put("sort", pageable.getSort().toString());
        Type orgObjectOrdersListType = new TypeToken<Page<Project>>() {
        }.getType();
        restTemplate.getForEntity(URL_DB + "project", orgObjectOrdersListType.getClass(), params);
        return
    }

}
