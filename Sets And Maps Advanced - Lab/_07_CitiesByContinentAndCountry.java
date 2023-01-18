package _03_01_SetsAndMapsAdvanced_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedHashMap<String, ArrayList<String>>> citiesMap = new LinkedHashMap<>();

        while (count-- > 0) {
            String[] dataCountries = scanner.nextLine().split("\\s+");
            String continent = dataCountries[0];
            String country = dataCountries[1];
            String city = dataCountries[2];
            citiesMap.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, ArrayList<String>> cities = citiesMap.get(continent);
            cities.putIfAbsent(country, new ArrayList<>());
            cities.get(country).add(city);


        }
        citiesMap.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet().stream()
                            .forEach(country -> {
                                String print = String.join(", ", country.getValue());
                                System.out.println(" " + country.getKey() + " -> " + print);
                            });
                });
    }
}