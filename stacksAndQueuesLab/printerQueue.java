package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printerQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String input = scanner.nextLine();


        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                String output = printerQueue.isEmpty()
                        ? "Printer is on standby"
                        : "Canceled " + printerQueue.poll();

                System.out.println(output);


            } else {
                printerQueue.offer(input);
            }


            input = scanner.nextLine();
        }

        for (String file : printerQueue) {
            System.out.println(file);
        }
    }
}
