package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> emailDataMap = new LinkedHashMap<>();

        while (!name.equals("stop")) {

            String email = scanner.nextLine();

            if (!email.endsWith(".uk") && !email.endsWith(".us") && !email.endsWith(".com")) {
                emailDataMap.put(name, email);
            }

            name = scanner.nextLine();
        }
        emailDataMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
