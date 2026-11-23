package modul4.for3;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int KAPASITAS_BUS = 45;

        // Menerima input total pendaftar
        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int jumlahOrang = input.nextInt();

        // Menghitung jumlah bus penuh dan sisa orang yang naik van
        int jumlahBus = jumlahOrang / KAPASITAS_BUS;
        int orangNaikVan = jumlahOrang % KAPASITAS_BUS;

        // Menampilkan hasil ke layar
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + orangNaikVan);

        input.close();
    }
}