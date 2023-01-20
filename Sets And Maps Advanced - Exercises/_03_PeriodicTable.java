package _03_02_SetsAndMapsAdvancedExercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            for (String element : elements) {
                chemicalElements.add(element);
            }
        }
        chemicalElements.forEach(e -> System.out.print(e + " "));

    }
}
