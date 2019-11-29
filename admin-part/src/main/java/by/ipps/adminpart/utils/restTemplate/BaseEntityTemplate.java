package by.ipps.adminpart.utils.restTemplate;

import by.ipps.adminpart.custom.CustomPage;
import by.ipps.adminpart.entity.BaseEntity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class BaseEntityTemplate<T extends BaseEntity> {
    private String urlServer = "http://localhost:8082/dao/";

    public <T extends BaseEntity> T findById(Long id, String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T> response = restTemplate.getForEntity( "http://localhost:8082/dao/" + url + "/" + id,
                null, new ParameterizedTypeReference<T>() {});
        return response.getBody();
    }

    public CustomPage<T> findPagingRecords(long page, int size, String sort, String language,
                                                                  String url) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlServer + url)
                .queryParam("page", String.valueOf(page))
                .queryParam("size", String.valueOf(size))
                .queryParam("sort", sort)
                .queryParam("language", language);
        final ParameterizedTypeReference<CustomPage<T>> responseType =
                new ParameterizedTypeReference<CustomPage<T>>() {
                };
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, responseType).getBody();
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<CustomPage<T>> response = restTemplate.getForEntity(
//                "http://localhost:8082/dao/" + url,
//                null, new ParameterizedTypeReference<CustomPage<T>>() {});
//        return response.getBody();
    }
}
