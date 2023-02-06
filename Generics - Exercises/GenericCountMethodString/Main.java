package GenericCountMethodString;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            box.add(element);
        }
        String elementForCompare = scanner.nextLine();
        int countGreater = box.countGreaterThan(elementForCompare);
        System.out.println(countGreater);
    }
}
