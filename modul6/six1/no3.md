## Menelusuri *Output* Program *Array* dan Perulangan `for`

### *Output* Program

```text
7654
```

### Penelusuran Langkah demi Langkah (*Trace*)

*Array* `num` memiliki 8 elemen dengan indeks `0` sampai `7`:

| Indeks (`i`) | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| **Nilai (`num[i]`)** | **7** | 7 | **6** | 6 | **5** | 5 | **4** | 4 |

Perulangan `for (int i = 0; i < 8; i = i + 2)` dimulai dari `i = 0` dan melompat sebanyak `2` langkah setiap iterasi:

1. **Iterasi 1 (`i = 0`):** Kondisi `0 < 8` bernilai `true` $\rightarrow$ mencetak `num[0]` yaitu **`7`**.
2. **Iterasi 2 (`i = 2`):** Kondisi `2 < 8` bernilai `true` $\rightarrow$ mencetak `num[2]` yaitu **`6`**.
3. **Iterasi 3 (`i = 4`):** Kondisi `4 < 8` bernilai `true` $\rightarrow$ mencetak `num[4]` yaitu **`5`**.
4. **Iterasi 4 (`i = 6`):** Kondisi `6 < 8` bernilai `true` $\rightarrow$ mencetak `num[6]` yaitu **`4`**.
5. **Iterasi 5 (`i = 8`):** Kondisi `8 < 8` bernilai `false` $\rightarrow$ perulangan berhenti.