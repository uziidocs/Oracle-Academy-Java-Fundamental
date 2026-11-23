package modul7.seven1;

public class no1TestShape {
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor default
        no1Shape segitiga = new no1Shape();
        System.out.println("Bentuk 1 - Jumlah sisi: " + segitiga.getNumSides() +
                           ", Beraturan: " + segitiga.isRegular());

        // Mengubah nilai atribut menggunakan method setter
        segitiga.setRegular(true);
        System.out.println("Setelah diubah - Jumlah sisi: " + segitiga.getNumSides() +
                           ", Beraturan: " + segitiga.isRegular());

        // Membuat objek menggunakan constructor berparameter
        no1Shape persegi = new no1Shape(4, true);
        System.out.println("Bentuk 2 - Jumlah sisi: " + persegi.getNumSides() +
                           ", Beraturan: " + persegi.isRegular());
    }
}