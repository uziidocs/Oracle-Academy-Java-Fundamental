package modul5.five2;
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pesan = "";
        int jumlahValid = 0;

        System.out.println("Masukkan 10 angka kode rahasia (1-7) satu per satu:");

        // Perulangan berjalan hingga terkumpul tepat 10 angka yang valid
        while (jumlahValid < 10) {
            System.out.print("Angka ke-" + (jumlahValid + 1) + ": ");
            int kode = input.nextInt();

            switch (kode) {
                case 1:
                    pesan += "D";
                    jumlahValid++;
                    break;
                case 2:
                    pesan += "W";
                    jumlahValid++;
                    break;
                case 3:
                    pesan += "E";
                    jumlahValid++;
                    break;
                case 4:
                    pesan += "L";
                    jumlahValid++;
                    break;
                case 5:
                    pesan += "H";
                    jumlahValid++;
                    break;
                case 6:
                    pesan += "O";
                    jumlahValid++;
                    break;
                case 7:
                    pesan += "R";
                    jumlahValid++;
                    break;
                default:
                    System.out.println("Angka belum terpecahkan! Masukkan angka baru (1-7).");
                    break;
            }
        }

        System.out.println("\nPesan yang telah diuraikan: " + pesan);
        input.close();
    }
}