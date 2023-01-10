package stacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");


        ArrayDeque<String> nameKid = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            nameKid.offer(input[i]);

        }
        int num = Integer.parseInt(scanner.nextLine());

        while (nameKid.size() != 1) {
            for (int i = 0; i < num; i++) {
                if (i == num - 1) {
                    String currentKid = nameKid.poll();
                    System.out.println("Removed " + currentKid);

                } else {
                    String currentName = nameKid.poll();
                    nameKid.offer(currentName);
                }
            }
        }
        System.out.println("Last is " + nameKid.peek());

    }
}
