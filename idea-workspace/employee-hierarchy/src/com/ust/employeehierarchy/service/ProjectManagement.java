package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Project;
import com.ust.employeehierarchy.model.ProjectStatus;
import com.ust.employeehierarchy.model.types.Manager;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagement {

    List<Project> projects = new ArrayList<>();

    public void createProject(Project project){
        projects.add(project);
    }

    public void updateStatus(int id, ProjectStatus status){
        projects.stream().filter(p->p.getId()==id)
                .findFirst().ifPresent(p->p.setStatus(status));
    }

    public void updateManager(int id, Manager manager){
        projects.stream().filter(p->p.getId()==id)
                .findFirst().ifPresent(p->p.setProjectManager(manager));
    }

    public List<Project> getAllProjects(){
        return projects;
    }

}
