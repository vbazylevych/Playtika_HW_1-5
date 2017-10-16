import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Dratuti!");
        File file = new File("text.txt");

        try (FileInputStream stream = new FileInputStream(file)) {

            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            List<String> strings = Files.readAllLines(file.toPath());
            for (String line : strings) {
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
        }
    }
}
