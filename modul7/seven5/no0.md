## Analisis *Output* Program (`DynamicDispatch`)

### *Output* Program

```text
Inside Class B's Method!
Inside Class C's Method!
Inside Class A's Method!
```

---

### Penelusuran Eksekusi Kode (*Execution Trace*)

| Baris Kode | Referensi Objek pada `ref` | *Method* yang Dieksekusi | *Output* yang Ditampilkan |
| :--- | :--- | :--- | :--- |
| `ref = b; ref.callthis();` | Objek dari *class* `B` | `B.callthis()` | `Inside Class B's Method!` |
| `ref = c; ref.callthis();` | Objek dari *class* `C` | `C.callthis()` | `Inside Class C's Method!` |
| `ref = a; ref.callthis();` | Objek dari *class* `A` | `A.callthis()` | `Inside Class A's Method!` |

---

### Penjelasan Konsep (*Dynamic Method Dispatch* / Polimorfisme)

* **Variabel Referensi *Superclass* (`A ref;`):** Variabel `ref` dideklarasikan bertipe *superclass* `A`, sehingga dapat menampung referensi objek dari `A` itu sendiri maupun dari seluruh *subclass*-nya (`B` dan `C`).
* **Penentuan *Method* saat *Runtime* (*Dynamic Method Dispatch*):** Ketika sebuah *method* di-*override* oleh *subclass*, Java menentukan versi *method* mana yang akan dipanggil berdasarkan **tipe objek aktual yang ditunjuk saat program berjalan (*runtime*)**, bukan berdasarkan tipe variabel referensinya (`A`).
  * Saat `ref` menunjuk ke objek `b`, versi `callthis()` milik `B` yang dijalankan.
  * Saat `ref` menunjuk ke objek `c`, versi `callthis()` milik `C` yang dijalankan.
  * Saat `ref` menunjuk ke objek `a`, versi `callthis()` milik `A` yang dijalankan.