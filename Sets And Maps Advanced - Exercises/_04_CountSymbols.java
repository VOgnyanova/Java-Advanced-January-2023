package _03_02_SetsAndMapsAdvancedExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolMap = new TreeMap<>();


        for (int i = 0; i < text.length(); i++) {
            if (!symbolMap.containsKey(text.charAt(i))) {
                symbolMap.put(text.charAt(i), 1);
            } else {
                symbolMap.put(text.charAt(i), symbolMap.get(text.charAt(i)) + 1);

            }

        }
        for (Map.Entry<Character, Integer> e : symbolMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");
        }

    }
}
