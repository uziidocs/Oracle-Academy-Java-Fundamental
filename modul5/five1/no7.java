package modul5.five1;
import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dimensi ruangan (dalam satuan kaki)
        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        // Menghitung luas area yang dicat: 4 dinding + langit-langit (tanpa lantai)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        // Menghitung kebutuhan awal ember 5 liter (cakupan 1.500 kaki persegi)
        int ember5Liter = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;

        // Menghitung kebutuhan ember 1 liter (cakupan 300 kaki persegi), dibulatkan ke atas
        int ember1Liter = (int) Math.ceil(sisaLuas / 300.0);

        // Optimasi biaya: jika sisa luas membutuhkan 4 atau 5 ember 1 liter ($16 - $20),
        // jauh lebih hemat membeli 1 ember 5 liter tambahan ($15)
        if (ember1Liter >= 4) {
            ember5Liter++;
            ember1Liter = 0;
        }

        int totalBiaya = (ember5Liter * 15) + (ember1Liter * 4);

        // Menampilkan hasil perhitungan
        System.out.println("\nTotal luas permukaan yang dicat: " + totalLuas + " kaki persegi");
        System.out.println("Jumlah ember optimal yang harus dibeli:");
        System.out.println("- Ember 5 liter ($15): " + ember5Liter + " ember");
        System.out.println("- Ember 1 liter ($4) : " + ember1Liter + " ember");
        System.out.println("Total biaya cat      : $" + totalBiaya);

        input.close();
    }
}