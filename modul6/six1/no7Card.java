package modul6.six1;

public class no7Card {
    String suit, name;
    int points;

    public no7Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName(int i) {
        switch (i) {
            case 1:  return "Ace";
            case 2:  return "Two";
            case 3:  return "Three";
            case 4:  return "Four";
            case 5:  return "Five";
            case 6:  return "Six";
            case 7:  return "Seven";
            case 8:  return "Eight";
            case 9:  return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Unknown";
        }
    }

    public int getPoints(String n) {
        switch (n) {
            case "Ace":   return 11; // Ace dihitung 11 di awal
            case "Two":   return 2;
            case "Three": return 3;
            case "Four":  return 4;
            case "Five":  return 5;
            case "Six":   return 6;
            case "Seven": return 7;
            case "Eight": return 8;
            case "Nine":  return 9;
            case "Ten":
            case "Jack":
            case "Queen":
            case "King":  return 10;
            default:      return 0;
        }
    }

    public String getSuit(int i) {
        switch (i) {
            case 1:  return "Diamonds";
            case 2:  return "Clubs";
            case 3:  return "Spades";
            case 4:  return "Hearts";
            default: return "Unknown";
        }
    }
}