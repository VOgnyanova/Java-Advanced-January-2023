package _06_02_DefiningClassesExercise._07_Google;

public class Car {

    private String carModel;
    private int carSpeed;


    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return carModel + " " + carSpeed;
    }
}

