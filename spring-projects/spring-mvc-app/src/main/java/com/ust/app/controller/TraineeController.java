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
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView addTrainee(@ModelAttribute Trainee trainee){
        traineeRepo.addTrainee(trainee);
        ModelAndView mv= new ModelAndView("show-info");
        mv.addObject("trainee",trainee);
        return mv;
    }

    @GetMapping("/find-trainee")
    public String getTrainee(@RequestParam("id") int id, Model m){
        Trainee trainee = traineeRepo.getTraineeById(id);
        if(trainee==null){
            m.addAttribute("msg","Trainee with id : "+id+" Not Found!!");
            return "show-error";
        }
        m.addAttribute("trainee",trainee);
        return "show-info";
    }

}
