package GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {

            String string = scanner.nextLine();
            box.add(string);
        }

        String[] indexes = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        if (firstIndex < box.length() && secondIndex < box.length()) {
            box.swap(firstIndex, secondIndex);
        }else {
            throw new IndexOutOfBoundsException("Invalid indexes!");
        }

        System.out.println(box);
    }
}
