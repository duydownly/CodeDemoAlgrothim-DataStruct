public class Student {
    // Attributes
    private int studentId;
    private String fullName;
    private double marks;
    private String ranking;

    // Constructors
    public Student(int studentId, String fullName, double marks) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.marks = marks;
        this.ranking = calculateRanking();
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public double getMarks() {
        return marks;
    }

    public String getRanking() {
        return ranking;
    }

    // Method to calculate ranking based on marks
    private String calculateRanking() {
        if (marks < 5.0) {
            return "Fail";
        } else if (marks < 6.5) {
            return "Medium";
        } else if (marks < 7.5) {
            return "Good";
        } else if (marks < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }

    // Other methods (if needed) for additional functionalities

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nFull Name: " + fullName +
                "\nMarks: " + marks +
                "\nRanking: " + ranking;
    }
}
