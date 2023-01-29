package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class _09_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Long>> populationByCountries = new LinkedHashMap<>();


        while (!command.equals("report")) {
            String[] inputData = command.split("\\|");
            String city = inputData[0];
            String country = inputData[1];
            long population = Long.parseLong(inputData[2]);

            if (!populationByCountries.containsKey(country)) {
                populationByCountries.put(country, new LinkedHashMap<>() {{
                    put(city, population);
                }});
            } else {
                populationByCountries.get(country).put(city, population);
            }

            command = scanner.nextLine();
        }
        populationByCountries.entrySet().stream().sorted((e1, e2) -> {
            Long totalPopulationFirst = populationByCountries.get(e1.getKey()).entrySet().stream().mapToLong(Map.Entry::getValue).sum();
            Long totalPopulationSecond = populationByCountries.get(e2.getKey()).entrySet().stream().mapToLong(Map.Entry::getValue).sum();
            return Long.compare(totalPopulationSecond, totalPopulationFirst);
        }).forEach(entry -> {
            System.out.print(entry.getKey() + " ");

            StringBuilder builder = new StringBuilder();
            AtomicReference<Long> totalPopulation = new AtomicReference<>((long) 0);

            populationByCountries.get(entry.getKey()).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(e -> {
                        builder.append(String.format("=>%s: %d%n", e.getKey(), e.getValue()));
                        totalPopulation.updateAndGet(v -> v + e.getValue());
                    });

            System.out.println(String.format("(total population: %s)", totalPopulation.toString()));
            System.out.print(builder.toString());
        });
    }
}
