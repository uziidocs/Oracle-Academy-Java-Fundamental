package modul5.five1;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input berat pengguna di Bumi
        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double beratBumi = input.nextDouble();

        // Menampilkan menu pilihan planet
        System.out.println("\nPilih planet di tata surya:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Masukkan pilihan (1-7): ");
        int pilihan = input.nextInt();

        String namaPlanet = "";
        double faktorKonversi = 0;
        boolean pilihanValid = true;

        // Menentukan faktor konversi berdasarkan pilihan menu
        switch (pilihan) {
            case 1:
                namaPlanet = "Merkurius";
                faktorKonversi = 0.38;
                break;
            case 2:
                namaPlanet = "Venus";
                faktorKonversi = 0.91;
                break;
            case 3:
                namaPlanet = "Mars";
                faktorKonversi = 0.38;
                break;
            case 4:
                namaPlanet = "Jupiter";
                faktorKonversi = 2.36;
                break;
            case 5:
                namaPlanet = "Saturnus";
                faktorKonversi = 0.92;
                break;
            case 6:
                namaPlanet = "Uranus";
                faktorKonversi = 0.89;
                break;
            case 7:
                namaPlanet = "Neptunus";
                faktorKonversi = 1.13;
                break;
            default:
                System.out.println("Error: Pilihan menu tidak valid!");
                pilihanValid = false;
        }

        // Menghitung dan mencetak hasil sesuai format
        if (pilihanValid) {
            double beratPlanet = beratBumi * faktorKonversi;
            System.out.println("Your weight on " + namaPlanet + " is " + beratPlanet + " lbs.");
        }

        input.close();
    }
}