package stacksAndQueuesLab;

import java.util.*;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split("\\s+");

        List<String> partsList = Arrays.asList(expressionParts);

        Collections.reverse(partsList);

        for (String parts : partsList) {
            stack.push(parts);
        }
        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());
            int result;
            switch (operation) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println("Unknown operation!");
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
