import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputToFile {
    public static void main(String[] args) {
        String filename = "test.txt";

        if (args.length > 0) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                for (String arg : args) {
                    writer.write(arg);
                }
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
