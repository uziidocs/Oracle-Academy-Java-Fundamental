## Menggabungkan Dua Objek `String` (*Concatenation*)

Di Java, dua objek `String` dapat digabungkan menggunakan operator `+` atau *method* bawaan `.concat()`.

### Potongan Sintaks

```java
// 1. Deklarasi dan instansiasi dua objek String yang terpisah
String kataPertama = "Belajar";
String kataKedua = "Java";

// 2. Menggabungkan keduanya dan menetapkannya ke objek String ketiga
// Cara 1: Menggunakan operator '+' (paling umum)
String kalimatLengkap = kataPertama + " " + kataKedua;

// Cara 2: Menggunakan method .concat()
String kalimatConcat = kataPertama.concat(" ").concat(kataKedua);
```

### Contoh Program Lengkap (`GabungString.java`)

```java
public class GabungString {
    public static void main(String[] args) {
        String namaDepan = "Budi";
        String namaBelakang = "Santoso";

        // Menggabungkan dua String dengan spasi di antaranya
        String namaLengkap = namaDepan + " " + namaBelakang;

        System.out.println("Hasil penggabungan: " + namaLengkap);
    }
}
```

### *Output* Program

```text
Hasil penggabungan: Budi Santoso
```## 3. Menggabungkan Dua Objek `String` (*Concatenation*)

Di Java, dua objek `String` dapat digabungkan menggunakan operator `+` atau *method* bawaan `.concat()`.

### Potongan Sintaks

```java
// 1. Deklarasi dan instansiasi dua objek String yang terpisah
String kataPertama = "Belajar";
String kataKedua = "Java";

// 2. Menggabungkan keduanya dan menetapkannya ke objek String ketiga
// Cara 1: Menggunakan operator '+' (paling umum)
String kalimatLengkap = kataPertama + " " + kataKedua;

// Cara 2: Menggunakan method .concat()
String kalimatConcat = kataPertama.concat(" ").concat(kataKedua);
```

### Contoh Program Lengkap (`GabungString.java`)

```java
public class GabungString {
    public static void main(String[] args) {
        String namaDepan = "Budi";
        String namaBelakang = "Santoso";

        // Menggabungkan dua String dengan spasi di antaranya
        String namaLengkap = namaDepan + " " + namaBelakang;

        System.out.println("Hasil penggabungan: " + namaLengkap);
    }
}
```

### *Output* Program

```text
Hasil penggabungan: Budi Santoso
```