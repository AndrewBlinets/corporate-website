package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.Department;
import by.ipps.adminpart.utils.restTemplate.DepartmentTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DepartmentController extends BaseEntityAbstractController<Department, DepartmentTemplate>
        implements BaseEntityController<Department> {

    private final DepartmentTemplate departmentTemplate;

    public DepartmentController(DepartmentTemplate departmentTemplate) {
        super(departmentTemplate, "department");
        this.departmentTemplate = departmentTemplate;
    }

//    @GetMapping("/{id}")
//    @ResponseBody
//    public Department getDepartmentById(@PathVariable long id){
//        return departmentTemplate.findById(id, url);
//    }
}
