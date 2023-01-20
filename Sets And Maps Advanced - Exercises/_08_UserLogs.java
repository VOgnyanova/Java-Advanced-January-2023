package _03_02_SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _08_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String ip = input.split("\\s+")[0].split("=")[1];
            String username = input.split("\\s+")[2].split("=")[1];

            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>());

            }
            Map<String, Integer> currentIP = data.get(username);
            if (!currentIP.containsKey(ip)) {
                currentIP.put(ip, 1);
            } else {
                currentIP.put(ip, currentIP.get(ip) + 1);
            }

            input = scanner.nextLine();
        }
        for (String username : data.keySet()) {
            System.out.println(username + ": ");
            Map<String, Integer> currentIps = data.get(username);
            int countIp = currentIps.size();

            for (String ip : currentIps.keySet()) {
                if (countIp == 1) {
                    System.out.println(ip + " => " + currentIps.get(ip) + ".");
                } else {
                    System.out.print(ip + " => " + currentIps.get(ip) + ", ");

                }
                countIp--;

            }
        }


    }
}
