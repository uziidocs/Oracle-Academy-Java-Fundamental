## Contoh *Exception* dan Penanganannya dengan Blok `try-catch`

### Deskripsi *Exception* yang Dialami

Salah satu *exception* yang paling sering terjadi saat membuat program interaktif menggunakan `Scanner` adalah **`java.util.InputMismatchException`**.

* **Kronologi Kejadian:** Pada program yang meminta pengguna memasukkan angka bulat melalui `input.nextInt()` (seperti saat memasukkan pilihan menu angka atau nilai ujian), pengguna tidak sengaja mengetik huruf atau karakter teks (misalnya `"abc"`).
* **Dampak Sebelum Ditangani:** Karena `Scanner` gagal mengonversi teks tersebut menjadi tipe data `int`, JVM langsung melemparkan `InputMismatchException` dan menghentikan program secara paksa (*crash*) sebelum selesai dijalankan.

---

### Cara Penanganan dengan Blok `try-catch`

Untuk mencegah program berhenti paksa, kode pembacaan *input* dibungkus di dalam blok **`try`** dan **`catch`**:

1. **Blok `try`:** Berisi kode yang berpotensi memunculkan *exception* (yaitu perintah `input.nextInt()`). Jika pengguna memasukkan angka dengan benar, blok `catch` akan dilewati.
2. **Blok `catch (InputMismatchException e)`:** Menangkap *exception* ketika pengguna memasukkan huruf/simbol. Di dalam blok ini, program menampilkan pesan peringatan yang jelas dan memanggil `input.nextLine()` untuk membersihkan sisa karakter salah di dalam *buffer* `Scanner` agar pengguna dapat mencoba memasukkan angka kembali.

---

### Contoh Implementasi Kode (`PenangananException.java`)

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class PenangananException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Masukkan nilai ujian (angka bulat): ");
                nilai = input.nextInt(); // Berpotensi memicu InputMismatchException
                inputValid = true;       // Tercapai hanya jika input berupa angka bulat
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka bulat! Silakan coba lagi.\n");
                input.nextLine();        // Membersihkan input salah dari buffer Scanner
            }
        }

        System.out.println("Nilai berhasil disimpan: " + nilai);
        input.close();
    }
}
```

### Contoh *Output* Program

```text
Masukkan nilai ujian (angka bulat): delapan puluh
Error: Input harus berupa angka bulat! Silakan coba lagi.

Masukkan nilai ujian (angka bulat): 80
Nilai berhasil disimpan: 80
```