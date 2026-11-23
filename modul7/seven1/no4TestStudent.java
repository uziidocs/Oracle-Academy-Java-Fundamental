package modul7.seven1;

public class no4TestStudent {
    public static void main(String[] args) {
        // Membuat objek Student dengan data awal semester 1 (15 kredit, 54 poin mutu -> IP 3.60)
        no4Student mhs1 = new no4Student("Budi Santoso", 15, 54.0);
        System.out.println("=== Data Awal Semester 1 ===");
        mhs1.printStudentInfo();
        System.out.println("IP saat ini (via getGPA): " + mhs1.getGPA());

        // Memperbarui data setelah menyelesaikan semester 2 (+18 kredit, +68.4 poin mutu)
        mhs1.updateGrades(18, 68.4);
        System.out.println("\n=== Data Setelah Pembaruan Semester 2 ===");
        mhs1.printStudentInfo();
        System.out.printf("IP terbaru (via getGPA) : %.2f%n", mhs1.getGPA());
    }
}