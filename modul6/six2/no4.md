## Contoh Segmen Kode: *Syntax Error*, *Logic Error*, dan *Exception*

### a. *Syntax Error* (Kesalahan Tata Bahasa Kode)

```java
// Kesalahan: tipe data 'String' ditulis huruf kecil ('string') dan lupa titik koma (;)
string teks = "Belajar Java"
System.out.println(teks);
```

* **Penjelasan:** Kode di atas **gagal dikompilasi** karena melanggar aturan penulisan Java—tipe data `String` wajib diawali huruf kapital (`S`) dan setiap pernyataan harus diakhiri tanda titik koma (`;`).

---

### b. *Logic Error* (Kesalahan Logika Perhitungan)

```java
// Kesalahan: lupa memberi tanda kurung pada penjumlahan sebelum dibagi 2
int nilaiTugas = 80;
int nilaiUjian = 90;
double rataRata = nilaiTugas + nilaiUjian / 2.0; 
System.out.println("Rata-rata nilai: " + rataRata); // Output keliru: 125.0 (seharusnya 85.0)
```

* **Penjelasan:** Program berhasil dikompilasi dan berjalan tanpa *crash*, tetapi memberikan hasil yang salah (`125.0`) karena operator pembagian (`/`) dieksekusi lebih dulu dibandingkan penjumlahan (`+`). Seharusnya ditulis `(nilaiTugas + nilaiUjian) / 2.0`.

---

### c. *Exception* (Kesalahan Saat Program Berjalan / *Runtime*)

```java
// Kesalahan: melakukan pembagian bilangan bulat dengan angka nol
int totalSkor = 100;
int jumlahPemain = 0;
int skorPerPemain = totalSkor / jumlahPemain; // Memicu ArithmeticException: / by zero
System.out.println("Skor per pemain: " + skorPerPemain);
```