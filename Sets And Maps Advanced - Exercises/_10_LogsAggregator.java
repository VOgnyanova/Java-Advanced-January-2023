package _03_02_SetsAndMapsAdvancedExercises;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _10_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int logLines = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Integer> usersWithTime = new TreeMap<>();
        TreeMap<String, TreeSet<String>> addresses = new TreeMap<>();


        while (logLines-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String ip = inputData[0];
            String name = inputData[1];
            int duration = Integer.parseInt(inputData[2]);

            if (!usersWithTime.containsKey(name)) {
                usersWithTime.put(name, duration);
                addresses.put(name, new TreeSet<>() {{
                    add(ip);
                }});
            } else {
                usersWithTime.put(name, usersWithTime.get(name) + duration);
                addresses.get(name).add(ip);
            }

        }
        usersWithTime.forEach((key, value) -> {
            System.out.println(String.format("%s: %d %s", key, value, addresses.get(key).toString()));

        });


    }
}
