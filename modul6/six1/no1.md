## Deklarasi dan Inisialisasi *Array* Dua Dimensi (`matrix`)

Untuk mendeklarasikan dan menginisialisasi *array* dua dimensi bertipe `long` berukuran **4 baris × 3 kolom** dengan semua elemen bernilai `5`, terdapat dua cara yang dapat digunakan:

### Cara 1: Inisialisasi Langsung (*Array Initializer*)

```java
long[][] matrix = {
    {5L, 5L, 5L},
    {5L, 5L, 5L},
    {5L, 5L, 5L},
    {5L, 5L, 5L}
};
```

### Cara 2: Menggunakan Perulangan Bersarang (*Nested `for` Loop*)

```java
long[][] matrix = new long[4][3];

for (int baris = 0; baris < matrix.length; baris++) {
    for (int kolom = 0; kolom < matrix[baris].length; kolom++) {
        matrix[baris][kolom] = 5L;
    }
}
```

### Contoh Program Lengkap (`InisialisasiMatrix.java`)

```java
public class InisialisasiMatrix {
    public static void main(String[] args) {
        long[][] matrix = {
            {5L, 5L, 5L},
            {5L, 5L, 5L},
            {5L, 5L, 5L},
            {5L, 5L, 5L}
        };

        // Menampilkan isi array 2D
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### *Output* Program

```text
5 5 5 
5 5 5 
5 5 5 
5 5 5 
```