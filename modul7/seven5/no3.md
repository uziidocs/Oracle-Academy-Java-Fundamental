## *Override Method* `toString()` untuk Perhitungan Faktorial

### a. Potongan *Method* `toString()` (Jawaban Inti)

```java
@Override
public String toString() {
    String output = "Factorial: " + num + "! = ";

    for (int i = 1; i <= num; i++) {
        output += i;
        if (i < num) {
            output += " * ";
        }
    }

    output += " = " + getFactorial();
    return output;
}
```

---

### b. Implementasi Lengkap dalam *Class* (`Factorial.java` & `TestFactorial.java`)

> **Catatan Perbaikan Kode Bawaan Soal (`getFactorial`):** Pada potongan kode *method* `getFactorial()` di soal terdapat tiga kesalahan sintaks/logika yang menyebabkan gagal *compile* atau *infinite loop*:
> 1. Variabel `int factorial;` belum diberi nilai awal `1` (`int factorial = 1;`).
> 2. Variabel `i` belum dideklarasikan tipe datanya (`int i = num;`) serta kondisi perulangan harus memeriksa `i > 0` (bukan `num > 0`).
> 3. Perkalian di dalam *loop* harus menggunakan `factorial *= i;` (bukan `num`).

#### 1. `Factorial.java`

```java
public class Factorial {
    // Variabel global public sesuai asumsi soal
    public int num;

    public Factorial(int num) {
        this.num = num;
    }

    int getFactorial() {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        String output = "Factorial: " + num + "! = ";

        for (int i = 1; i <= num; i++) {
            output += i;
            if (i < num) {
                output += " * ";
            }
        }

        output += " = " + getFactorial();
        return output;
    }
}
```

#### 2. `TestFactorial.java` (*Driver Class* Pengujian)

```java
public class TestFactorial {
    public static void main(String[] args) {
        Factorial f = new Factorial(10);
        System.out.println(f);
    }
}
```

---

### c. *Output* Program

```text
Factorial: 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800
```