package modul5.five1;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca data pendaftar
        System.out.print("Apakah Anda valedictorian atau salutatorian? (ya/tidak): ");
        String statusPeringkat = input.next();
        boolean isValOrSal = statusPeringkat.equalsIgnoreCase("ya");

        System.out.print("Masukkan jumlah siswa di sekolah Anda: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Masukkan nilai GPA Anda (contoh: 3.8): ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT Anda: ");
        int skorSAT = input.nextInt();

        // Mengevaluasi keempat kriteria penerimaan
        boolean kriteria1 = isValOrSal && (jumlahSiswa >= 1400);
        boolean kriteria2 = (gpa >= 4.0) && (skorSAT >= 1100);
        boolean kriteria3 = (gpa >= 3.5) && (skorSAT >= 1300);
        boolean kriteria4 = (gpa >= 3.0) && (skorSAT >= 1500);

        // Mahasiswa diterima jika memenuhi salah satu (OR) dari kriteria di atas
        if (kriteria1 || kriteria2 || kriteria3 || kriteria4) {
            System.out.println("\nSelamat! Anda DITERIMA di Mountville University.");
        } else {
            System.out.println("\nMaaf, Anda TIDAK DITERIMA di Mountville University.");
        }

        input.close();
    }
}