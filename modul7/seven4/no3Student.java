package modul7.seven4;
import java.util.Date;

public class no3Student extends no3Person {
    // Data pribadi mahasiswa (private untuk enkapsulasi)
    private String studentId;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    // Constructor memanggil constructor superclass Person dan menginisialisasi data Student
    public no3Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String studentId, String major, String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    // Method getter untuk mengakses atribut private
    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    // Method bagi administrator untuk mengubah jurusan mahasiswa
    public void setMajor(String major) {
        this.major = major;
    }

    // Method untuk menghitung IP (GPA) dari array nilai huruf
    public double calculateGPA(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return this.gpa;
        }

        double totalPoints = 0.0;

        for (String grade : grades) {
            switch (grade.trim().toUpperCase()) {
                case "A":
                    totalPoints += 4.0;
                    break;
                case "A-":
                    totalPoints += 3.67;
                    break;
                case "B+":
                    totalPoints += 3.33;
                    break;
                case "B":
                    totalPoints += 3.0;
                    break;
                case "B-":
                    totalPoints += 2.67;
                    break;
                case "C+":
                    totalPoints += 2.33;
                    break;
                case "C":
                    totalPoints += 2.0;
                    break;
                case "D":
                    totalPoints += 1.0;
                    break;
                case "F":
                default:
                    totalPoints += 0.0;
                    break;
            }
        }

        this.gpa = totalPoints / grades.length;
        return this.gpa;
    }
}