package modul7.seven1;

public class no5TestThreeStudent {
    public static void main(String[] args) {
        // Membuat tiga instance dari class Student sesuai data tabel
        no4Student student1 = new no4Student("Mary Jones", 14, 46);
        no4Student student2 = new no4Student("John Stiner", 60, 173);
        no4Student student3 = new no4Student("Ari Samala", 31, 69);

        // Menampilkan informasi dan hasil perhitungan IP (GPA) masing-masing mahasiswa
        System.out.println("=== DATA INDEKS PRESTASI MAHASISWA ===");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}   