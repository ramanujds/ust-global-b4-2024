package characterstream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingWithScanner {

    public static void main(String[] args) {

        try {
            File file = new File("hello.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }

    }

}
