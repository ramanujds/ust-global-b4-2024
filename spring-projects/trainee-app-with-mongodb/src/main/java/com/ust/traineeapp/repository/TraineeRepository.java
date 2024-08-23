package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TraineeRepository extends MongoRepository<Trainee,Integer> {
}
