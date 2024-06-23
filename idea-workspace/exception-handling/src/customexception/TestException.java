package customexception;

import java.util.Scanner;

public class TestException {

    public static void checkAge(int age) throws InvalidAgeException{
        if (age<=0 || age>=150){
            throw new InvalidAgeException("Sorry Invalid Age : "+age);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("Welcome");
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }




    }

}
