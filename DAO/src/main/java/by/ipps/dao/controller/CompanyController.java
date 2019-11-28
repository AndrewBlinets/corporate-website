package by.ipps.dao.controller;

import by.ipps.dao.entity.Company;
import by.ipps.dao.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private static CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public Company getInformationAboutCompany() {
        return companyService.getActualInfo();
    }
}
