package GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    private List<T> values;


    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value));
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }

    public void swap(int firstIndex, int secondIndex) {
        T firstElement = this.values.get(firstIndex);
        T secondElement = this.values.get(secondIndex);

        this.values.add(firstIndex, secondElement);
        this.values.remove(firstIndex + 1);
        this.values.add(secondIndex, firstElement);
        this.values.remove(secondIndex + 1);


    }

    public int length() {
        return this.values.size();
    }
}