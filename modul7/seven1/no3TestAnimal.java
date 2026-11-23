package modul7.seven1;

public class no3TestAnimal {
    public static void main(String[] args) {
        // Instance 1: Menggunakan default constructor Animal() (speed bawaan = 2.0)
        no3Animal animal1 = new no3Animal();

        // Instance 2: Menggunakan parameterized constructor Animal(w, h, s)
        no3Animal animal2 = new no3Animal(120, 6, 15);

        // Mencetak kecepatan menggunakan method getSpeed()
        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}