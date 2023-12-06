import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> studentList;

    // Constructor
    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }

    // Add a student to the system
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Display information for all students
    public void displayStudents() {
        for (Student student : studentList) {
            System.out.println(student);
            System.out.println("-------------");
        }
    }

    // Sorting students based on specified criteria
    public void sortStudents(String sortBy) {
        switch (sortBy) {
            case "studentId":
                SortingAlgorithm.sortByStudentId(studentList);
                break;

            case "fullName":
                SortingAlgorithm.sortByFullName(studentList);
                break;

            default:
                SortingAlgorithm.sortByMarks(studentList); // Default: sort by marks
                break;
        }
    }

    // Other methods for editing, deleting, searching, etc.
}
