Perbedaan Upper Camel Case dan Lower Camel Case

Keduanya menggabungkan beberapa kata tanpa spasi dan menggunakan huruf kapital di setiap awal kata berikutnya. Perbedaannya hanya terletak pada **huruf pertama**:

| Aspek | Upper Camel Case | Lower Camel Case |
| :--- | :--- | :--- |
| **Huruf Pertama** | Kapital (huruf besar) | Kecil (huruf kecil) |
| **Nama Lain** | *PascalCase* | *camelCase* (standar) |
| **Contoh** | `DataMahasiswaBaru` | `dataMahasiswaBaru` |

### Kapan Menggunakannya di Java?

* **Upper Camel Case** digunakan untuk menamai tipe data bentukan atau cetak biru (*blueprint*) objek:
  * **Kelas (*Class*):** `AkunBank`, `SistemPembayaran`
  * **Antarmuka (*Interface*):** `DapatDicetak`, `KendaraanBermotor`
  * ***Enum* & *Record*:** `StatusPesanan`, `DetailTransaksi`

* **Lower Camel Case** digunakan untuk menamai elemen yang menyimpan nilai, parameter, atau menjalankan aksi:
  * **Variabel & Atribut (*Fields*):** `namaLengkap`, `saldoAkhir`, `jumlahBarang`
  * **Metode / Fungsi (*Methods*):** `hitungTotalHarga()`, `kirimNotifikasi()`
  * **Parameter Metode:** `public void aturJadwal(String hariKerja, int jamMulai)`