## Analisis Kompilasi Polimorfisme, *Abstract Class*, dan *Interface*

Berdasarkan deklarasi hierarki *class* dan *interface* yang diberikan:
* `B` adalah *concrete class* yang mengimplementasikan `interface A` $\rightarrow$ `B` wajib mengimplementasikan `public void methodA()`.
* `E` adalah *subclass* dari `B` $\rightarrow$ `E` mewarisi `methodA()` dari `B` dan juga bertipe `A`.
* `C` adalah `abstract class` $\rightarrow$ `C` **tidak dapat** diinstansiasi secara langsung menggunakan `new C()`.
* `D` adalah *concrete class* turunan dari `C` $\rightarrow$ `D` wajib mengimplementasikan `void methodC()`.

---

### a. Tabel Ringkasan Hasil Kompilasi

| No | Potongan Kode | Hasil | Alasan Singkat |
| :---: | :--- | :---: | :--- |
| **1** | `a = new B();` | **Selalu Compile** | `B` adalah *concrete class* yang mengimplementasikan *interface* `A` (*upcasting* valid). |
| **2** | `d = new C();` | **Tidak Compile** | `C` adalah `abstract class` sehingga tidak dapat dibuat objeknya dengan `new C()`. |
| **3** | `b.methodA();` | **Selalu Compile** | `B` mengimplementasikan `A`, sehingga `B` pasti memiliki implementasi `methodA()`. |
| **4** | `e.methodA();` | **Selalu Compile** | `E` mewarisi `B` (`extends B`), sehingga otomatis mewarisi `methodA()`. |
| **5** | `c = new C();` | **Tidak Compile** | `C` dideklarasikan sebagai `abstract class` dan tidak bisa diinstansiasi langsung. |
| **6** | `(D)c.methodC();` | **Tidak Compile** | Operator titik (`.`) dieksekusi lebih dulu daripada *casting* `(D)`, sehingga mencoba melakukan *cast* tipe `void` ke `D`. |

---

### b. Penjelasan Rinci Setiap Baris Kode

1. **`a = new B();` $\rightarrow$ Selalu Compile**
   * Variabel `a` bertipe *interface* `A`, sedangkan `B` adalah *concrete class* yang mengimplementasikan `A` (`public class B implements A`). Dalam konsep polimorfisme Java, variabel bertipe *interface* selalu dapat menyimpan referensi objek dari *class* mana pun yang mengimplementasikannya.

2. **`d = new C();` $\rightarrow$ Tidak Compile**
   * Terdapat dua penyebab *compile error*: pertama, `C` adalah `abstract class` sehingga tidak boleh diinstansiasi dengan `new C()`; kedua, objek *superclass* `C` tidak dapat langsung dimasukkan ke variabel *subclass* `D` tanpa *downcasting* yang sah.

3. **`b.methodA();` $\rightarrow$ Selalu Compile**
   * Karena `B` bukan `abstract class` dan mengimplementasikan `interface A`, kompiler Java mewajibkan `B` memiliki definisi lengkap dari `methodA()`. Oleh karena itu, pemanggilan `b.methodA()` selalu valid.

4. **`e.methodA();` $\rightarrow$ Selalu Compile**
   * *Class* `E` merupakan turunan dari `B` (`public class E extends B`). Seluruh *method* `public` milik `B`—termasuk `methodA()`—diwariskan ke `E`, sehingga `e.methodA()` selalu berhasil dikompilasi.

5. **`c = new C();` $\rightarrow$ Tidak Compile**
   * Meskipun variabel `c` bertipe `C`, sisi kanan pernyataan mencoba membuat *instance* langsung dari `abstract class C` (`new C()`), yang dilarang oleh aturan bahasa Java.

6. **`(D)c.methodC();` $\rightarrow$ Tidak Compile**
   * Dalam aturan prioritas operator (*operator precedence*) Java, operator pemanggilan anggota (`.`) memiliki prioritas **lebih tinggi** daripada operator *type-casting* `(D)`.
   * Akibatnya, kompiler membaca kode tersebut sebagai `(D)(c.methodC())`—yaitu mencoba mengubah tipe kembalian `methodC()` yang bernilai **`void`** menjadi tipe **`D`**, sehingga menghasilkan *compile error* (*incompatible types: void cannot be converted to D*).
   * *(Catatan: Kode ini baru akan **Selalu Compile** jika diberi tanda kurung pada proses casting-nya menjadi `((D)c).methodC();` sehingga objek `c` di-cast ke `D` terlebih dahulu sebelum memanggil `methodC()`).*