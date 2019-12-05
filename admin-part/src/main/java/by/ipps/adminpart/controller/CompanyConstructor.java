package by.ipps.adminpart.controller;

import by.ipps.adminpart.entity.Company;
import by.ipps.adminpart.utils.resttemplate.impl.CompanyRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyConstructor {

    private CompanyRestTemplate restTemplate;

    public CompanyConstructor(CompanyRestTemplate companyService) {
        this.restTemplate = companyService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Company> getInformationAboutCompany() {
        return restTemplate.getActualInfo();
    }

    @PostMapping
    public ResponseEntity<Company> setInformationAboutCompany(@RequestBody Company company) {
        return restTemplate.setActualInfo(company);
    }
}
