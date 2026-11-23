package modul7.seven4;
import java.util.Calendar;
import java.util.Date;

public class no3TestStudent {
    public static void main(String[] args) {
        // Membuat objek Date tanpa warning deprecated menggunakan Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.AUGUST, 17);
        Date dob = cal.getTime();

        // Membuat objek Student
        no3Student mhs = new no3Student(
            "Andi", "Pratama", "Wijaya", dob,
            "2024101045", "Ilmu Komputer", "Sarjana", 2028
        );

        // Menghitung IP berdasarkan array nilai huruf
        String[] daftarNilai = {"A", "A-", "B+", "B"};
        mhs.calculateGPA(daftarNilai);

        // Menampilkan profil awal mahasiswa
        System.out.println("Nama Mahasiswa  : " + mhs.getName());
        System.out.println("NIM             : " + mhs.getStudentId());
        System.out.println("Gelar           : " + mhs.getDegree());
        System.out.println("Jurusan Awal    : " + mhs.getMajor());
        System.out.println("Tahun Lulus     : " + mhs.getExpectedGraduationYear());
        System.out.printf("IP (GPA)        : %.2f%n", mhs.getGpa());

        // Administrator mengubah jurusan mahasiswa
        mhs.setMajor("Matematika");
        System.out.println("Jurusan Baru    : " + mhs.getMajor());
    }
}