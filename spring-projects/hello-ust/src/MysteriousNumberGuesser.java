import java.util.Random;
import java.util.Scanner;

public class MysteriousNumberGuesser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Mysterious Number Guesser!");

        final int MAX_ATTEMPTS=2;

        // Generate a number between 1 and 100

        Random random = new Random();

        int mysteriousNumber = random.nextInt(100) + 1;
        System.out.println("I have selected a number between 1 and 100. Can you guess it? : ");
        // Read a number from user
        // Number between 1-100 (don't count that attempt)
        // Show Hints like please go backward/forward
        // if 50% of the attempts are over

        // if 50% of the attempts are over and you are still far away
        // then show the random no. 5_

        for (int i = 0; i < MAX_ATTEMPTS; i++ ) {
            System.out.print("Input a number : ");
            int input = scan.nextInt();
            if(input<=0 || input>100){
                System.out.println("Invalid Input");
                i--;
                continue;
            }
            int diff = input - mysteriousNumber;
            if (diff == 0) {
                System.out.println("Congrats...");
                break;
            } else if (diff <= 10 && diff >= -10) {
                if(i > MAX_ATTEMPTS/2){
                    if(diff>0){
                        System.out.println("Please go backward");
                    }
                    else{
                        System.out.println("Please go forward");
                    }
                }
                else {
                    System.out.println("You're getting close!");
                }
            } else {
                System.out.println("You're far away!");
            }

        }

    }

}
