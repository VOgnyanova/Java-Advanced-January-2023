package _05_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Engine engine;
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);

            if (input.length == 2) {
                engine = new Engine(model, power);
            }

            else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            }

            else {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }

            engines.add(engine);
        }


        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car;
            String model = input[0];
            String engineModel = input[1];

            if (input.length == 2) {
                car = new Car(model, engineModel);
            } else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(model, engineModel, weight, color);
            } else {
                try {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, engineModel, weight);
                } catch (NumberFormatException e) {
                    String color = input[2];
                    car = new Car(model, engineModel, color);
                }
            }

            cars.add(car);
        }


        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngineModel() + ":");
            engines.forEach(engine -> {
                        if (engine.getModel().equals(car.getEngineModel())) {
                            System.out.println(engine.toString());
                        }
                    }
            );
            if(car.getWeight() == 0) {
                System.out.println("Weight: n/a");
            } else {
                System.out.println("Weight: " + car.getWeight());
            }
            System.out.println("Color: " + car.getColor());
        }


    }
}
