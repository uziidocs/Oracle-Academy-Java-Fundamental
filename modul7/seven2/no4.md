## Mengapa Dimungkinkan Memiliki Lebih dari Satu *Constructor* dengan Nama yang Sama?

Di dalam Java, memiliki lebih dari satu *constructor* dengan nama yang sama tetapi daftar parameter (*argument*) berbeda dimungkinkan karena adanya fitur ***Constructor Overloading***.

### Alasan Teknis dan Mekanisme Kerja *Compiler*

1. **Identifikasi Berdasarkan *Signature* (Bukan Sekadar Nama):**
   *Compiler* Java membedakan setiap *constructor* berdasarkan ***signature*-nya**, yaitu kombinasi antara **nama *constructor*** dan **daftar parameternya** (meliputi jumlah, tipe data, serta urutan parameter). Selama daftar parameternya berbeda, *compiler* tidak akan menganggapnya sebagai duplikat.
2. **Pencocokan Argumen Saat Kompilasi (*Compile-Time Binding*):**
   Ketika objek baru dibuat menggunakan kata kunci `new`, *compiler* memeriksa jumlah dan tipe data argumen yang dikirim di dalam tanda kurung `(...)`, lalu otomatis memilih *constructor* yang memiliki *signature* paling sesuai.
3. **Fleksibilitas Inisialisasi Objek:**
   Fitur ini memudahkan *programmer* untuk membuat objek dari *class* yang sama dengan cara berbeda—baik menggunakan nilai bawaan (*default*) saat data belum tersedia, maupun langsung mengisi nilai spesifik saat data sudah lengkap.

---

### Ilustrasi pada *Class* `Fish`

Pada *class* `Fish` sebelumnya, kedua *constructor* memiliki nama yang sama (`Fish`), tetapi memiliki *signature* yang berbeda:

| Deklarasi *Constructor* | Daftar Parameter | Pemanggilan Objek | *Constructor* yang Dipilih Java |
| :--- | :--- | :--- | :--- |
| `public Fish()` | Tidak ada (`0` parameter) | `Fish f1 = new Fish();` | *Constructor* ke-1 (mengatur `"Unknown"` dan `3`) |
| `public Fish(String t, int f)` | `(String, int)` (`2` parameter) | `Fish f2 = new Fish("Amberjack", 5);` | *Constructor* ke-2 (mengatur `"Amberjack"` dan `5`) |