package modul7.seven1;

public class no7Main {
    public static void main(String args[]) {
        // Kartu acak pertama
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        no7Card newCard = new no7Card(suitNumber, faceNumber);

        // Kartu acak kedua
        int suitNumber2 = (int) (Math.random() * 4.0 + 1);
        int faceNumber2 = (int) (Math.random() * 13.0 + 1);
        no7Card newCard2 = new no7Card(suitNumber2, faceNumber2);

        // Mencetak kedua kartu ke layar
        System.out.println("Kartu 1: " + newCard + " (" + newCard.points + " poin)");
        System.out.println("Kartu 2: " + newCard2 + " (" + newCard2.points + " poin)");
        System.out.println("Total poin kedua kartu: " + (newCard.points + newCard2.points));
    }
}