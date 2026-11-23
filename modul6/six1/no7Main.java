package modul6.six1;
import java.util.Scanner;
public class no7Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fitur a: Membuat deck, mengacaknya, dan memverifikasi hasil acakan
        no7Deck d = new no7Deck();
        d.shuffle();
        System.out.println("=== ISI DECK SETELAH DIACAK ===");
        d.print();

        // Fitur b & d: Menyiapkan Hand untuk Pemain dan Dealer
        no7Hand playerHand = new no7Hand();
        no7Hand dealerHand = new no7Hand();

        // Membagikan 2 kartu awal masing-masing ke Pemain dan Dealer
        playerHand.addCard(d.dealCard());
        playerHand.addCard(d.dealCard());
        dealerHand.addCard(d.dealCard());
        dealerHand.addCard(d.dealCard());

        System.out.println("\n===============================");
        System.out.println("   PERMAINAN KARTU (21)");
        System.out.println("===============================");

        // Giliran Pemain
        while (playerHand.getPoints() <= 21 && !playerHand.isFull()) {
            System.out.println("\nKartu Anda saat ini:");
            playerHand.printHand();
            System.out.println("Total poin Anda: " + playerHand.getPoints());

            if (playerHand.getPoints() == 21) {
                System.out.println("Anda mencapai 21 poin!");
                break;
            }

            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            char pilihan = Character.toLowerCase(input.next().charAt(0));

            if (pilihan == 'y') {
                no7Card kartuBaru = d.dealCard();
                System.out.println("Anda mendapatkan: " + kartuBaru);
                playerHand.addCard(kartuBaru);
            } else {
                break;
            }
        }

        // Menampilkan kondisi akhir tangan Pemain
        System.out.println("\n--- Hasil Akhir Pemain ---");
        playerHand.printHand();
        int playerPoints = playerHand.getPoints();
        System.out.println("Total Poin Pemain: " + playerPoints);

        // Cek apakah pemain melebihi 21 (Bust)
        if (playerPoints > 21) {
            System.out.println("\nPoin Anda melebihi 21! Dealer menang.");
        } else {
            // Fitur d: Giliran Dealer (berhenti jika poin 16 atau lebih, atau kartu penuh 5)
            System.out.println("\n--- Giliran Dealer ---");
            while (dealerHand.getPoints() < 16 && !dealerHand.isFull()) {
                no7Card kartuDealer = d.dealCard();
                System.out.println("Dealer mengambil: " + kartuDealer);
                dealerHand.addCard(kartuDealer);
            }

            System.out.println("\nKartu Akhir Dealer:");
            dealerHand.printHand();
            int dealerPoints = dealerHand.getPoints();
            System.out.println("Total Poin Dealer: " + dealerPoints);

            // Menentukan Pemenang
            System.out.println("\n=== HASIL PERTANDINGAN ===");
            if (dealerPoints > 21) {
                System.out.println("Dealer melebihi 21! Selamat, Anda MENANG!");
            } else if (playerPoints > dealerPoints) {
                System.out.println("Selamat, Anda MENANG dengan " + playerPoints + " poin melawan " + dealerPoints + " poin!");
            } else if (dealerPoints > playerPoints) {
                System.out.println("Dealer MENANG dengan " + dealerPoints + " poin melawan " + playerPoints + " poin.");
            } else {
                System.out.println("Permainan SERI (Tie) pada " + playerPoints + " poin!");
            }
        }

        input.close();
    }
}