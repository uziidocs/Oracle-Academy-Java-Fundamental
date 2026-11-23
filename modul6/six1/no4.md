## Menelusuri *Output* Program *Array* Dua Dimensi dan Satu Dimensi

### *Output* Program

```text
333
765
```

### Penelusuran Langkah demi Langkah (*Trace*)

#### 1. Kondisi Awal *Array*
* *Array* 2D `num` (2 baris × 3 kolom):
  * Baris 0 (`num[0]`): `{3, 3, 3}`
  * Baris 1 (`num[1]`): `{2, 2, 2}`
* *Array* 1D `array`: `{4, 3, 2}`

#### 2. Perulangan Pertama (Mengubah Nilai Baris ke-1 `num`)
Perulangan `for (int i = 0; i < 3; i++)` mengganti setiap elemen pada baris indeks `1` (`num[1][i]`) dengan hasil penjumlahan `num[0][i] + array[i]`:

* **Iterasi 1 (`i = 0`):** `num[1][0] = num[0][0] + array[0]` $\rightarrow 3 + 4 = \mathbf{7}$
* **Iterasi 2 (`i = 1`):** `num[1][1] = num[0][1] + array[1]` $\rightarrow 3 + 3 = \mathbf{6}$
* **Iterasi 3 (`i = 2`):** `num[1][2] = num[0][2] + array[2]` $\rightarrow 3 + 2 = \mathbf{5}$

#### 3. Kondisi Akhir *Array* `num`

| Baris \ Kolom | Kolom `0` | Kolom `1` | Kolom `2` |
| :--- | :---: | :---: | :---: |
| **Baris `0` (`num[0]`)** | `3` | `3` | `3` |
| **Baris `1` (`num[1]`)** | `7` | `6` | `5` |

#### 4. Perulangan Bersarang Kedua (Mencetak Isi `num`)
* Saat `i = 0` (baris pertama), `System.out.print(num[0][j])` mencetak elemen secara bersebelahan tanpa spasi (`333`), lalu `System.out.println()` membuat baris baru.
* Saat `i = 1` (baris kedua), `System.out.print(num[1][j])` mencetak elemen baris kedua secara bersebelahan (`765`), lalu berpindah ke baris baru.