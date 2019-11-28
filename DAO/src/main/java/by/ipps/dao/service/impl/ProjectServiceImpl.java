package by.ipps.dao.service.impl;

import by.ipps.dao.entity.Project;
import by.ipps.dao.repository.ProjectRepository;
import by.ipps.dao.service.ProjectService;
import by.ipps.dao.service.base.BaseEntityServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProjectServiceImpl extends BaseEntityServiceImpl<Project, ProjectRepository> implements ProjectService {

    private ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Page<Project> findPagingRecordsForClient(Pageable pageable) {
        return repository.findByStatusR(pageable, "A");
    }

    @Override
    public Project findByIdForClient(Long id) {
        return repository.findByIdAndStatusR(id, "A").orElse(null);
    }
}