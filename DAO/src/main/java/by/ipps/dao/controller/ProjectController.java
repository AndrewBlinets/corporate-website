package by.ipps.dao.controller;

import by.ipps.dao.controller.base.BaseEntityAbstractController;
import by.ipps.dao.controller.base.BaseEntityController;
import by.ipps.dao.entity.Project;
import by.ipps.dao.service.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController extends BaseEntityAbstractController<Project, ProjectService>
        implements BaseEntityController<Project> {

    protected ProjectController(ProjectService projectService) {
        super(projectService);
    }

}
