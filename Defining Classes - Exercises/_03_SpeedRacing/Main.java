package _06_02_DefiningClassesExercise._03_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        LinkedHashMap<String,Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            int fuel = Integer.parseInt(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);


            Car car = new Car(model,fuel,consumption);
            cars.put(model,car);



        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String model = command.split("\\s+")[1];
            int distanceToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car carToDrive = cars.get(model);

            if (!carToDrive.drive(distanceToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }


            command = scanner.nextLine();
        }
        for (Car car : cars.values()){
            System.out.println(car.toString());
        }

    }
}
