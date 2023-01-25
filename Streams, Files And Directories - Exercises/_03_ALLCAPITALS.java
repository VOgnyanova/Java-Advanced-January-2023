package _04_02_StreamsFilesAndDirectoriesExercises;

import java.io.*;


public class _03_ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String pathToFile = "C:\\Users\\user\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));

        String line = reader.readLine();
        while (line != null) {
            writer.write(line.toUpperCase());
            writer.newLine();

            line = reader.readLine();
        }
        writer.close();
    }
}