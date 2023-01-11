package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentURL = scanner.nextLine();


        ArrayDeque<String> backwardHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!currentURL.equals("Home")) {

            if (currentURL.equals("back")) {
                if (backwardHistory.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.addFirst(backwardHistory.pop());
                    System.out.println(backwardHistory.peek());
                }


            } else if (currentURL.equals("forward")) {
                if (!forwardHistory.isEmpty()) {
                    System.out.println(forwardHistory.peek());
                    backwardHistory.push(forwardHistory.poll());


                } else {
                    System.out.println("no next URLs");
                }
            } else {
                backwardHistory.push(currentURL);
                forwardHistory.clear();
                System.out.println(currentURL);


            }
            currentURL = scanner.nextLine();

        }


    }
}