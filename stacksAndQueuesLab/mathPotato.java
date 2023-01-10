package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();

        for (String child : children) {
            childrenQueue.offer(child);
        }

        int cycle = 1;
        while (childrenQueue.size() != 1) {
            for (int i = 1; i < numberOfTurns; i++) {
                String currentChild = childrenQueue.poll();
                if (currentChild != null) {
                    childrenQueue.offer(currentChild);
                }
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + childrenQueue.peek());
            } else {
                System.out.println("Removed " + childrenQueue.pop());
            }
            cycle++;
        }
        String lastChild = childrenQueue.peek();
        System.out.printf("Last is %s", lastChild);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
