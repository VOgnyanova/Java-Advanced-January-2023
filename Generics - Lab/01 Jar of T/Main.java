public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();
        jar.add(150);

        System.out.println(jar.remove());
    }
}