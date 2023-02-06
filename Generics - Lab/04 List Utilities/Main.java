import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listsIntegers = new ArrayList<>();
        Collections.addAll(listsIntegers, 1, 2, 18, 2, -1);

        Integer maxInteger = ListUtils.getMax(listsIntegers);
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings,"a","b","c");
        String minString = ListUtils.getMin(strings);



        System.out.println(ListUtils.getMin(strings));
        System.out.println(ListUtils.getMax(listsIntegers));

    }
}
