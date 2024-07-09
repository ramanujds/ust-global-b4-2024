package com.trmgapp.service;

import com.trmgapp.model.Trainee;
import com.trmgapp.repository.TraineeRepository;
import com.trmgapp.repository.TraineeRepositoryImpl;

import java.util.List;

public class TraineeServiceImpl implements TraineeService {

    private final TraineeRepository traineeRepository;

    public TraineeServiceImpl() {
        this.traineeRepository = new TraineeRepositoryImpl();
    }

    public TraineeServiceImpl(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    @Override
    public Trainee save(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    @Override
    public void delete(int id) {
       traineeRepository.delete(id);
    }

    @Override
    public Trainee findById(int id) {
        return traineeRepository.findById(id);
    }

    @Override
    public List<Trainee> findAll() {
        return traineeRepository.findAll();
    }
}
