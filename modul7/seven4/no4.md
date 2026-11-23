## Aksesibilitas Anggota *Superclass* oleh *Subclass* (Benar / Salah)

Berikut adalah analisis apakah sebuah *subclass* dapat mengakses masing-masing kode yang dideklarasikan di dalam *superclass* beserta alasannya:

### Ringkasan Jawaban

| No | Deklarasi pada *Superclass* | Jawaban | Syarat / Keterangan Akses |
| :---: | :--- | :---: | :--- |
| **a** | `public String aString;` | **Benar** | Dapat diakses dari semua *package*. |
| **b** | `protected boolean aBoolean;` | **Benar** | Dapat diakses oleh *subclass* di *package* mana pun. |
| **c** | `int anInt;` | **Benar** *(Bersyarat)* | Hanya jika *subclass* berada dalam ***package* yang sama**. |
| **d** | `private double aDouble;` | **Salah** | Terkunci hanya di dalam *superclass* itu sendiri. |
| **e** | `public String aMethod()` | **Benar** | Dapat diakses dari semua *package*. |
| **f** | `private class aNestedClass` | **Salah** | Tersembunyi sepenuhnya dari *subclass*. |
| **g** | `public aClassConstructor()` | **Benar** *(via `super()`)* | Dapat dipanggil melalui kata kunci `super()`. |

---

### Penjelasan Rinci

* **a. `public String aString;` — Benar**
  * **Alasan:** *Access modifier* `public` memberikan tingkat visibilitas paling terbuka. *Subclass* dapat mengakses variabel ini secara langsung, baik saat berada di dalam *package* yang sama maupun berbeda dengan *superclass*.

* **b. `protected boolean aBoolean;` — Benar**
  * **Alasan:** *Access modifier* `protected` memang dirancang khusus untuk kebutuhan pewarisan (*inheritance*). Variabel ini dapat diakses oleh *class* lain di *package* yang sama serta oleh seluruh *subclass*-nya meskipun berada di *package* yang berbeda.

* **c. `int anInt;` — Benar *(jika berada dalam package yang sama)* / Salah *(jika berbeda package)***
  * **Alasan:** Variabel yang dideklarasikan tanpa *access modifier* memiliki hak akses ***default* (*package-private*)**. *Subclass* hanya dapat mengaksesnya apabila berada di dalam *package* yang sama dengan *superclass*-nya.

* **d. `private double aDouble;` — Salah**
  * **Alasan:** *Access modifier* `private` membatasi akses secara ketat hanya di dalam *class* tempat variabel tersebut dideklarasikan (*superclass*). *Subclass* tidak dapat mengaksesnya secara langsung kecuali melalui *method* `public` atau `protected` (seperti *getter* dan *setter*) yang disediakan oleh *superclass*.

* **e. `public String aMethod()` — Benar**
  * **Alasan:** Karena dideklarasikan dengan modifier `public`, *method* ini diwarisi dan dapat dipanggil langsung oleh *subclass* dari *package* mana pun.

* **f. `private class aNestedClass` — Salah**
  * **Alasan:** Sama seperti variabel dan *method* bertipe `private`, sebuah *inner/nested class* yang diberi modifier `private` hanya dapat diakses dan digunakan di dalam tubuh *superclass* itu sendiri, sehingga tidak dapat dilihat maupun diakses oleh *subclass*.

* **g. `public aClassConstructor()` — Benar *(melalui kata kunci `super()` )***
  * **Alasan:** Meskipun *constructor* tidak diwarisi sebagai *method* biasa oleh *subclass*, *constructor* yang bersifat `public` tetap dapat diakses dan dipanggil oleh *subclass* pada baris pertama *constructor*-nya menggunakan kata kunci **`super()`**.