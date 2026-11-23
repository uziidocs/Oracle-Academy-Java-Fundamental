## Evaluasi Ekspresi *Boolean* (`true` / `false`)

Diketahui nilai awal variabel: `i = 5` dan `j = 6`.

```java
int i = 5;
int j = 6;
boolean true_false;

true_false = (j < 5);                       // false  (6 kurang dari 5 -> salah)
true_false = (j > 3);                       // true   (6 lebih dari 3 -> benar)
true_false = (j < i);                       // false  (6 kurang dari 5 -> salah)
true_false = (i < 5);                       // false  (5 kurang dari 5 -> salah)
true_false = (j <= 5);                      // false  (6 kurang dari atau sama dengan 5 -> salah)
true_false = (6 < 6);                       // false  (6 kurang dari 6 -> salah)
true_false = (i != j);                      // true   (5 tidak sama dengan 6 -> benar)
true_false = (i == j || i < 50);            // true   (false || true -> true)
true_false = (i == j && i < 50);            // false  (false && true -> false)
true_false = (i > j || true_false && j >= 4); // false  (false || (false && true) -> false)
true_false = (!(i < 2 && j == 5));          // true   (!(false && false) -> !false -> true)
true_false = !true_false;                   // false  (!true -> false)
```

### Penjelasan Tiga Baris Terakhir

1. **Baris 10 (`i > j || true_false && j >= 4`)**: Operator `&&` memiliki prioritas lebih tinggi daripada `||`, sehingga dikerjakan lebih dulu. Karena nilai `true_false` dari baris sebelumnya adalah `false`, maka `(false && true)` menghasilkan `false`, lalu `false || false` tetap **`false`**.
2. **Baris 11 (`!(i < 2 && j == 5)`)**: Ekspresi di dalam kurung bernilai `false`, lalu dibalik oleh operator negasi (`!`) menjadi **`true`**.
3. **Baris 12 (`!true_false`)**: Membalik nilai `true` yang baru saja disimpan pada baris ke-11 menjadi **`false`**.