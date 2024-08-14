package com.ust.traineeapp.api;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainees")
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

   @GetMapping
   @ResponseStatus(HttpStatus.OK)
    public List<Trainee> getAllTrainees(){
       return traineeService.getAllTrainees();
   }

   @GetMapping("/{id}")
   @ResponseStatus(HttpStatus.OK)
    public Trainee getTrainee(@PathVariable("id") int id){
       return traineeService.getTrainee(id);
   }

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
    public Trainee addTrainee(@RequestBody Trainee trainee){
       return traineeService.addTrainee(trainee);
   }

   @DeleteMapping("/{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainee(@PathVariable int id){
       traineeService.deleteTrainee(id);
   }

   @PutMapping
   @ResponseStatus(HttpStatus.ACCEPTED)
   public Trainee updateTrainee(@RequestBody Trainee trainee){
       return traineeService.updateTrainee(trainee);
   }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Trainee getTraineeByName(@PathVariable("name") String name){
        return traineeService.getTraineeByName(name);
    }

    @GetMapping("/location/{location}")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainee> getTraineesByLocation(@PathVariable("location") String location) {
        return traineeService.getTraineesByLocation(location);
    }

}
