package bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFilesWithByteStream {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("info.text");

            outputStream.write("hello world".getBytes());

            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
