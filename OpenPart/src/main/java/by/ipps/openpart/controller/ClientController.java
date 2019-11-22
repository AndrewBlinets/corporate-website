package by.ipps.openpart.controller;

import by.ipps.openpart.custom.CustomPage;
import by.ipps.openpart.dto.NewsDtoFull;
import by.ipps.openpart.dto.PageNewsDto;
import by.ipps.openpart.entity.ProjectFull;
import by.ipps.openpart.entity.ProjectShort;
import by.ipps.openpart.entity.Vacancy;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class ClientController {

    private static final String URL_DB = "http://localhost:8082/dao/";
    private RestTemplate restTemplate;

    public ClientController() {
        restTemplate = new RestTemplate();
    }

    @GetMapping(value = "/project/{id}")
    @ResponseBody
    public ResponseEntity<ProjectFull> getProjectByid(
            @PathVariable long id,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language) {
        String url = URL_DB + "project/client/" + id;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("language", language);
        return restTemplate.getForEntity(builder.toUriString(), ProjectFull.class);
    }

    @GetMapping(value = "/project")
    @ResponseBody
    public ResponseEntity<CustomPage<ProjectShort>> getProject(
            @PageableDefault()
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "dti", direction = Sort.Direction.DESC),
            }) Pageable pageable,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language) {
        String url = URL_DB + "project/client";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("page", String.valueOf(pageable.getPageNumber()))
                .queryParam("size", String.valueOf(pageable.getPageSize()))
                .queryParam("sort", pageable.getSort().toString().replace(": ", ",")
                        .replace(" ", ""))
                .queryParam("language", language);
        final ParameterizedTypeReference<CustomPage<ProjectShort>> responseType =
                new ParameterizedTypeReference<CustomPage<ProjectShort>>() {
                };
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, responseType);
    }

    @GetMapping(value = "/news/{id}")
    @ResponseBody
    public ResponseEntity<NewsDtoFull> getNewsByid(
            @PathVariable long id,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language) {
        String url = URL_DB + "news/client/" + id;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("language", language);
        return restTemplate.getForEntity(builder.toUriString(), NewsDtoFull.class);
    }

    @GetMapping(value = "/news")
    @ResponseBody
    public ResponseEntity<PageNewsDto> getNews(
            @PageableDefault()
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "datePublic", direction = Sort.Direction.DESC),
            }) Pageable pageable,
            @RequestParam(value = "language", required = false, defaultValue = "ru") String language) {
        String url = URL_DB + "news/client";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("page", String.valueOf(pageable.getPageNumber()))
                .queryParam("size", String.valueOf(pageable.getPageSize()))
                .queryParam("sort", pageable.getSort().toString().replace(": ", ",").replace(" ", ""))
                .queryParam("language", language);
        final ParameterizedTypeReference<PageNewsDto> responseType =
                new ParameterizedTypeReference<PageNewsDto>() {
                };
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, responseType);
    }

    @GetMapping(value = "/vacancy/{id}")
    @ResponseBody
    public ResponseEntity<Vacancy> getVacancyById(@PathVariable long id) {
        String url = URL_DB + "vacancy/" + id;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        ResponseEntity<Vacancy> result = restTemplate.getForEntity(builder.toUriString(), Vacancy.class);
        return new ResponseEntity<>(result.getStatusCode() == HttpStatus.OK ? result.getBody() : null,
                result.getStatusCode());
    }

    @GetMapping(value = "/vacancies")
    @ResponseBody
    public ResponseEntity<CustomPage<Vacancy>> getVacancies(
            @PageableDefault()
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "dti", direction = Sort.Direction.DESC),
            }) Pageable pageable) {
        String url = URL_DB + "vacancy";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("page", String.valueOf(pageable.getPageNumber()))
                .queryParam("size", String.valueOf(pageable.getPageSize()))
                .queryParam("sort", pageable.getSort().toString().replace(": ", ",")
                        .replace(" ", ""));
        final ParameterizedTypeReference<CustomPage<Vacancy>> responseType =
                new ParameterizedTypeReference<CustomPage<Vacancy>>() {
                };
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, responseType);
    }


    @GetMapping(value = "/image/{id}")
    @ResponseBody
    public ResponseEntity getImageById(@PathVariable long id, HttpServletResponse response) throws IOException {
        String url = URL_DB + "file/" + id;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        try {
            ResponseEntity<byte[]> result = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null,
                    byte[].class);
            response.setContentType(result.getHeaders().getContentType().toString());
            response.setHeader("Content-Disposition", result.getHeaders().getContentDisposition().toString());
            response.getOutputStream().write(result.getBody());
            return new ResponseEntity(HttpStatus.OK);
        } catch (org.springframework.web.client.HttpClientErrorException exception) {
            return new ResponseEntity(HttpStatus.valueOf(exception.getStatusCode().value()));
        }
    }

}
