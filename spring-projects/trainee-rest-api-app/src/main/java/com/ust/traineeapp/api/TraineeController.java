package com.ust.traineeapp.api;

import com.ust.traineeapp.model.Trainee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trainees")
public class TraineeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Trainee App!";
    }

    @GetMapping
    public Trainee getTrainee() {
        return new Trainee(1, "John Doe", "USA");
    }


}
