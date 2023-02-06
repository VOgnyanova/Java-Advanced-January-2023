public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("a","c");
        System.out.println(scale.getHeavier());

        Scale<Integer> integerScale  = new Scale<>(1,2);
        System.out.println(integerScale.getHeavier());
    }
}
