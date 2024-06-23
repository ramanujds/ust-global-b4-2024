package set;

import model.Trainee;

import java.util.HashSet;
import java.util.Set;

public class TraineeSetExample {

    public static void main(String[] args) {

        Set<Trainee> trainees = new HashSet<>();

        Trainee t1 = new Trainee(1,"Rose","Kerala");
        Trainee t2 = new Trainee(2, "Gaurav","Bangalore");
        Trainee t3 = new Trainee(3,"Sandra","Kerala");
        Trainee t4 = new Trainee(2, "Gaurav","Bangalore");

        trainees.add(t1);
        trainees.add(t2);
        trainees.add(t3);
        trainees.add(t4);

        for (Trainee t:trainees){
            System.out.println(t);
        }


    }

}
