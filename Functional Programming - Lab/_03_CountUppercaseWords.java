package _05_01_FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _03_CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Predicate<String> startSWithUppercase = word -> Character.isUpperCase(word.charAt(0));

        Consumer<String> print = str -> System.out.println(str);
        List<String> list = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> startSWithUppercase.test(w))
                .collect(Collectors.toList());

        System.out.println(list.size());
        list.stream().forEach(elem -> print.accept(elem));


    }
}
