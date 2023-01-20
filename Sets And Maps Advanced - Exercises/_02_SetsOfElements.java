package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split("\\s+")[0]);
        int m = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);

        }
        for (int i = 1; i <= m; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);

        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(e -> System.out.print(e + " "));

    }
}
