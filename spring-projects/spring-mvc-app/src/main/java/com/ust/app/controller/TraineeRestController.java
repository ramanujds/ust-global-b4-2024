package com.ust.app.controller;

import com.ust.app.model.Trainee;
import com.ust.app.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeRestController {

    @Autowired
    private TraineeRepository traineeRepo;

    @GetMapping("/{id}")
    public Trainee getTrainee(@PathVariable("id") int id){
        Trainee trainee = traineeRepo.getTraineeById(id);
        return trainee;
    }

}
