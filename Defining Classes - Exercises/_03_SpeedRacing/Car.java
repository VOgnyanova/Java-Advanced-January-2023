package _06_02_DefiningClassesExercise._03_SpeedRacing;

public class Car {

    private String model;
    private double fuel;
    private double consumption;
    private int distance;

    public Car(String model, int fuel, double consumption) {
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        this.distance = distance;
    }

    public boolean drive(int distanceToDrive) {
        double needFuel = distanceToDrive * this.consumption;
        if (needFuel <= this.fuel) {
            this.distance += distanceToDrive;
            this.fuel -= needFuel;
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuel,this.distance);
    }
}
