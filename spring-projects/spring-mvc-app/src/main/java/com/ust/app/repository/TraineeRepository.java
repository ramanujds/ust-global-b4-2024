package com.ust.app.repository;


import com.ust.app.model.Trainee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class TraineeRepository {

    private List<Trainee> trainees;

    public TraineeRepository(){
        this.trainees=new ArrayList<>();
    }

    public Trainee addTrainee(Trainee trainee){
        trainees.add(trainee);
        return trainee;
    }

    public Trainee getTraineeById(int id){
       return trainees.stream().filter(t->t.getId()==id).findFirst()
               .orElse(null);
    }

    public List<Trainee> getAll(){
        return trainees;
    }

}
