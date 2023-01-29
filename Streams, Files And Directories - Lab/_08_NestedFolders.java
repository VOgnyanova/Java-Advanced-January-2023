package _04_01_StreamsFilesAndDirectoriesLab;



import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;

public class _08_NestedFolders {
    public static void main(String[] args) throws IOException {

        Path paths = Paths.get("C:\\Users\\user\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File root = paths.toFile();
        Deque<File> queue = new ArrayDeque<>();
        int counter =1;
        queue.offer(root);
        System.out.println(queue.peek().getName());
        while (!queue.isEmpty()) {
            File file = queue.poll();
            File[] files = file.listFiles();
            for (File current : files) {
                if (current.isDirectory()) {
                    System.out.println(current.getName());
                    queue.offer(current);
                    counter++;
                }
            }
        }
        System.out.printf("%d folders", counter);
    }
}