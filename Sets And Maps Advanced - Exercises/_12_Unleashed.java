package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _12_Unleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (!input.contains("@") || input.charAt(input.indexOf("@") - 1) != ' ') {
                input = scanner.nextLine();
                continue;

            }
            String singer = input.substring(0, input.indexOf("@") - 1);
            int firstIndexOfNumber = 0;
            for (int i = input.indexOf("@"); i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                if (Character.isDigit(currentSymbol) && input.charAt(i - 1) == ' ') {
                    firstIndexOfNumber = i;
                    break;

                }
            }
            if (firstIndexOfNumber == 0) {
                input = scanner.nextLine();

                continue;
            }
            String venue = input.substring(input.indexOf("@") + 1, firstIndexOfNumber - 1);
            String numbers = input.substring(firstIndexOfNumber);
            String[] numbersArr = numbers.split("\\s+");
            if (numbersArr.length != 2) {
                input = scanner.nextLine();
                continue;
            }


            int price = Integer.parseInt(numbersArr[0]);
            int capacity = Integer.parseInt(numbersArr[1]);


            if (!concerts.containsKey(venue)) {
                concerts.put(venue, new LinkedHashMap<>());
                LinkedHashMap<String, Integer> singers = new LinkedHashMap<>();
                singers.put(singer, price * capacity);
                concerts.put(venue, singers);
            } else {
                LinkedHashMap<String, Integer> currentSingers = concerts.get(venue);
                if (currentSingers.containsKey(singer)) {
                    currentSingers.put(singer, currentSingers.get(singer) + price * capacity);


                } else {
                    currentSingers.put(singer, price * capacity);
                }
                concerts.put(venue, currentSingers);
            }

            input = scanner.nextLine();
        }


        for (String venue : concerts.keySet()) {
            System.out.println(venue);

            LinkedHashMap<String, Integer> singers = concerts.get(venue);
            singers.entrySet().stream().sorted((singer1, singer2) -> singer2.getValue().compareTo(singer1.getValue()))
                    .forEach(singer -> System.out.println(String.format("#  %s -> %d", singer.getKey(), singer.getValue())));
        }


    }
}
