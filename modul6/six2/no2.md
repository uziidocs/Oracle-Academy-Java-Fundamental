## Analisis Kesalahan pada Kode Perulangan `for`

Terdapat **dua kesalahan logika (*logic error*)** pada potongan kode tersebut sehingga tidak menghasilkan *output* `"Hello World!"` sebanyak empat kali:

### 1. Kesalahan Utama: Tanda Titik Koma (`;`) Setelah `for`
```java
for(int i = 0; i < 4; i++); // <-- Kesalahan di sini
```
* **Penyebab:** Adanya tanda titik koma (`;`) tepat di akhir baris `for` membuat perulangan berakhir seketika sebagai **pernyataan kosong (*empty statement*)**.
* **Dampak:** Perulangan `for` berjalan 4 kali tanpa melakukan apa-apa. Blok kurung kurawal `{ ... }` di bawahnya dianggap sebagai blok kode biasa yang terpisah dari `for`, sehingga hanya dieksekusi **satu kali** dan mencetak `"Hello World"` (tanpa tanda seru).

### 2. Kesalahan Kedua: Perubahan Isi Variabel `str` (`str += "!";`)
* **Penyebab:** Variabel `str` diinisialisasi tanpa tanda seru (`"Hello World"`), kemudian di dalam blok ditambahkan `str += "!";` setelah perintah cetak.
* **Dampak:** Jika hanya titik komanya yang dihapus, program akan mencetak teks yang berbeda-beda di setiap baris (`Hello World`, `Hello World!`, `Hello World!!`, `Hello World!!!`), bukan mencetak `"Hello World!"` secara konsisten sebanyak empat kali.

---

### Perbaikan Kode yang Benar

```java
String str = "Hello World!";
for (int i = 0; i < 4; i++) {
    System.out.println(str);
}
```

### *Output* Setelah Diperbaiki

```text
Hello World!
Hello World!
Hello World!
Hello World!
```