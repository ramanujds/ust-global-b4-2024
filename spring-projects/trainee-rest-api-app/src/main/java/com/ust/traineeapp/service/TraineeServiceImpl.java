package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepo;

    public Trainee addTrainee(Trainee trainee) {
        return traineeRepo.addTrainee(trainee);
    }

    public Trainee updateTrainee(Trainee trainee) {
        return traineeRepo.updateTrainee(trainee);
    }

    public void deleteTrainee(int id) {
        traineeRepo.deleteTrainee(id);
    }

    public Trainee getTrainee(int id) {
        return traineeRepo.getTrainee(id);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepo.getAllTrainees();
    }
}
