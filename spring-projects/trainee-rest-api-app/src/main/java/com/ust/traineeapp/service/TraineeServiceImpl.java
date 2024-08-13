package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeJPARepository;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeJPARepository traineeRepo;

    public Trainee addTrainee(Trainee trainee) {
        return traineeRepo.save(trainee);
    }

    public Trainee updateTrainee(Trainee trainee) {
        return traineeRepo.save(trainee);
    }

    public void deleteTrainee(int id) {
        traineeRepo.deleteById(id);
    }

    public Trainee getTrainee(int id) {
        return traineeRepo.findById(id).orElse(null);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepo.findAll();
    }
}
