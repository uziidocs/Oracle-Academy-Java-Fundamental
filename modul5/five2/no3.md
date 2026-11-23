## Pemilihan Jenis Perulangan (*Loop*) untuk 365 Hari

### Jawaban Pertanyaan

1. **Dapatkah jumlah eksekusi *loop* diketahui sebelum program dijalankan?**
   **Ya, dapat diketahui.** Karena tahun tersebut diasumsikan bukan tahun kabisat, jumlah hari dalam satu tahun sudah pasti berjumlah **365 hari**, sehingga perulangan akan dieksekusi tepat sebanyak **365 kali**.

2. **Jenis *loop* apa yang perlu diimplementasikan?**
   Perulangan **`for`** (*`for` loop*).

3. **Alasan Pemilihan:**
   Perulangan `for` dirancang khusus untuk kasus **perulangan terhitung (*definite loop*)**, yaitu kondisi ketika jumlah pasti iterasi sudah diketahui sebelum blok perulangan mulai dieksekusi. Seluruh komponen kontrol (inisialisasi penghitung, syarat batas 365 hari, dan penambahan hari) tertulis ringkas dalam satu baris *header*, sehingga kode lebih mudah dibaca dan meminimalkan risiko *infinite loop* akibat lupa menaikkan variabel penghitung.

### Perbandingan Jenis *Loop* dalam Java

| Jenis *Loop* | Sifat Perulangan | Waktu Penggunaan Terbaik |
| :--- | :--- | :--- |
| **`for`** | **Terhitung (*Definite*)** | Jumlah iterasi sudah diketahui secara pasti sejak awal (contoh: mencetak 365 hari dalam setahun). |
| **`while`** | **Tidak Terhitung (*Indefinite*)** | Jumlah iterasi belum diketahui dan bergantung pada kondisi dinamis atau *input* pengguna (memeriksa kondisi di awal). |
| **`do-while`** | **Tidak Terhitung (*Indefinite*)** | Sama seperti `while`, tetapi blok kode wajib dijalankan minimal satu kali sebelum kondisi diperiksa di akhir. |

### Contoh Implementasi dengan `for` Loop

```java
public class HariDalamSetahun {
    public static void main(String[] args) {
        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        // Diketahui pasti berjalan sebanyak 365 kali
        for (int hari = 0; hari < 365; hari++) {
            System.out.println("Hari ke-" + (hari + 1) + ": " + namaHari[hari % 7]);
        }
    }
}
```