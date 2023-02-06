package _06_02_DefiningClassesExercise._05_CarSellsman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.model).append(":").append(System.lineSeparator());
        sb.append(this.getEngine().getModel()).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(this.engine.getPower()).append(System.lineSeparator());
        sb.append("Displacement: ");
        if (this.engine.getDisplacement() == 0) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.engine.getDisplacement()).append(System.lineSeparator());

        }
        sb.append("Efficiency: ");
        if (this.engine.getEfficiency() == null) {
            sb.append("n/a").append(System.lineSeparator());

        } else {
            sb.append(this.engine.getEfficiency()).append(System.lineSeparator());

        }
        sb.append("Weight: ");
        if (this.weight == 0) {
            sb.append("n/a").append(System.lineSeparator());

        } else {
            sb.append(this.weight).append(System.lineSeparator());

        }
        sb.append("Color: ");
        if (this.color == null) {
            sb.append("n/a").append(System.lineSeparator());

        } else {
            sb.append(this.color).append(System.lineSeparator());

        }
        return sb.toString();
    }
}
