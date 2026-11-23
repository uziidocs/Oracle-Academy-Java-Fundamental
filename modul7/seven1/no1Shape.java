package modul7.seven1;

public class no1Shape {
    // Instance variables (dienkapsulasi menggunakan modifier private)
    private int numSides;
    private boolean regular;

    // Constructor 1: Default constructor (tanpa parameter)
    public no1Shape() {
        this.numSides = 3;      // Nilai awal minimal sisi bangun datar (segitiga)
        this.regular = false;
    }

    // Constructor 2: Overloaded constructor dengan dua parameter
    public no1Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter untuk numSides
    public int getNumSides() {
        return numSides;
    }

    // Setter untuk numSides
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter untuk regular
    public boolean isRegular() {
        return regular;
    }

    // Setter untuk regular
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}