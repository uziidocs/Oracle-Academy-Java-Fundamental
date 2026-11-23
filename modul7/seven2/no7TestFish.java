package modul7.seven2;

public class no7TestFish {
    public static void main(String[] args) {
        // Dua objek ikan dari soal nomor 6
        no5Fish amber = new no5Fish("AngelFish", 5);
        no5Fish james = new no5Fish("Guppy", 3);

        // Menguji method nicestFish dengan mengirimkan objek amber dan james
        no5Fish ikanTeramah = nicestFish(amber, james);

        // Menampilkan hasil perbandingan
        System.out.println("Ikan 1 (Amber) -> Jenis: " + amber.typeOfFish +
                           ", Keramahan: " + amber.getFriendliness());
        System.out.println("Ikan 2 (James) -> Jenis: " + james.typeOfFish +
                           ", Keramahan: " + james.getFriendliness());
        System.out.println("\nIkan paling ramah adalah jenis " + ikanTeramah.typeOfFish +
                           " dengan tingkat keramahan " + ikanTeramah.getFriendliness() + " (sangat ramah).");
    }

    // Method untuk membandingkan dua objek Fish dan mengembalikan yang paling ramah
    public static no5Fish nicestFish(no5Fish f1, no5Fish f2) {
        if (f1.getFriendliness() > f2.getFriendliness()) {
            return f1;
        } else {
            return f2;
        }
    }
}