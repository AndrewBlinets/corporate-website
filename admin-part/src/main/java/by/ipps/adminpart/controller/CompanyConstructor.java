package by.ipps.adminpart.controller;

import by.ipps.adminpart.entity.Company;
import by.ipps.adminpart.utils.restTemplate.CompanyRestTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyConstructor {

    private static CompanyRestTemplate restTemplate;

    public CompanyConstructor(CompanyRestTemplate companyService) {
        this.restTemplate = companyService;
    }

    @GetMapping
    @ResponseBody
    public Company getInformationAboutCompany() {
        return restTemplate.getActualInfo();
    }

    @PostMapping
    public Company setInformationAboutCompany(@RequestBody Company company) {
        return restTemplate.setActualInfo(company);
    }
}
