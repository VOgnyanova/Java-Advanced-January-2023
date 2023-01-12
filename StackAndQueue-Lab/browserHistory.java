package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentURL = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!currentURL.equals("Home")) {
            if (currentURL.equals("back")) {

                if (stack.isEmpty() || stack.size() == 1) {
                    System.out.println("no previous URLs");

                    currentURL = scanner.nextLine();
                    continue;
                }
                stack.pop();

            } else {
                stack.push(currentURL);
            }
            System.out.println(stack.peek());
            currentURL = scanner.nextLine();
        }
    }
}
