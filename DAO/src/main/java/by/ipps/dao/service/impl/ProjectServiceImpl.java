package by.ipps.dao.service.impl;

import by.ipps.dao.entity.Project;
import by.ipps.dao.repository.ProjectRepository;
import by.ipps.dao.service.ProjectService;
import by.ipps.dao.service.base.BaseEntityServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends BaseEntityServiceImpl<Project, ProjectRepository> implements ProjectService {

    public ProjectServiceImpl(ProjectRepository repository) {
        super(repository);
    }

}
