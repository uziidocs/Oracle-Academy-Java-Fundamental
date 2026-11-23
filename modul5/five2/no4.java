package modul5.five2;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dua teks/frasa dari pengguna
        System.out.print("Masukkan kata atau frasa pertama: ");
        String teks1 = input.nextLine();

        System.out.print("Masukkan kata atau frasa kedua  : ");
        String teks2 = input.nextLine();

        // Membersihkan spasi, tanda baca, dan mengubah semua huruf menjadi huruf kecil
        String bersih1 = "";
        for (int i = 0; i < teks1.length(); i++) {
            char c = teks1.charAt(i);
            if (Character.isLetter(c)) {
                bersih1 += Character.toLowerCase(c);
            }
        }

        String bersih2 = "";
        for (int i = 0; i < teks2.length(); i++) {
            char c = teks2.charAt(i);
            if (Character.isLetter(c)) {
                bersih2 += Character.toLowerCase(c);
            }
        }

        boolean adalahAnagram = true;

        // Langkah 1: Pastikan panjang huruf kedua teks yang sudah dibersihkan sama
        if (bersih1.length() != bersih2.length()) {
            adalahAnagram = false;
        } else {
            // Langkah 2: Cocokkan setiap huruf di bersih1 dengan huruf di bersih2
            for (int i = 0; i < bersih1.length(); i++) {
                char huruf = bersih1.charAt(i);
                int indeksDitemukan = bersih2.indexOf(huruf);

                if (indeksDitemukan == -1) {
                    adalahAnagram = false;
                    break; // Langsung hentikan loop jika ada satu huruf yang tidak cocok
                } else {
                    // Hapus huruf yang sudah cocok agar tidak terhitung dua kali
                    bersih2 = bersih2.substring(0, indeksDitemukan) + bersih2.substring(indeksDitemukan + 1);
                }
            }
        }

        // Menampilkan hasil pemeriksaan
        if (adalahAnagram) {
            System.out.println("\nHasil: \"" + teks1 + "\" ADALAH anagram dari \"" + teks2 + "\".");
        } else {
            System.out.println("\nHasil: \"" + teks1 + "\" BUKAN anagram dari \"" + teks2 + "\".");
        }

        input.close();
    }
}