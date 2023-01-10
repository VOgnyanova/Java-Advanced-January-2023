package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;

        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else {


            for (int num : stack) {
                stack.pop();
                System.out.print(num);

            }
        }
    }
}