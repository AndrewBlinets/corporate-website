package by.ipps.dao.service;

import by.ipps.dao.entity.Company;
import by.ipps.dao.service.base.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService extends BaseEntityService<Company> {
    Company getActualInfo();
}
