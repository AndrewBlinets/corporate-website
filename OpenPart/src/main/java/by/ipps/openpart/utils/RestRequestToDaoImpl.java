package by.ipps.openpart.utils;

import by.ipps.openpart.entity.BaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRequestToDaoImpl<T extends BaseEntity> {
    private T classT;

    //    public T restPostRequest(T t, String path) {
//
////        return response.getBody();
//    }

//    public T restPostRequest(String path) {
//        RestTemplate restTemplate = new RestTemplate();
//
//        ResponseEntity<T> response = restTemplate.postForEntity( "http://localhost:8082/dao/" + path,
//                t , T.class);
//        return response.getBody();
//    }


    public T restPostRequest(BaseEntity baseEntity, String path) {
        RestTemplate restTemplate = new RestTemplate();
//
//        return restTemplate.postForEntity( "http://localhost:8082/dao/" + path,
//                t , T.class).getBody();
        return null;
    }

    public T restGetRequest(String path) {
        RestTemplate restTemplate = new RestTemplate();
        return (T) restTemplate.getForObject("http://localhost:8082/dao/" + path, classT.getClass());
    }
}
