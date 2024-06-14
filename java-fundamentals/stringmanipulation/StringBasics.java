package stringmanipulation;

public class StringBasics {
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("  hello world!  ");

//        // Comparing two strings
//        System.out.println(str1.equals(str2));
//
//        // Comparing two strings ignoring case
//        System.out.println(str1.equalsIgnoreCase(str2));

        str2.strip();

        StringBuilder sb1 = new StringBuilder(str1);

        System.out.println("-".repeat(100));


        sb1.reverse();

        System.out.println(sb1);


    }

}
