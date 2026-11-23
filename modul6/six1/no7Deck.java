package modul6.six1;

public class no7Deck {
    no7Card[] cardArray = new no7Card[52];
    int nextCardIndex = 0;

    public no7Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new no7Card(i, j);
                cardCount++;
            }
        }
    }

    // Fitur a: Mengacak posisi seluruh kartu di dalam deck
    public void shuffle() {
        for (int i = 0; i < cardArray.length; i++) {
            int randomIndex = (int) (Math.random() * cardArray.length);
            no7Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }
        nextCardIndex = 0;
    }

    // Membagikan satu kartu teratas dari deck
    public no7Card dealCard() {
        if (nextCardIndex < cardArray.length) {
            return cardArray[nextCardIndex++];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}