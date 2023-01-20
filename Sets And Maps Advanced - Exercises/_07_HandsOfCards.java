package _03_02_SetsAndMapsAdvancedExercises;

import java.util.*;

public class _07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, Set<String>> playersMap = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String[] cardArr = cards.split(", ");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardArr));

            if (!playersMap.containsKey(playerName)) {
                playersMap.put(playerName, cardsSet);
            } else {
                Set<String> currentCards = playersMap.get(playerName);

                currentCards.addAll(cardsSet);
                playersMap.put(playerName, currentCards);
            }


            input = scanner.nextLine();
        }
        playersMap.entrySet().forEach(e -> {
            String name = e.getKey();
            Set<String> cards = e.getValue();
            int point = getCardsPoints(cards);
            System.out.printf("%s: %d%n", name, point);
        });
    }

    private static int getCardsPoints(Set<String> cards) {
        Map<Character, Integer> symbolsMap = getSymbolsValue();
        int sumPoints = 0;
        for (String card : cards) {

            int point = 0;
            if (card.startsWith("10")) {
                char type = card.charAt(2);
                point = 10 * symbolsMap.get(type);

            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                point = symbolsMap.get(power) * symbolsMap.get(type);


            }

            sumPoints += point;
        }

        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValue() {

        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);

        return characterValues;
    }
}
