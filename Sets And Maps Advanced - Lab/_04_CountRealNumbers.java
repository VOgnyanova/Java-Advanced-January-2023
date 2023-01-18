package _03_01_SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> occurrencesNumbers = new LinkedHashMap<>();
        String[] numbers = scanner.nextLine().split(" ");

        for (String num : numbers) {
            double currentNum = Double.parseDouble(num);
            if (occurrencesNumbers.containsKey(currentNum)) {
                int count = occurrencesNumbers.get(currentNum);
                occurrencesNumbers.put(currentNum, count + 1);

            } else {
                occurrencesNumbers.put(currentNum, 1);
            }
        }
        for (Double currentNumber : occurrencesNumbers.keySet()) {
            System.out.printf("%.1f -> %d%n", currentNumber, occurrencesNumbers.get(currentNumber));
        }


    }
}
