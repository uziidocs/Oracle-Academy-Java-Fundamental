## Evaluasi Operasi pada Objek `String`

Diketahui deklarasi objek `String` berikut:

```java
String s1 = "ABC";
String s2 = new String("DEF");
String s3 = "AB" + "C";
```

### Hasil yang Dikembalikan (`a` – `e`)

| No | Pernyataan | Nilai Kembali | Tipe Data | Penjelasan |
| :---: | :--- | :---: | :---: | :--- |
| **a** | `s1.compareTo(s2);` | **`-3`** | `int` | Membandingkan `"ABC"` dengan `"DEF"` secara leksikografis. Karakter pertama `'A'` (ASCII 65) dikurangi `'D'` (ASCII 68) menghasilkan `65 - 68 = -3`. |
| **b** | `s2.equals(s3);` | **`false`** | `boolean` | Membandingkan isi teks secara langsung. Nilai `"DEF"` tidak sama dengan `"ABC"`. |
| **c** | `s3 == s1;` | **`true`** | `boolean` | Operator `==` membandingkan alamat memori. Karena `"AB" + "C"` adalah penggabungan dua *string literal* konstan, kompilator mengoptimalkannya menjadi `"ABC"` di *String Constant Pool* sehingga merujuk ke alamat memori yang sama dengan `s1`. |
| **d** | `s2.compareTo(s3);` | **`3`** | `int` | Membandingkan `"DEF"` dengan `"ABC"`. Karakter pertama `'D'` (ASCII 68) dikurangi `'A'` (ASCII 65) menghasilkan `68 - 65 = 3`. |
| **e** | `s3.equals(s1);` | **`true`** | `boolean` | Membandingkan isi karakter kedua `String`. Nilai `"ABC"` identik dengan `"ABC"`. |