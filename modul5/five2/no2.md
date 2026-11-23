## Penggunaan `break` vs `continue` dalam Pencarian Karakter pada `String`

**Jawaban:** Anda harus menggunakan kata kunci **`break`**.

### Penjelasan Alasan

| Kata Kunci | Perilaku dalam Perulangan `while` | Kesesuaian dengan Kasus Pencarian |
| :--- | :--- | :--- |
| **`break`** | **Menghentikan seluruh perulangan seketika** dan langsung keluar menuju baris kode setelah blok `while`. | **Tepat digunakan.** Begitu spasi pertama ditemukan, tujuan pencarian sudah tercapai sehingga sisa karakter di belakangnya tidak perlu diperiksa lagi (lebih efisien). |
| **`continue`** | **Hanya melewati sisa kode pada iterasi saat ini**, lalu langsung melompat kembali ke pengecekan kondisi `while` untuk memeriksa karakter berikutnya. | **Tidak tepat digunakan.** Perulangan akan tetap berjalan menelusuri sisa `String` hingga karakter terakhir, padahal instruksi meminta pencarian dihentikan saat spasi pertama ditemukan. |

### Contoh Implementasi dalam Java

```java
String kalimat = "Halo Dunia Java";
int i = 0;
int indeksSpasi = -1;

while (i < kalimat.length()) {
    if (kalimat.charAt(i) == ' ') {
        indeksSpasi = i;
        break; // Langsung keluar dari loop begitu spasi pertama ditemukan
    }
    i++;
}

System.out.println("Spasi pertama ditemukan pada indeks ke-" + indeksSpasi); // Output: 4
```