package by.ipps.openpart.utils;

import by.ipps.openpart.entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRequestToDao<T extends BaseEntity> {

    public BaseEntity restPostRequest(T user, String path) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<BaseEntity> response = restTemplate.postForEntity( "http://localhost:8082/dao/" + path,
                user , BaseEntity.class);
        return response.getBody();
    }
}
