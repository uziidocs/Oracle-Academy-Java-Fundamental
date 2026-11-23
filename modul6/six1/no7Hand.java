package modul6.six1;

public class no7Hand {
    no7Card[] cards = new no7Card[5];
    int cardCount = 0;

    // Menambahkan kartu ke tangan (maksimal 5 kartu)
    public void addCard(no7Card c) {
        if (cardCount < cards.length && c != null) {
            cards[cardCount] = c;
            cardCount++;
            adjustForAce();
        }
    }

    // Fitur c: Jika total poin > 21, cari Ace bernilai 11 dan ubah menjadi 1
    public void adjustForAce() {
        while (getPoints() > 21) {
            boolean aceAdjusted = false;
            for (int i = 0; i < cardCount; i++) {
                if (cards[i].name.equals("Ace") && cards[i].points == 11) {
                    cards[i].points = 1;
                    aceAdjusted = true;
                    break;
                }
            }
            // Hentikan loop jika sudah tidak ada lagi Ace bernilai 11
            if (!aceAdjusted) {
                break;
            }
        }
    }

    // Menghitung total poin seluruh kartu di tangan
    public int getPoints() {
        int total = 0;
        for (int i = 0; i < cardCount; i++) {
            total += cards[i].points;
        }
        return total;
    }

    public boolean isFull() {
        return cardCount >= cards.length;
    }

    public void printHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println("- " + cards[i] + " (" + cards[i].points + " poin)");
        }
    }
}