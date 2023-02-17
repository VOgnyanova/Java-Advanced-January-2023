package _09_BasicAlgorithmsLab;

import java.util.*;
import java.util.stream.Collectors;

public class _03_SumOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements =scanner.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(scanner.nextLine().substring(5));


        try {
            Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);
            int coinCount = usedCoins.values().stream().mapToInt(a -> a).sum();

            System.out.println("Number of coins to take: " + coinCount);
            List<Map.Entry<Integer, Integer>> sortedCoinUsage = usedCoins
                    .entrySet()
                    .stream()
                    .sorted((l, r) -> r.getKey() - l.getKey())
                    .collect(Collectors.toList());

            for (Map.Entry<Integer, Integer> usedCoin : sortedCoinUsage) {
                System.out.printf("%d coin(s) with value %d\n",
                        usedCoin.getValue(), usedCoin.getKey());
            }
        } catch (RuntimeException e) {
            System.out.println("Error");
        }

    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        // Coin value -> Number of coins used
        Map<Integer, Integer> result = new HashMap<>();

        int[] sortedCoins = Arrays.stream(coins)
                .boxed()
                .sorted((l, r) -> r - l)
                .mapToInt(a -> a)
                .toArray();

        while (targetSum > 0) {
            int largestCoin = 0;

            // find largest coin
            for (int coin : sortedCoins) {
                if (coin <= targetSum) {
                    largestCoin = coin;
                    break;
                }
            }

            // if no coin is available
            if (largestCoin == 0) {
                throw new RuntimeException("Not possible");
            }

            // add to usage map
            Integer currentUsage = result.get(largestCoin);
            if (currentUsage == null) {
                currentUsage = 0;
            }

            result.put(largestCoin, currentUsage + 1);

            targetSum -= largestCoin;
        }

        return result;

    }
}