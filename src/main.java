import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.PrintWriter;

public class main {
    public static void main(String[] args) {
        String fileName = "file.txt"; // Numele fisierului
        String path=Path.of("").toAbsolutePath()+"\\file.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("Un string");
            printWriter.printf(" %s is %s", "Florin", "a Student"+"\n");

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            FileWriter fileWriter1 = new FileWriter(fileName);
            PrintWriter printWriter1 = new PrintWriter(fileWriter1);
            printWriter.print("Doi string");
            printWriter.printf(" %s is %s", "Mihai", "a Student");
            printWriter.close();
            reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea fisierului: " + e.getMessage());
        }

    }
}