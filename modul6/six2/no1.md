## Perbedaan antara *Syntax Error*, *Logic Error*, dan *Exception*

Dalam pemrograman Java, kesalahan dibagi menjadi tiga kategori utama berdasarkan waktu kemunculan dan dampaknya terhadap eksekusi program:

### Tabel Perbandingan

| Aspek | *Syntax Error* | *Logic Error* | *Exception* (*Runtime Error*) |
| :--- | :--- | :--- | :--- |
| **Waktu Terjadi** | Saat kompilasi (*compile-time*). | Saat program dijalankan (*runtime*). | Saat program dijalankan (*runtime*). |
| **Penyebab Utama** | Penulisan kode melanggar aturan tata bahasa (*grammar*) Java. | Kesalahan alur algoritma, rumus matematika, atau kondisi percabangan. | Operasi ilegal atau kondisi tak terduga saat eksekusi berlangsung. |
| **Status Kompilasi** | **Gagal** dikompilasi (program tidak bisa dijalankan sama sekali). | **Berhasil** dikompilasi dan berjalan hingga selesai tanpa *crash*. | **Berhasil** dikompilasi, tetapi berhenti paksa (*crash*) di tengah jalan jika tidak ditangani. |
| **Cara Mendeteksi** | Langsung ditandai oleh *compiler* atau IDE beserta nomor barisnya. | Harus diuji (*testing*) dengan membandingkan *output* aktual dan *output* yang diharapkan. | Muncul pesan *stack trace* di konsol (misalnya `ArithmeticException`) dan dapat ditangani dengan blok `try-catch`. |

---

### Penjelasan Detail & Contoh Kode

#### 1. *Syntax Error* (Kesalahan Sintaks)
Terjadi ketika programmer salah mengetik kode sehingga tidak sesuai dengan aturan penulisan Java, seperti lupa titik koma (`;`), salah eja kata kunci (*keyword*), atau kurung kurawal tidak berpasangan.

```java
public class ContohSyntaxError {
    public static void main(String[] args) {
        int angka = 10 // Syntax Error: kurang tanda titik koma (;)
        System.out.println(angka);
    }
}
```

#### 2. *Logic Error* (Kesalahan Logika)
Terjadi ketika program sudah bebas dari kesalahan tata bahasa dan tidak mengalami *crash*, tetapi memberikan hasil akhir yang keliru karena logika perhitungannya salah.

```java
public class ContohLogicError {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 4;

        // Logic Error: rumus luas seharusnya panjang * lebar, bukan ditambah
        int luas = panjang + lebar; 
        System.out.println("Luas persegi panjang: " + luas); // Output keliru: 9 (seharusnya 20)
    }
}
```

#### 3. *Exception* (Kesalahan Saat Eksekusi / *Runtime*)
Terjadi ketika program mencoba melakukan operasi yang mustahil dijalankan oleh JVM (*Java Virtual Machine*), seperti membagi bilangan dengan nol, mengakses indeks *array* di luar batas, atau membaca input bertipe salah.

```java
public class ContohException {
    public static void main(String[] args) {
        int[] data = {10, 20, 30};

        // Exception: ArrayIndexOutOfBoundsException karena indeks maksimal adalah 2
        System.out.println(data[5]); 
    }
}
```