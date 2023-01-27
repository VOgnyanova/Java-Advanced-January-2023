package _05_02_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class _03_CustomMinFunction {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Consumer<List<Integer>> printNumber = list -> System.out.println(Collections.min(list));
        printNumber.accept(numbers);

    }
}