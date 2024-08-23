package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepository;

    public Trainee addTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    public Trainee updateTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    public void deleteTrainee(int id) {
        traineeRepository.deleteById(id);
    }

    public Trainee getTrainee(int id) {
        return traineeRepository.findById(id).get();
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }
}
