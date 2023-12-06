import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingAlgorithm {

    // Method to sort students based on marks
    public static void sortByMarks(List<Student> studentList) {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getMarks));
    }

    // Method to sort students based on student ID
    public static void sortByStudentId(List<Student> studentList) {
        Collections.sort(studentList, Comparator.comparingInt(Student::getStudentId));
    }

    // Method to sort students based on full name
    public static void sortByFullName(List<Student> studentList) {
        Collections.sort(studentList, Comparator.comparing(Student::getFullName));
    }

    // Generic merge sort method
    private static <T> void mergeSort(List<T> list, Comparator<T> comparator) {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            List<T> leftHalf = list.subList(0, mid);
            List<T> rightHalf = list.subList(mid, list.size());

            mergeSort(leftHalf, comparator);
            mergeSort(rightHalf, comparator);

            merge(list, leftHalf, rightHalf, comparator);
        }
    }

    // Generic merge method
    private static <T> void merge(List<T> list, List<T> left, List<T> right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) < 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
