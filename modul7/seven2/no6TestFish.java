package modul7.seven2;

public class no6TestFish {
    public static void main(String[] args) {
        // a. Menginisialisasi Ikan 1 (Amber)
        no5Fish amber = new no5Fish("AngelFish", 5);

        // b. Menginisialisasi Ikan 2 (James)
        no5Fish james = new no5Fish("Guppy", 3);

        // Menampilkan data kedua ikan menggunakan atribut dan method getFriendliness()
        System.out.println("Ikan 1 (Amber) -> Jenis: " + amber.typeOfFish +
                           ", Tingkat Keramahan: " + amber.getFriendliness());
        System.out.println("Ikan 2 (James) -> Jenis: " + james.typeOfFish +
                           ", Tingkat Keramahan: " + james.getFriendliness());
    }
}