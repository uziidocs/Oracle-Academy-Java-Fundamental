## Tiga Cara Mendeklarasikan dan Menginstansiasi Objek `String`

Berikut adalah tiga cara berbeda untuk membuat objek `String` bernama `myString` dengan nilai `"abc"` dalam Java:

| Cara | Metode / Pendekatan | Sintaks Java | Penjelasan |
| :---: | :--- | :--- | :--- |
| **1** | ***String Literal* (Langsung)** | `String myString = "abc";` | Cara paling umum dan hemat memori karena Java menyimpan nilainya di dalam *String Constant Pool*. |
| **2** | **Konstruktor `new String(String)`** | `String myString = new String("abc");` | Membuat objek `String` baru secara eksplisit di memori *Heap* menggunakan kata kunci `new`. |
| **3** | **Konstruktor `new String(char[])`** | `char[] data = {'a', 'b', 'c'};`<br>`String myString = new String(data);` | Menginstansiasi objek `String` dengan mengonversi sekumpulan karakter (*array* `char`) menjadi satu teks utuh. |

### Contoh dalam Blok Kode Java

```java
// Cara 1: Menggunakan String literal
String myString = "abc";

// Cara 2: Menggunakan keyword 'new' dengan parameter String
String myString = new String("abc");

// Cara 3: Menggunakan keyword 'new' dengan array karakter (char[])
char[] karakter = {'a', 'b', 'c'};
String myString = new String(karakter);
```