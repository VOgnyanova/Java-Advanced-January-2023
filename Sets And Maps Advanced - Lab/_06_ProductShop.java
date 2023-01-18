package _03_01_SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Map<String, Double>> storeMap = new TreeMap<>();

        while (!command.equals("Revision")) {
            String[] dataShop = command.split(", ");
            String store = dataShop[0];
            String product = dataShop[1];
            double price = Double.parseDouble(dataShop[2]);

            if (!storeMap.containsKey(store)) {
                storeMap.put(store, new LinkedHashMap<>());
                storeMap.get(store).put(product, price);
            } else {
                storeMap.get(store).put(product, price);
            }
            command = scanner.nextLine();

        }
        for (Map.Entry<String, Map<String, Double>> entry : storeMap.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (Map.Entry<String, Double> entryMap : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entryMap.getKey(), entryMap.getValue());
            }

        }
    }
}