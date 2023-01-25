package _04_02_StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _02_SumBytes {
    public static void main(String[] args) throws IOException {

        String pathFile = "C:\\Users\\user\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum = 0;
       /* List<String> allLines = Files.readAllLines(Path.of(pathFile));

        long sum = 0;
        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);
*/
        byte[] allBytes = Files.readAllBytes(Path.of(pathFile));
        for (byte ascii : allBytes) {
            if (ascii != 13 && ascii != 10) {
                sum += ascii;
            }
        }
        System.out.println(sum);
    }
}