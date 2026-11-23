package modul7.seven1;

public class no6UpdateAriSalama {
    public static void main(String[] args) {
        // Tiga instance dari class Student sesuai data pada nomor 5
        no4Student student1 = new no4Student("Mary Jones", 14, 46);
        no4Student student2 = new no4Student("John Stiner", 60, 173);
        no4Student student3 = new no4Student("Ari Samala", 31, 69);

        // Menampilkan semua data awal (sekaligus menghilangkan warning unused variable)
        System.out.println("=== DATA AWAL MAHASISWA ===");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        // Menambahkan 13 kredit dan 52 poin mutu ke Ari Samala (student3)
        student3.updateGrades(13, 52);

        System.out.println("\n=== DATA ARI SAMALA SETELAH PEMBARUAN ===");
        student3.printStudentInfo();
    }
}