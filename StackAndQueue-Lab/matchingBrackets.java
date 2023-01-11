package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class matchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        ArrayDeque<Integer> index = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                index.push(i);
            } else if (input.charAt(i) == ')') {
                int openIndex = index.pop();
                String expression = input.substring(openIndex, i + 1);
                System.out.println(expression);
            }

        }

    }
}
