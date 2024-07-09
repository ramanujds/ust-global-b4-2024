package com.trmgapp.repository;

import com.trmgapp.model.Trainee;

import java.util.List;

public interface TraineeRepository {

    Trainee save(Trainee trainee);
    void delete(int id);
    Trainee findById(int id);
    List<Trainee> findAll();

}
