## Diagram UML Pewarisan (*Inheritance*)

Dalam diagram kelas UML (*Unified Modeling Language*), hubungan pewarisan (**"adalah jenis dari"** / *is-a relationship* / `extends`) digambarkan menggunakan garis lurus dengan **panah segitiga tertutup (`▲`) yang menunjuk dari *subclass* (kelas anak) ke arah *superclass* (kelas induk)**.

---

### a. Diagram UML Hierarki *Class* `Tree`

* **Superclass utama:** `Tree`
* **Subclass dari `Tree`:** `Hardwood`, `Softwood`
* **Subclass dari `Hardwood`:** `Birch`, `Ash`
* **Subclass dari `Softwood`:** `Cedar`, `Pine`
* **Subclass dari `Pine`:** `Red Pine`

```text
                     +------------+
                     |    Tree    |
                     +------------+
                           ▲
                           |
            +--------------+--------------+
            |                             |
     +------------+                +------------+
     |  Hardwood  |                |  Softwood  |
     +------------+                +------------+
           ▲                             ▲
           |                             |
     +-----+-----+                 +-----+-----+
     |           |                 |           |
 +-------+   +-------+         +-------+   +-------+
 | Birch |   |  Ash  |         | Cedar |   | Pine  |
 +-------+   +-------+         +-------+   +-------+
                                               ▲
                                               |
                                          +----------+
                                          | Red Pine |
                                          +----------+
```

---

### b. Diagram UML Hierarki *Class* `A` hingga `F`

* **Superclass utama:** `A`
* **Subclass dari `A`:** `B`, `C`
* **Subclass dari `B`:** `D`
* **Subclass dari `C`:** `E`
* **Subclass dari `E`:** `F`

```text
             +-------+
             |   A   |
             +-------+
                 ▲
                 |
         +-------+-------+
         |               |
     +-------+       +-------+
     |   B   |       |   C   |
     +-------+       +-------+
         ▲               ▲
         |               |
     +-------+       +-------+
     |   D   |       |   E   |
     +-------+       +-------+
                         ▲
                         |
                     +-------+
                     |   F   |
                     +-------+
```