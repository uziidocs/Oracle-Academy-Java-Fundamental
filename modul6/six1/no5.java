package modul6.six1;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array untuk menyimpan 5 nilai tes
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan 5 nilai tes (skala 0 - 100):");

        // Membaca input pengguna dan menyimpannya ke dalam array
        for (int i = 0; i < nilaiTes.length; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = input.nextDouble();
            total += nilaiTes[i];
        }

        // Menghitung rata-rata dari seluruh nilai di dalam array
        double rataRata = total / nilaiTes.length;

        // Menampilkan kembali nilai yang tersimpan beserta rata-ratanya
        System.out.print("\nNilai yang tersimpan di array: ");
        for (int i = 0; i < nilaiTes.length; i++) {
            System.out.print(nilaiTes[i]);
            if (i < nilaiTes.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nRata-rata nilai mahasiswa    : " + rataRata);

        input.close();
    }
}