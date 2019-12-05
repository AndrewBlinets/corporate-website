package by.ipps.site.utils.resttemplate;

import by.ipps.site.entity.Company;
import by.ipps.site.utils.resttemplate.base.AbstractBaseEntityRestTemplate;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Component
public class CompanyRestTemplate extends AbstractBaseEntityRestTemplate<Company> {

    public ResponseEntity<Company> getActualInfo() {
        return restTemplate.getForEntity( URL_SERVER + "company",
                Company.class, Company.class );
    }

    public ResponseEntity<Company> setActualInfo(Company company) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL_SERVER + "company");
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Company> requestEntity = new HttpEntity<>(company, requestHeaders);
        return restTemplate.exchange(builder.toUriString(), HttpMethod.POST,  requestEntity, Company.class);
    }
}
