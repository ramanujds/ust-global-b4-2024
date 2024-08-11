package com.ust.app.controller;

import com.ust.app.model.Trainee;
import com.ust.app.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

    @Autowired
    private TraineeRepository traineeRepo;

//    @PostMapping("/add-trainee")
//    public String addTrainee(@RequestParam("id") int id,
//                             @RequestParam("name") String name,
//                             @RequestParam("location") String location,
//                             Model m){
//        Trainee trainee = new Trainee(id,name,location);
//        m.addAttribute("trainee",trainee);
//        return "show-info.jsp";
//    }

    @PostMapping("/add-trainee")
    public String addTrainee(@ModelAttribute("trainee") Trainee trainee){
        traineeRepo.addTrainee(trainee);
        return "show-info.jsp";
    }

    @GetMapping("/find-trainee")
    public String getTrainee(@RequestParam("id") int id, Model m){
        Trainee trainee = traineeRepo.getTraineeById(id);
        // Trainee with id : x not found
        m.addAttribute("trainee",trainee);
        return "show-info.jsp";
    }

}
