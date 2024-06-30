package characterstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("info.txt",true);
            writer.append("hello sir, ");
            writer.append("how are you? ");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
