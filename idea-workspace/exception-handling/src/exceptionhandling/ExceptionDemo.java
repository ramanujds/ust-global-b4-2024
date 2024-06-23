package exceptionhandling;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = 'y';
        do {
            System.out.println("Hello");
            System.out.println("Please enter two numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Doing a divide operation");
            try {
                int result = a / b;
                System.out.println("Completed the operation");
                System.out.println("Result : " + result);
            }
            catch (ArithmeticException ex){
                System.out.println("Sorry cannot divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
            catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }

            System.out.println("Thank You");
            System.out.println("Do you want to do a new calculation?");
            ch = (scanner.next() + scanner.nextLine()).charAt(0);
        }
        while (ch=='y');



    }
}
