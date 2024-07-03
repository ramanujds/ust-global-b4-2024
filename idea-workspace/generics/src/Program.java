import java.util.ArrayList;
import java.util.List;

public class Program {

    public static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        sum(ints);

        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        sum(doubles);

        List<String> strings = List.of("1", "2", "3");
        // sum(strings); // Compilation error

    }
}
