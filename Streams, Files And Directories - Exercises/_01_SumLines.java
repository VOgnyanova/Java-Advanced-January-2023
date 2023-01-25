package _04_02_StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _01_SumLines {
    public static void main(String[] args) throws IOException {


        String pathFile = "C:\\Users\\user\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathFile));

        for (String line : allLines) {
            int sum = 0;
            for (char symbol : line.toCharArray()){
                sum+= symbol;
            }
            System.out.println(sum);
        }
    }
}
