package streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

        List<String> list = List.of("Javed","Karan","Mohit","Suraj","Jaya");

//        stream.forEach(value-> System.out.println(value));
//        stream.forEach(value-> System.out.println(value));

        // stream methods

        // find all the names starts with J
        // Convert then to uppercase

//        List<String> result = list.stream()
//                                .filter(value -> value.startsWith("J"))
//                                .map(value->value.toUpperCase())
//                                .toList();

        String result = list.stream()
                .filter(value -> value.startsWith("J"))
                .map(value->value.toUpperCase())
                .collect(Collectors.joining(","));

        System.out.println(result);

    }
}
