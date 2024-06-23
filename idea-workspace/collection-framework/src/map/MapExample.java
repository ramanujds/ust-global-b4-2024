package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> trainees = new HashMap<>();

        trainees.put("Gaurav","Bangalore");
        trainees.put("Rose","Kerala");
        trainees.put("Sandra","Kerala");
        trainees.put("Abel","Kerala");

       // System.out.println(trainees.get("Harsh"));

        for (String key:trainees.keySet()){
            System.out.println(key+ " : "+trainees.get(key));
        }

    }
}
