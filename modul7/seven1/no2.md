## Identifikasi Bagian-Bagian Kunci *Class* `Animal`

Karena instruksi meminta penandaan visual (bintang, kotak, lingkaran, segitiga, dan garis bawah), berikut adalah **panduan visualisasi penandaan** pada kode beserta **tabel rincian lengkap** untuk dokumentasi.

---

### A. Visualisasi Penandaan pada Kode

**Keterangan Simbol:**
* **`*` (Bintang):** *Instance variable*
* **`┌───┐` (Kotak):** *Constructor* (seluruh blok dari nama hingga kurung kurawal tutup `}`)
* **`◯` (Lingkaran):** *Method signature* (nama *method* beserta daftar parameternya)
* **`△` (Segitiga):** *Parameter* (variabel di dalam tanda kurung)
* **`‾‾‾` (Garis Bawah):** Tipe kembalian (*return type*)

```text
public class Animal {
    // * Instance variables (Beri tanda BINTANG)
    int *weight*, *height*;
    double *speed*;

    ┌──────────────────────────────────────┐  <-- KOTAK (Constructor 1)
    │ Animal() {                           │
    │     weight = 50;                     │
    │     height = 4;                      │
    │     speed = 2; //miles per hour      │
    │ }                                    │
    └──────────────────────────────────────┘

    ┌──────────────────────────────────────┐  <-- KOTAK (Constructor 2)
    │ Animal( △int w, int h, int s△ ) {    │  <-- SEGITIGA di sekitar parameter
    │     weight = w;                      │
    │     h = height;                      │
    │     speed = s                        │
    │ }                                    │
    └──────────────────────────────────────┘

    // GARIS BAWAH pada return type, LINGKARAN pada signature, SEGITIGA pada parameter
    public double ◯ getTime( △double miles△ ) ◯ {
           ‾‾‾‾‾‾
        return miles/speed;
    }

    public int ◯ getWeight() ◯ { return weight; }
           ‾‾‾

    public int ◯ getHeight() ◯ { return height; }
           ‾‾‾

    public double ◯ getSpeed() ◯ { return speed; }
           ‾‾‾‾‾‾
}
```

---

### B. Tabel Rincian Komponen *Class* `Animal`

| Komponen *Class* | Penanda Visual | Daftar Elemen dalam Kode `Animal` | Keterangan |
| :--- | :---: | :--- | :--- |
| ***Instance Variable*** | **Bintang (`*`)** | • `weight` (tipe `int`)<br>• `height` (tipe `int`)<br>• `speed` (tipe `double`) | Variabel milik objek yang dideklarasikan di dalam *class*, tetapi di luar *constructor* maupun *method*. |
| ***Constructor*** | **Kotak** | 1. `Animal() { ... }`<br>2. `Animal(int w, int h, int s ) { ... }` | Blok kode khusus yang namanya sama persis dengan nama *class* (`Animal`) dan **tidak memiliki *return type***. |
| ***Method Signature*** | **Lingkaran** | 1. `getTime(double miles)`<br>2. `getWeight()`<br>3. `getHeight()`<br>4. `getSpeed()` | Terdiri dari **nama *method* dan daftar parameternya** (tidak termasuk *access modifier* `public` maupun *return type*). |
| ***Parameter*** | **Segitiga** | • `int w, int h, int s` (pada *constructor* ke-2)<br>• `double miles` (pada *method* `getTime`) | Variabel lokal yang diterima di dalam tanda kurung `(...)` saat *constructor* atau *method* dipanggil. |
| ***Return Type*** | **Garis Bawah** | • `double` (pada `getTime`)<br>• `int` (pada `getWeight`)<br>• `int` (pada `getHeight`)<br>• `double` (pada `getSpeed`) | Tipe data nilai yang dikembalikan oleh *method* melalui pernyataan `return`. |