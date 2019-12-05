package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.Project;
import by.ipps.adminpart.utils.resttemplate.ProjectRestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/project")
public class ProjectController extends BaseEntityAbstractController<Project, ProjectRestTemplate>
        implements BaseEntityController<Project> {

    protected ProjectController(ProjectRestTemplate projectTemplate) {
        super(projectTemplate, "/project");
    }

}
