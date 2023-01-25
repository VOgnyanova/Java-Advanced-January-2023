package _04_02_StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class _08_GetFolderSize {
    public static void main(String[] args) {


        String folderPath = "C:\\Users\\user\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(folderPath);

        File[] allFilesInFolder = folder.listFiles();
        int folderSize = 0;

        for (File file: allFilesInFolder){
            folderSize+= file.length();
        }
        System.out.println("Folder size: "+ folderSize);
    }
}
