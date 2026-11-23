## Perbedaan antara *Checked Exception* dan *Unchecked Exception*

Dalam Java, seluruh *exception* merupakan turunan dari kelas `Throwable` (khususnya `Exception`), tetapi dibagi menjadi dua kategori utama berdasarkan bagaimana *compiler* memperlakukannya:

### Tabel Perbandingan

| Aspek | *Checked Exception* | *Unchecked Exception* |
| :--- | :--- | :--- |
| **Waktu Pengecekan** | Diperiksa oleh *compiler* pada saat **kompilasi (*compile-time*)**. | Tidak diperiksa oleh *compiler*; baru muncul saat **program dijalankan (*runtime*)**. |
| **Kewajiban Penanganan** | **Wajib ditangani** menggunakan blok `try-catch` atau dideklarasikan dengan kata kunci `throws`. Jika tidak, kode gagal dikompilasi. | **Tidak wajib ditangani** secara eksplisit (kode tetap bisa dikompilasi tanpa `try-catch`). |
| **Hierarki Kelas Java** | Turunan langsung dari kelas **`Exception`** (kecuali `RuntimeException` dan turunannya). | Turunan dari kelas **`RuntimeException`** (serta `Error`). |
| **Penyebab Umum** | Kondisi eksternal di luar kendali program (file hilang, jaringan terputus, kesalahan akses *database*). | Kesalahan logika atau kelalaian *programmer* (indeks *array* melampaui batas, membagi dengan nol, mengakses objek `null`). |
| **Contoh Kelas Java** | `IOException`, `FileNotFoundException`, `SQLException`, `InterruptedException` | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `InputMismatchException` |

---

### Contoh Kode Perbandingan

#### 1. *Checked Exception* (Wajib Ditangani Saat Kompilasi)
Jika program mencoba membuka file eksternal menggunakan `FileReader`, *compiler* memaksa kode dibungkus dalam blok `try-catch` (atau menambahkan `throws FileNotFoundException` pada *method*).

```java
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ContohChecked {
    public static void main(String[] args) {
        try {
            // Tanpa try-catch atau throws, baris ini memicu compile-time error
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
```

#### 2. *Unchecked Exception* (Tidak Wajib Ditangani Saat Kompilasi)
Program tetap lolos kompilasi meskipun tidak menggunakan `try-catch`, tetapi akan mengalami *crash* jika kondisi salah terjadi saat dieksekusi.

```java
public class ContohUnchecked {
    public static void main(String[] args) {
        String teks = null;

        // Lolos kompilasi, tetapi memicu NullPointerException saat dijalankan
        System.out.println(teks.length());
    }
}
```