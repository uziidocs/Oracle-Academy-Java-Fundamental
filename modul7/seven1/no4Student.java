package modul7.seven1;

public class no4Student {
    // Instance variables
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    // Constructor method
    public no4Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = getGPA();
    }

    // Method a: Mengembalikan nilai rata-rata indeks prestasi (GPA/IP) saat ini
    public double getGPA() {
        if (credits == 0) {
            gpa = 0.0;
        } else {
            gpa = qualityPoints / credits;
        }
        return gpa;
    }

    // Method b: Menerima input kredit & poin mutu baru, lalu memperbarui kredit, poin mutu, dan IP
    public void updateGrades(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gpa = getGPA();
    }

    // Method pendukung untuk menampilkan informasi mahasiswa
    public void printStudentInfo() {
        System.out.printf("Nama: %s | Total Kredit: %d | Poin Mutu: %.1f | IP (GPA): %.2f%n",
                          name, credits, qualityPoints, gpa);
    }
}