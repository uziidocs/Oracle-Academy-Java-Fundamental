## Konversi Rumus Matematika ke Sintaks Java (`Math` Class)

Dalam Java, operasi akar kuadrat, perpangkatan, dan trigonometri menggunakan *method* statis dari kelas `java.lang.Math` (tidak perlu di-*import* karena sudah otomatis tersedia dari paket `java.lang`).

| Simbol Matematika | *Method* Java | Fungsi |
| :--- | :--- | :--- |
| $\sqrt{n}$ (`akar`) | `Math.sqrt(n)` | Menghitung akar kuadrat dari $n$ |
| $x^y$ | `Math.pow(x, y)` | Menghitung $x$ pangkat $y$ |
| $\cos(x)$ | `Math.cos(x)` | Menghitung kosinus dari $x$ (dalam radian) |
| $\sin(x)$ | `Math.sin(x)` | Menghitung sinus dari $x$ (dalam radian) |

### Jawaban Sintaks Java (`a` – `f`)

```java
// a. a = akar(x^5 - 6) / 4
a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

// b. b = x^y - 6^x
b = Math.pow(x, y) - Math.pow(6, x);

// c. c = 4 * cos(z/5) - sin(x^2)
c = 4 * Math.cos(z / 5.0) - Math.sin(Math.pow(x, 2));

// d. d = x^4 - akar(6x - y^3)
d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));

// e. e = 1 / (y - 1/(x - 2^y))
e = 1 / (y - 1 / (x - Math.pow(2, y)));

// f. f = 7 * (cos(akar(5 - sin(akar(3x - 4)))))
f = 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4)))));
```