package by.ipps.dao.service.impl;

import by.ipps.dao.entity.Company;
import by.ipps.dao.repository.CompanyRepository;
import by.ipps.dao.service.CompanyService;
import by.ipps.dao.service.base.BaseEntityServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends BaseEntityServiceImpl<Company, CompanyRepository> implements CompanyService {
    public CompanyServiceImpl(CompanyRepository repository) {
        super(repository);
        this.repository = repository;
    }

    private static CompanyRepository repository;

    @Override
    public Company getActualInfo() {
        return repository.findByStatusR("A");
    }
}
