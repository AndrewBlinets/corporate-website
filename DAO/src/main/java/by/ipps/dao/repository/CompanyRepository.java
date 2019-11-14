package by.ipps.dao.repository;

import by.ipps.dao.entity.Company;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends BaseEntityRepository<Company> {
    Company findByStatusR(String a);
}
