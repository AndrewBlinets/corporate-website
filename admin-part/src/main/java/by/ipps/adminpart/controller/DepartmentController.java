package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.Department;
import by.ipps.adminpart.utils.resttemplate.DepartmentRestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController extends BaseEntityAbstractController<Department, DepartmentRestTemplate>
        implements BaseEntityController<Department> {

    public DepartmentController(DepartmentRestTemplate departmentTemplate) {
        super(departmentTemplate, "department/admin");
    }
}
