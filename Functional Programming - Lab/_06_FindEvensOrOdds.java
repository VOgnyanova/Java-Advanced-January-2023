package _05_01_FunctionalProgrammingLab;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class _06_FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filterCondition = oddOrEven.equals("odd") ?
                (x -> x % 2 != 0) :
                (x -> x % 2 == 0);


        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));


    }
}
