package _03_01_SetsAndMapsAdvanced_Lab;


import java.util.*;

public class _08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> gradesPerStudent = new TreeMap<>();

        for (int i = 0; i < countOfStudents; i++) {
            String nameStudent = scanner.nextLine();

            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();
            gradesPerStudent.putIfAbsent(nameStudent, new ArrayList<>());

            for (double grade : grades) {
                gradesPerStudent.get(nameStudent).add(grade);
            }

        }
        gradesPerStudent.forEach((name, grades) -> {
            double sumOfGrades = 0;
            for (Double grade : grades) {
                sumOfGrades += grade;
            }

            System.out.printf("%s is graduated with %s%n", name, sumOfGrades / grades.size());
        });
    }
}