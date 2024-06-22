package lambdaexpression;

import java.util.function.Function;

interface StringOperation{
    String apply(String str);
}

// A lambda expression to take two strings and returns true if first string contains the other else returns false

interface StringTest{
    boolean isContain(String str1, String str2);
}

public class LambdaExercises {

    public static void main(String[] args) {

        StringTest test = (str1, str2) -> str1.contains(str2);

        System.out.println(test.isContain("Hello","el"));

        // Convert String to uppercase

        StringOperation toUpper = s -> s.toUpperCase();

        // Convert String to lowercase

        StringOperation toLower = s -> s.toLowerCase();

        // Remove trailing spaces

        StringOperation trim = s -> s.trim();

        // Reverse the String
        StringOperation reverse = s-> {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        };

        System.out.println(toUpper.apply("hello everyone"));

    }
}
