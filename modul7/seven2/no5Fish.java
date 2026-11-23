package modul7.seven2;

public class no5Fish {
    // Instance variables
    String typeOfFish;
    int friendliness;

    // Constructor 1: No-argument constructor
    public no5Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Constructor 2: Parameterized constructor
    public no5Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Method untuk mengembalikan tingkat keramahan ikan
    public int getFriendliness() {
        return friendliness;
    }
}