package modul7.seven1;
import java.util.Scanner;

public class no8Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gunakan tipe data no7Card sesuai nama file kamu
        no7Card[] hand = new no7Card[5];
        int cardCount = 0;
        int totalPoints = 0;

        // Membagikan 2 kartu acak pertama ke dalam Hand
        for (int i = 0; i < 2; i++) {
            hand[cardCount] = buatKartuAcak();
            totalPoints += hand[cardCount].points;
            cardCount++;
        }

        // a. Menampilkan kedua kartu awal beserta total nilai poinnya
        System.out.println("=== KARTU AWAL DI HAND ===");
        tampilkanHand(hand, cardCount);
        System.out.println("Total nilai poin awal: " + totalPoints);

        // b & c. Loop untuk menambah kartu hingga poin > 21, pengguna berhenti, atau kartu mencapai 5
        while (totalPoints <= 21 && cardCount < 5) {
            System.out.print("\nApakah Anda ingin kartu lagi? (y/n): ");
            char pilihan = Character.toLowerCase(input.next().charAt(0));

            if (pilihan == 'y') {
                no7Card kartuBaru = buatKartuAcak();
                hand[cardCount] = kartuBaru;
                totalPoints += kartuBaru.points;
                cardCount++;

                System.out.println("\nKartu baru yang didapat: " + kartuBaru + " (" + kartuBaru.points + " poin)");
                System.out.println("=== SEMUA KARTU DI HAND (" + cardCount + " KARTU) ===");
                tampilkanHand(hand, cardCount);
                System.out.println("Total poin saat ini: " + totalPoints);
            } else {
                break;
            }
        }

        // Menampilkan status akhir permainan
        System.out.println("\n=== HASIL AKHIR HAND ===");
        tampilkanHand(hand, cardCount);
        System.out.println("Total poin akhir : " + totalPoints);

        if (totalPoints > 21) {
            System.out.println("Status           : Total poin melebihi 21 (Bust)!");
        } else if (cardCount == 5) {
            System.out.println("Status           : Batas maksimal 5 kartu tercapai.");
        } else {
            System.out.println("Status           : Anda berhenti mengambil kartu.");
        }

        input.close();
    }

    // Method bantu mengembalikan tipe no7Card
    public static no7Card buatKartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new no7Card(suitNumber, faceNumber);
    }

    // Parameter array juga menggunakan tipe no7Card[]
    public static void tampilkanHand(no7Card[] hand, int cardCount) {
        for (int i = 0; i < cardCount; i++) {
            System.out.println((i + 1) + ". " + hand[i] + " (" + hand[i].points + " poin)");
        }
    }
}