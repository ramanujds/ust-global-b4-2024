package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TraineeService {


    public Trainee addTrainee(Trainee trainee);
    public Trainee updateTrainee(Trainee trainee);
    public void deleteTrainee(int id);
    public Trainee getTrainee(int id);
    public List<Trainee> getAllTrainees();


}
