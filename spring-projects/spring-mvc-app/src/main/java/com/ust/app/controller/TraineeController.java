package com.ust.app.controller;

import com.ust.app.model.Trainee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

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
        return "show-info.jsp";
    }

}
