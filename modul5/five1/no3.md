## Benar atau Salah: `if/else` Selalu Dapat Digantikan dengan `switch`

**Jawaban: Salah (False)**

Sebaliknya, setiap pernyataan `switch` selalu dapat ditulis ulang menggunakan `if/else`, tetapi tidak semua pernyataan `if/else` dapat digantikan oleh `switch`.

### Alasan Utama

| Aspek | Pernyataan `if/else` | Pernyataan `switch` |
| :--- | :--- | :--- |
| **Tipe Data yang Didukung** | Mendukung semua ekspresi yang menghasilkan `boolean` (termasuk perbandingan `double`, `float`, `long`, dan objek). | Terbatas hanya pada tipe tertentu: `byte`, `short`, `char`, `int` (beserta kelas *wrapper*-nya), `String`, dan `enum`. |
| **Jenis Kondisi** | Dapat mengecek rentang nilai atau pertidaksamaan (`<`, `>`, `<=`, `>=`, `!=`). | Hanya dapat mengecek **kesamaan nilai persis** (seperti operator `==` atau `.equals()`). |
| **Kombinasi Variabel** | Dapat menggabungkan kondisi dari banyak variabel sekaligus menggunakan `&&` atau `||` (contoh: `if (umur >= 17 && punyaSIM)`). | Hanya mengevaluasi **satu** variabel/ekspresi tunggal pada bagian `switch(ekspresi)`. |

### Contoh `if/else` yang Tidak Bisa Diganti `switch`

```java
double ipk = 3.75;
boolean lulusTepatWaktu = true;

// Tidak bisa diubah ke switch karena menggunakan tipe double, rentang (>=), dan dua variabel
if (ipk >= 3.50 && lulusTepatWaktu) {
    System.out.println("Cum Laude");
}
```