package modul7.seven2;

public class no9TestNicestFish {
    public static void main(String[] args) {
        // Menginisialisasi dua ikan sesuai deskripsi soal nomor 6
        no5Fish amber = new no5Fish("AngelFish", 5); // sangat ramah
        no5Fish james = new no5Fish("Guppy", 3);     // netral

        // Menguji variable argument method nicestFish() dari soal nomor 8
        no5Fish ikanTeramah = nicestFish(amber, james);

        // Menampilkan ikan yang dikembalikan
        System.out.println("Ikan yang dikembalikan oleh nicestFish(amber, james):");
        System.out.println("Nama Variabel     : Amber");
        System.out.println("Jenis Ikan        : " + ikanTeramah.typeOfFish);
        System.out.println("Tingkat Keramahan : " + ikanTeramah.getFriendliness() + " (sangat ramah)");
    }

    // Variable argument method nicestFish()
    public static no5Fish nicestFish(no5Fish... fishes) {
        if (fishes.length == 0) {
            return null;
        }

        no5Fish temp = fishes[0];

        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }

        return temp;
    }
}