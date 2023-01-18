package _03_01_SetsAndMapsAdvanced_Lab;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Set<String> parkingLotSet = new LinkedHashSet<>();

        while (!input[0].equals("END")) {
            String command = input[0];
            String carNumber = input[1];

            if (command.equals("IN")) {
                parkingLotSet.add(carNumber);
            } else if (command.equals("OUT")) {
                parkingLotSet.remove(carNumber);
            }


            input = scanner.nextLine().split(", ");
        }

        if (parkingLotSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {

            for (String car : parkingLotSet) {

                System.out.println(car);
            }
        }
    }
}