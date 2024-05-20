package com.ust.employeehierarchy.model;

import com.ust.employeehierarchy.model.types.Manager;

import java.time.LocalDate;

public class Project {

    int id;
    String name;
    LocalDate startDate;
    ProjectStatus status;
    Manager projectManager;

    public Project(int id, String name, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public Manager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Manager projectManager) {
        this.projectManager = projectManager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
