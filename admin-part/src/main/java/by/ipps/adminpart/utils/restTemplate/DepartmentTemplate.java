package by.ipps.adminpart.utils.restTemplate;

import by.ipps.adminpart.entity.BaseEntity;
import by.ipps.adminpart.entity.Department;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DepartmentTemplate extends BaseEntityTemplate {

//    public <T extends BaseEntity> T findById(Long id) {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<T> response = restTemplate.getForEntity( "http://localhost:8082/dao/department/" + id,
//                null, Department.class);
//        return response.getBody();
//    }
}
