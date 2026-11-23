## Pernyataan `if/else` Menggunakan Operator Ternary

Operator ternary (`?:`) merupakan bentuk singkat dari percabangan `if/else` dengan format dasar:
`kondisi ? nilai_jika_true : nilai_jika_false;`

### Sintaks Java

```java
boolean hasil = (x <= 7) ? true : false;
```

### Perbandingan dengan Bentuk `if/else` Standar

| Bentuk Percabangan | Sintaks Kode |
| :--- | :--- |
| **Operator Ternary** | `boolean hasil = (x <= 7) ? true : false;` |
| **Pernyataan `if/else` Biasa** | `boolean hasil;`<br>`if (x <= 7) {`<br>`    hasil = true;`<br>`} else {`<br>`    hasil = false;`<br>`}` |

### Contoh Penggunaan Lengkap

```java
public class CekTernary {
    public static void main(String[] args) {
        int x = 5;

        // Menggunakan operator ternary untuk mengecek apakah x kurang dari atau sama dengan 7
        boolean hasil = (x <= 7) ? true : false;

        System.out.println("Apakah x <= 7? " + hasil); // Output: true
    }
}
```