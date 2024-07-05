package sortedcollections;

import model.Trainee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(10,20,40,35,22,7,18);
//
//        List<String> list = Arrays.asList("Shreya","Suhas","Abel","Vishnu");

        List<Trainee> trainees = new ArrayList<>();

        Trainee t1 = new Trainee(1,"Rose","Kerala");
        Trainee t2 = new Trainee(2, "Gaurav","Bangalore");
        Trainee t3 = new Trainee(3,"Sandra","Kerala");
        Trainee t4 = new Trainee(4, "Vishnu","Bangalore");

        trainees.add(t1);
        trainees.add(t4);
        trainees.add(t2);
        trainees.add(t3);

        System.out.println("Before sorting : ");
        trainees.forEach(t-> System.out.println(t));

        Collections.sort(trainees,(tr1,tr2)->tr1.getName().compareTo(tr2.getName()));

        System.out.println("After sorting : ");
        trainees.forEach(t-> System.out.println(t));

        Collections.sort(trainees,(tr1,tr2)->tr1.getId()-tr2.getId());

        System.out.println("After sorting : ");
        trainees.forEach(t-> System.out.println(t));

    }
}
