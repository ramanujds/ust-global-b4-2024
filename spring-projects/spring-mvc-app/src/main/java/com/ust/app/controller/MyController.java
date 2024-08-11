package com.ust.app.controller;

import com.ust.app.model.Trainee;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class MyController {


    @GetMapping("/date")
    public void showDate(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Date and Time : "+LocalDateTime.now().toLocalDate());
    }

    @GetMapping("/message")
    public String showMessage(){
        System.out.println("Good Evening");
        return "index.html";
    }

    @GetMapping("/info")
    public String showInfo(Model m){
        Trainee trainee = new Trainee(1,"Suhas","Bangalore");
        m.addAttribute("trainee",trainee);
        return "show-info.jsp";
    }

}
