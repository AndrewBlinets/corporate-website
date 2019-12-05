package by.ipps.adminpart.utils.resttemplate.impl;

import by.ipps.adminpart.entity.Project;
import by.ipps.adminpart.utils.resttemplate.ProjectRestTemplate;
import by.ipps.adminpart.utils.resttemplate.base.AbstractBaseEntityRestTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProjectTemplate extends AbstractBaseEntityRestTemplate<Project> implements ProjectRestTemplate {
}
