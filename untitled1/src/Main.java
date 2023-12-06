import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize your list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", 8.5));
        students.add(new Student(2, "Jane Smith", 7.2));
        students.add(new Student(3, "Alice Johnson", 9.8));

        // Display unsorted students
        System.out.println("Unsorted Students:");
        displayStudents(students);

        // Sorting by marks
        SortingAlgorithm.sortByMarks(students);
        System.out.println("\nStudents Sorted by Marks:");
        displayStudents(students);

        // Sorting by full name
        SortingAlgorithm.sortByFullName(students);
        System.out.println("\nStudents Sorted by Full Name:");
        displayStudents(students);

        // Sorting by student ID
        SortingAlgorithm.sortByStudentId(students);
        System.out.println("\nStudents Sorted by Student ID:");
        displayStudents(students);
    }

    private static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
            System.out.println("-------------");
        }
    }
}
