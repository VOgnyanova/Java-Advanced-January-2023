public class Main {
    public static void main(String[] args) {

        String[] strings = ArrayCreator.create(10, "none");
        for (String element: strings){
            System.out.print(element+ " ");
        }
        System.out.println();
        Integer[] integers = ArrayCreator.create(Integer.class,10,0);
        for (Integer integer: integers){
            System.out.print(integer + " ");
        }
    }
}
