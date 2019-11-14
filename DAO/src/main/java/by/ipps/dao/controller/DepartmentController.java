package by.ipps.dao.controller;

import by.ipps.dao.controller.base.BaseEntityAbstractController;
import by.ipps.dao.controller.base.BaseEntityController;
import by.ipps.dao.entity.Department;
import by.ipps.dao.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DepartmentController extends BaseEntityAbstractController<Department, DepartmentService>
        implements BaseEntityController<Department> {

    protected DepartmentController(DepartmentService departmentService) {
        super(departmentService);
    }
}
