package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    public Trainee addTrainee(Trainee trainee);
    public Trainee updateTrainee(Trainee trainee);
    public void deleteTrainee(int id);
    public Trainee getTrainee(int id);
    public List<Trainee> getAllTrainees();

    public Trainee getTraineeByName(String name);

    public List<Trainee> getTraineesByLocation(String location);

}
