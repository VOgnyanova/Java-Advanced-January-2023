package _04_01_StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class _01_ReadFile {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\user\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        try (InputStream inputStream = new FileInputStream(filePath)) {

            int readByte= inputStream.read();
            while (readByte >= 0){
                System.out.print(Integer.toBinaryString(readByte)+ " ");

                readByte = inputStream.read();
            }


        }catch (IOException e){
            throw  new RuntimeException(e);
        }


    }
}
