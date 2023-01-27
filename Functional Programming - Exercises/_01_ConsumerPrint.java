package _05_02_FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;


public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println(name);

        for (String name : names) {
            printName.accept(name);
        }
    }
}
