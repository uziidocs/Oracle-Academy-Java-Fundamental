Komponen dan Urutan dalam File `.java`

Berikut adalah komponen penyusun file `.java` yang diurutkan sesuai aturan kompilator dan konvensi standar Java:

| Urutan | Komponen | Status | Keterangan |
| :---: | :--- | :--- | :--- |
| 1 | **Komentar Header** | Opsional | Catatan lisensi, pembuat, atau dokumentasi (`//`, `/* */`, `/** */`). |
| 2 | **Deklarasi `package`** | Opsional (Maks. 1) | Menentukan *namespace* atau lokasi folder. Wajib di baris kode pertama jika ada. |
| 3 | **Pernyataan `import`** | Opsional (0 atau lebih) | Memanggil kelas/pustaka luar. Wajib setelah `package` dan sebelum deklarasi kelas. |
| 4 | **Deklarasi Kelas Utama** | **Wajib** | Wadah utama (`class`, `interface`, `enum`, `record`). Nama kelas `public` harus sama dengan nama file. |
| 5 | **Variabel / Atribut (*Fields*)** | Opsional | Menyimpan data/status objek (urutan lazim: `static final`, `static`, lalu variabel instans). |
| 6 | **Konstruktor** | Opsional | Blok inisialisasi objek saat dipanggil dengan kata kunci `new`. Namanya sama dengan kelas. |
| 7 | **Metode (*Methods*)** | Opsional | Berisi logika program, termasuk `public static void main(String[] args)` sebagai titik awal eksekusi. |
| 8 | **Kelas Bersarang (*Inner Class*)** | Opsional | Kelas tambahan yang didefinisikan di dalam tubuh kelas utama. |

### Contoh Struktur Lengkap (`Mahasiswa.java`)

```java
// 1. Komentar Header
package com.kampus.akademik; // 2. Deklarasi Package

import java.util.Scanner; // 3. Pernyataan Import

// 4. Deklarasi Kelas Utama
public class Mahasiswa {

    // 5. Variabel / Atribut (Fields)
    private String nama;

    // 6. Konstruktor
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // 7. Metode (Methods)
    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Andi");
        mhs.tampilkanInfo();
    }

    // 8. Kelas Bersarang / Inner Class
    class KartuTandaMahasiswa {
        String nomorKartu;
    }
}
```