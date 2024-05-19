package com.ust.app;

import com.ust.app.model.Trainee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello UST!");

        Trainee trainee1 = new Trainee(1,"John", "john@abc.com",
                "Kochi","Kochi Institute Of Engineering");
        Trainee.setCompany("UST");



        Trainee trainee2 = new Trainee(2,"Rose James", "james@abc.com",
                "Kochi","Kochi Institute Of Engineering");

        Trainee.setCompany("UST Global");

        trainee2.setCity("Bangalore");

        trainee1.displayTrainee();

        trainee2.displayTrainee();


    }
}