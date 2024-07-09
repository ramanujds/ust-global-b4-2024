package com.trmgapp.service;

import com.trmgapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    Trainee save(Trainee trainee);
    void delete(int id);
    Trainee findById(int id);
    List<Trainee> findAll();
}
