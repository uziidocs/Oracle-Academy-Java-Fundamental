package modul6.six1;
import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriksA = null;
        int[][] matriksB = null;
        char pilihan;

        do {
            System.out.println("\n=== MENU OPERASI MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu (a-f): ");
            pilihan = Character.toLowerCase(input.next().charAt(0));

            switch (pilihan) {
                case 'a':
                    matriksA = masukkanMatriks(input, "A");
                    break;
                case 'b':
                    matriksB = masukkanMatriks(input, "B");
                    break;
                case 'c':
                    if (validasiMatriks(matriksA, matriksB)) {
                        System.out.println("\nHasil A + B:");
                        tampilkanMatriks(tambahMatriks(matriksA, matriksB));
                    }
                    break;
                case 'd':
                    if (validasiMatriks(matriksA, matriksB)) {
                        System.out.println("\nHasil A - B:");
                        tampilkanMatriks(kurangMatriks(matriksA, matriksB));
                    }
                    break;
                case 'e':
                    if (validasiMatriks(matriksA, matriksB)) {
                        System.out.println("\nHasil A * B:");
                        tampilkanMatriks(kaliMatriks(matriksA, matriksB));
                    }
                    break;
                case 'f':
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih huruf a sampai f.");
            }
        } while (pilihan != 'f');

        input.close();
    }

    // Method untuk membaca input elemen matriks (mendukung 2x2 atau 3x3)
    public static int[][] masukkanMatriks(Scanner input, String nama) {
        int ukuran;
        do {
            System.out.print("Masukkan ukuran matriks " + nama + " (2 untuk 2x2, 3 untuk 3x3): ");
            ukuran = input.nextInt();
            if (ukuran != 2 && ukuran != 3) {
                System.out.println("Ukuran tidak valid! Masukkan angka 2 atau 3.");
            }
        } while (ukuran != 2 && ukuran != 3);

        int[][] matriks = new int[ukuran][ukuran];
        System.out.println("Masukkan elemen Matriks " + nama + " (" + ukuran + "x" + ukuran + "):");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }
        return matriks;
    }

    // Method untuk memastikan kedua matriks sudah diisi dan berukuran sama
    public static boolean validasiMatriks(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Error: Masukkan Matriks A dan Matriks B terlebih dahulu!");
            return false;
        }
        if (a.length != b.length) {
            System.out.println("Error: Ukuran Matriks A (" + a.length + "x" + a.length +
                               ") dan Matriks B (" + b.length + "x" + b.length + ") harus sama!");
            return false;
        }
        return true;
    }

    // Method penjumlahan matriks (posisional)
    public static int[][] tambahMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    // Method pengurangan matriks (posisional)
    public static int[][] kurangMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    // Method perkalian matriks (baris matriks pertama dikali kolom matriks kedua)
    public static int[][] kaliMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return hasil;
    }

    // Method untuk mencetak isi matriks ke layar
    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.printf("%4d ", matriks[i][j]);
            }
            System.out.println("]");
        }
    }
}