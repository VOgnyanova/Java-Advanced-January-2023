package _03_01_SetsAndMapsAdvanced_Lab;

import java.util.*;

public class _05_AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsRecords = new TreeMap<>();

        for (int students = 0; students < countOfStudents; students++) {
            String[] studentsData = scanner.nextLine().split("\\s+");
            String studentName = studentsData[0];
            double grades = Double.parseDouble(studentsData[1]);


            studentsRecords.putIfAbsent(studentName, new ArrayList<>());

            studentsRecords.get(studentName).add(grades);


        }
        for (Map.Entry<String, List<Double>> entry : studentsRecords.entrySet()) {

            System.out.print(entry.getKey() + " -> ");
            double sumOfGrade = 0.0;
            for (Double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                sumOfGrade += grade;
            }
            System.out.printf("(avg: %.2f)%n", sumOfGrade / entry.getValue().size());

        }


    }

}
