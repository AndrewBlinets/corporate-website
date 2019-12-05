package by.ipps.adminpart.utils.resttemplate.impl;

import by.ipps.adminpart.entity.Department;
import by.ipps.adminpart.utils.resttemplate.DepartmentRestTemplate;
import by.ipps.adminpart.utils.resttemplate.base.AbstractBaseEntityRestTemplate;
import org.springframework.stereotype.Component;

@Component
public class DepartmentTemplate extends AbstractBaseEntityRestTemplate<Department> implements DepartmentRestTemplate {
}
