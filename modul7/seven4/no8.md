## Diagram UML Sederhana Hierarki *Class* `Animal` dan `Object`

Dalam Java, seluruh hierarki *class* berakar pada *superclass* tertinggi yaitu **`Object`**. Dengan demikian, **`Animal`** mewarisi **`Object`**, lalu diturunkan menjadi **`Mammal`** dan **`Crustacean`**, yang masing-masing diturunkan kembali hingga ke **`Dog`** dan **`Hermit Crab`**.

### Diagram UML Pewarisan (*Inheritance*)

```text
                        +---------------+
                        |    Object     |
                        +---------------+
                                ▲
                                |
                        +---------------+
                        |    Animal     |
                        +---------------+
                                ▲
                                |
                 +--------------+--------------+
                 |                             |
          +-------------+              +--------------+
          |   Mammal    |              |  Crustacean  |
          +-------------+              +--------------+
                 ▲                             ▲
                 |                             |
          +-------------+              +--------------+
          |     Dog     |              |     Crab     |
          +-------------+              +--------------+
                                               ▲
                                               |
                                       +--------------+
                                       | Hermit Crab  |
                                       +--------------+
```

### Rincian Hubungan Antar-*Class*

* **`Animal` $\rightarrow$ `Object`:** `Animal` merupakan *subclass* langsung dari `Object` (kelas induk utama dalam Java).
* **`Mammal` & `Crustacean` $\rightarrow$ `Animal`:** Keduanya adalah jenis-jenis dari `Animal` (`extends Animal`).
* **`Dog` $\rightarrow$ `Mammal`:** `Dog` merupakan jenis dari `Mammal` (`extends Mammal`).
* **`Crab` $\rightarrow$ `Crustacean`:** `Crab` merupakan jenis dari `Crustacean` (`extends Crustacean`).
* **`Hermit Crab` $\rightarrow$ `Crab`:** `Hermit Crab` merupakan jenis khusus dari `Crab` (`extends Crab`), sehingga secara bertingkat juga merupakan bagian dari `Crustacean`, `Animal`, dan `Object` (*multilevel inheritance*).