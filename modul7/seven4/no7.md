## Diagram UML Sederhana Hierarki *Class* `Shape` dan `Object`

Dalam bahasa pemrograman Java, setiap *class* secara otomatis merupakan turunan (*subclass*) dari *class* induk tertinggi bernama **`Object`** (`java.lang.Object`). Oleh karena itu, **`Shape`** mewarisi **`Object`**, kemudian diturunkan ke **`Rectangle`**, **`Triangle`**, dan **`Circle`**, serta **`Square`** mewarisi **`Rectangle`**.

### Diagram UML Pewarisan (*Inheritance*)

```text
                        +---------------+
                        |    Object     |
                        +---------------+
                                ▲
                                |
                        +---------------+
                        |     Shape     |
                        +---------------+
                                ▲
                                |
           +--------------------+--------------------+
           |                    |                    |
    +-------------+      +-------------+      +-------------+
    |  Rectangle  |      |  Triangle   |      |   Circle    |
    +-------------+      +-------------+      +-------------+
           ▲
           |
    +-------------+
    |   Square    |
    +-------------+
```

### Rincian Hubungan Antar-*Class*

* **`Shape` $\rightarrow$ `Object`:** `Shape` adalah *subclass* langsung dari `Object` (*superclass* utama di Java).
* **`Rectangle`, `Triangle`, `Circle` $\rightarrow$ `Shape`:** Ketiga bentuk bangun datar tersebut merupakan jenis dari `Shape` (`extends Shape`).
* **`Square` $\rightarrow$ `Rectangle`:** `Square` (persegi) adalah bentuk khusus dari `Rectangle` (persegi panjang), sehingga mewarisi sifat dari `Rectangle` (`extends Rectangle`) sekaligus mewarisi sifat dari `Shape` dan `Object` secara tidak langsung (*multilevel inheritance*).