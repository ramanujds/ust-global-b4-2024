package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;

import java.util.List;

public interface TraineeRepository {

    public Trainee addTrainee(Trainee trainee);
    public Trainee updateTrainee(Trainee trainee);
    public void deleteTrainee(int id);
    public Trainee getTrainee(int id);
    public List<Trainee> getAllTrainees();

}
