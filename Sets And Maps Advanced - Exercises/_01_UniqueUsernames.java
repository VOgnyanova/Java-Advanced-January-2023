package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> words = new LinkedHashSet<>();

        for (int countWords = 1; countWords <= n; countWords++) {
            String word = scanner.nextLine();
            words.add(word);

        }
        words.forEach(System.out::println);
    }
}
