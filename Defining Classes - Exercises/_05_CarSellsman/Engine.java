package _06_02_DefiningClassesExercise._05_CarSellsman;

public class Engine {
    private String model;
    private int power;
    private  int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;

    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;

    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
