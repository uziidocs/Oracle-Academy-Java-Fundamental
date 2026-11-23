package modul7.seven2;

public class no8TestFish {
    public static void main(String[] args) {
        // Membuat beberapa objek Fish dengan tingkat keramahan berbeda
        no5Fish amber = new no5Fish("AngelFish", 5);   // sangat ramah
        no5Fish james = new no5Fish("Guppy", 3);       // netral
        no5Fish bruce = new no5Fish("Shark", 1);       // galak
        no5Fish nemo  = new no5Fish("Clownfish", 4);   // ramah

        // Pengujian 1: Memanggil nicestFish() dengan 2 ikan
        no5Fish hasil1 = nicestFish(james, bruce);
        System.out.println("Perbandingan 2 ikan (James vs Bruce):");
        System.out.println("Ikan paling ramah -> " + hasil1.typeOfFish +
                           " (Keramahan: " + hasil1.getFriendliness() + ")");

        // Pengujian 2: Memanggil nicestFish() dengan 4 ikan sekaligus
        no5Fish hasil2 = nicestFish(bruce, james, amber, nemo);
        System.out.println("\nPerbandingan 4 ikan (Bruce, James, Amber, Nemo):");
        System.out.println("Ikan paling ramah -> " + hasil2.typeOfFish +
                           " (Keramahan: " + hasil2.getFriendliness() + ")");
    }

    // Variable argument method (varargs) untuk mencari ikan paling ramah
    public static no5Fish nicestFish(no5Fish... fishes) {
        if (fishes.length == 0) {
            return null;
        }

        // Atur temp sama dengan ikan pertama yang diteruskan ke method
        no5Fish temp = fishes[0];

        // Menelusuri semua ikan menggunakan for loop
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }

        // Mengembalikan ikan dengan tingkat keramahan tertinggi
        return temp;
    }
}