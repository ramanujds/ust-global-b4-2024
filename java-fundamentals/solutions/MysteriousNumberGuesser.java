package solutions;

import java.util.Random;
import java.util.Scanner;

public class MysteriousNumberGuesser {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random rnd = new Random();

            int mys = rnd.nextInt(100);

            System.out.print("Guess the mysterious number: ");
            int c = sc.nextInt();

            while (c != mys) {
                if (Math.abs(c-mys)<=10) {
                    System.out.println("You are getting closer!!");
                    System.out.print("Guess the mysterious number: ");
                    c = sc.nextInt();
                } else {
                    System.out.println("You are far away!!");
                    System.out.print("Guess the mysterious number: ");
                    c = sc.nextInt();
                }
            }

            System.out.println("Congratulations you found the number!!!");
        }

    }

