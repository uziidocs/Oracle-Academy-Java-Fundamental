## Deklarasi dan Inisialisasi *Array* Satu Dimensi (`values`)

Untuk mendeklarasikan dan menginisialisasi *array* satu dimensi bertipe `byte` berukuran **10 elemen** dengan seluruh nilainya berisi `1`, terdapat dua cara utama yang dapat digunakan:

### Cara 1: Inisialisasi Langsung (*Array Initializer*)

```java
byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
```

### Cara 2: Menggunakan Perulangan `for`

```java
byte[] values = new byte[10];

for (int i = 0; i < values.length; i++) {
    values[i] = 1;
}
```

### Contoh Program Lengkap (`InisialisasiValues.java`)

```java
public class InisialisasiValues {
    public static void main(String[] args) {
        byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // Menampilkan seluruh elemen array
        System.out.print("Isi array values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
```

### *Output* Program

```text
Isi array values: 1 1 1 1 1 1 1 1 1 1 
```