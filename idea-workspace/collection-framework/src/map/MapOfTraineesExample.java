package map;

import model.Trainee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapOfTraineesExample {

    public static void main(String[] args) {

        Trainee t1 = new Trainee(1, "Alice", "London");
        Trainee t2 = new Trainee(2, "Bob", "New York");
        Trainee t3 = new Trainee(3, "Charlie", "Paris");
        Trainee t4 = new Trainee(4, "David", "Tokyo");

        Map<Integer, Trainee> trainees = new ConcurrentHashMap<>();
        trainees.put(t1.getId(), t1);
        trainees.put(t2.getId(), t2);
        trainees.put(t3.getId(), t3);
        trainees.put(t4.getId(), t4);


        // Search a Trainee by id

        int id = 2;
        Trainee trainee = trainees.get(id);


        System.out.println(trainee);

    }

}
