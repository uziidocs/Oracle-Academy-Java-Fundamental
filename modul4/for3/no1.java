package modul4.for3;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input alas (b) dan tinggi (h)
        System.out.print("Masukkan alas segitiga (b): ");
        double b = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = input.nextDouble();

        // Menghitung luas segitiga menggunakan rumus A = (1/2) * b * h
        double A = (1.0 / 2) * b * h;

        // Menampilkan hasil perhitungan
        System.out.println("Luas segitiga (A) adalah: " + A);

        input.close();
    }
}