package _05_01_FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());

        numbers.removeIf(num -> num % 2 != 0);

        printWithSeparator(numbers);

        System.out.println();
        List<Integer> sortedNumbers = numbers
                .stream().sorted()
                .collect(Collectors.toList());
        printWithSeparator(sortedNumbers);


    }

    private static void printWithSeparator(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }

        }
    }
}
