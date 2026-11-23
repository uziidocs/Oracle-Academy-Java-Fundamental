## Perbedaan antara *Abstract Class* dan *Interface*

### a. Tabel Perbandingan *Abstract Class* vs. *Interface*

| Aspek Perbedaan | *Abstract Class* | *Interface* |
| :--- | :--- | :--- |
| **Kata Kunci Deklarasi** | `abstract class NamaClass` | `interface NamaInterface` |
| **Kata Kunci Pewarisan** | `extends` (hanya bisa mewarisi **1** *class* induk) | `implements` (bisa mengimplementasikan **banyak** *interface* sekaligus) |
| **Jenis *Method*** | Dapat memiliki *abstract method* (tanpa isi) maupun *concrete method* (dengan isi/implementasi). | Secara standar berisi *abstract method* (sejak Java 8+ juga mendukung `default` dan `static` *method*). |
| **Variabel / Atribut** | Dapat memiliki *instance variable* biasa (non-static, non-final) untuk menyimpan *state* objek. | Hanya dapat memiliki konstanta (`public static final`). |
| ***Constructor*** | **Memiliki** *constructor* (dipanggil oleh *subclass* melalui `super()`). | **Tidak memiliki** *constructor* karena tidak dapat diinstansiasi secara langsung. |
| ***Access Modifier*** | Mendukung `public`, `protected`, *default*, dan `private`. | Anggota secara implisit bersifat `public` (Java 9+ mendukung `private` *helper method*). |

---

### b. Kapan Lebih Tepat Menggunakan *Abstract Class* atau *Interface*?

#### 1. Gunakan *Abstract Class* Ketika:
* **Hubungan pewarisan sangat erat (*is-a relationship*):** *Class-class* turunan berasal dari satu keluarga/hierarki yang sama (contoh: `Vehicle` sebagai induk dari `Car` dan `Motorcycle`, atau `Shape` sebagai induk dari `Circle` dan `Rectangle`).
* **Berbagi kode dan *state* yang sama:** Beberapa *subclass* membutuhkan atribut non-konstanta (*instance variable*) yang sama atau implementasi dasar *method* yang sudah jadi agar tidak menulis kode berulang.
* **Membutuhkan kontrol akses (*access modifier*) dan *constructor*:** Anda memerlukan *modifier* `protected` atau `private` untuk mengatur visibilitas anggota internal, serta *constructor* untuk menginisialisasi data awal *superclass*.

#### 2. Gunakan *Interface* Ketika:
* **Mendefinisikan kemampuan atau kontrak perilaku (*can-do relationship*):** *Class-class* yang mengimplementasikannya tidak harus berada dalam satu hierarki keluarga yang sama (contoh: *interface* `Flyable` dapat diimplementasikan oleh `Bird` dan `Airplane`).
* **Membutuhkan *Multiple Inheritance* (Pewarisan Ganda):** Karena Java tidak mengizinkan sebuah *class* melakukan `extends` terhadap lebih dari satu *class*, *interface* digunakan agar satu *class* dapat memiliki banyak peran sekaligus (contoh: `class SmartPhone implements Camera, MusicPlayer, GPS`).
* **Fokus pada spesifikasi API tanpa peduli detail internal:** Anda hanya ingin menetapkan **apa** yang harus dilakukan oleh sebuah *class* (daftar *method*), sementara **bagaimana** cara kerjanya diserahkan sepenuhnya kepada masing-masing *class* pengimplementasi.

---

### c. Contoh Penerapan Singkat

```java
// Abstract Class: Merepresentasikan identitas dasar (is-a) dan berbagi state
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method (implementasi bersama)
    public void sleep() {
        System.out.println(name + " sedang tidur.");
    }

    // Abstract method (wajib di-override oleh subclass)
    public abstract void makeSound();
}

// Interface: Merepresentasikan kemampuan tambahan (can-do)
interface Swimmable {
    void swim();
}

// Subclass mewarisi 1 Abstract Class dan mengimplementasikan Interface
class Duck extends Animal implements Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " berbunyi: Kwek! Kwek!");
    }

    @Override
    public void swim() {
        System.out.println(name + " berenang di permukaan danau.");
    }
}
```