package modul5.five1;
import java.util.Scanner;

public class no2switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dua bilangan double dan satu karakter operator
        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = input.next().charAt(0);

        double hasil = 0;
        boolean operatorValid = true;

        switch (operator) {
            case '*':
                hasil = angka1 * angka2;
                break;
            case '+':
                hasil = angka1 + angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    operatorValid = false;
                }
                break;
            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                } else {
                    System.out.println("Error: Modulus dengan nol tidak diizinkan.");
                    operatorValid = false;
                }
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            default:
                System.out.println("Error: Operator tidak dikenali!");
                operatorValid = false;
        }

        if (operatorValid) {
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }

        input.close();
    }
}