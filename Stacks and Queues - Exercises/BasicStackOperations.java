package ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]); // count of elements to add
        int s = Integer.parseInt(input[1]); // count of elements to pop
        int x = Integer.parseInt(input[2]);// number we are looking for

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));

        }
        for (int i = 0; i < s; i++) {
            stack.pop();

        }
        if (stack.isEmpty()) {
            System.out.println("0");
        } else if (stack.contains(x)) {
            System.out.println("true");

        } else {
            int minElement = Integer.MAX_VALUE;
            for (Integer number : stack) {
                if (number < minElement) {

                    minElement = number;
                }
            }
            System.out.println(minElement);
        }

    }
}