package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> stack = new ArrayDeque<>();
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) {
            System.out.println(0);

        }

        while (number > 0) {
            int bit = number % 2;
            stack.push(String.valueOf(bit));
            number /=  2;

        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }


    }
}