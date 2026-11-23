## Melengkapi Kode dan Diagram UML Hierarki *Class* `Vehicle`

Berdasarkan standar soal latihan Oracle Academy Bagian 7.4 Nomor 6, hierarki pewarisan terdiri dari *superclass* **`Vehicle`** yang diturunkan ke **`Car`** dan **`Bicycle`**, serta **`Convertible`** yang merupakan *subclass* dari **`Car`**.

---

### a. Diagram UML Lengkap (`Vehicle`, `Car`, `Bicycle`, `Convertible`)

Bagian yang biasanya dikosongkan pada lembar soal UML meliputi nama *class* anak (`Car`, `Bicycle`, `Convertible`), atribut masing-masing *subclass* (`isElectric`, `bikeType`, `roofType`), serta *constructor* dan *getter*-nya:

```text
                       +-----------------------------------+
                       |              Vehicle              |
                       +-----------------------------------+
                       | - numWheels : int                 |
                       +-----------------------------------+
                       | + Vehicle(numWheels : int)        |
                       | + getWheels() : int               |
                       +-----------------------------------+
                                         ▲
                                         |
                 +-----------------------+-----------------------+
                 |                                               |
+---------------------------------+             +---------------------------------+
|               Car               |             |             Bicycle             |
+---------------------------------+             +---------------------------------+
| - numDoors : int                |             | - bikeType : String             |
| - isElectric : boolean          |             +---------------------------------+
+---------------------------------+             | + Bicycle(numWheels : int,      |
| + Car(numWheels : int,          |             |           bikeType : String)    |
|       numDoors : int,           |             | + getBikeType() : String        |
|       isElectric : boolean)     |             +---------------------------------+
| + getNumDoors() : int           |
| + getIsElectric() : boolean     |
+---------------------------------+
                 ▲
                 |
+------------------------------------------------+
|                  Convertible                   |
+------------------------------------------------+
| - roofType : String                            |
+------------------------------------------------+
| + Convertible(numWheels : int, numDoors : int, |
|               isElectric : boolean,            |
|               roofType : String)               |
| + getRoofType() : String                       |
+------------------------------------------------+
```

---

### b. Ringkasan Kata Kunci dan Nama *Class* yang Diisi pada Kode

| File *Class* | Bagian Titik-Titik pada Soal | Jawaban Isian yang Benar | Fungsi / Penjelasan |
| :--- | :--- | :--- | :--- |
| **`Car.java`** | `public class Car _______ _______` | `extends Vehicle` | Menyatakan `Car` adalah *subclass* dari `Vehicle`. |
| **`Car.java`** | `______(numWheels);` | `super` | Memanggil *constructor* `Vehicle(int numWheels)`. |
| **`Bicycle.java`** | `public class _______ _______ _______` | `Bicycle extends Vehicle` | Mendeklarasikan `Bicycle` sebagai *subclass* dari `Vehicle`. |
| **`Bicycle.java`** | `______(numWheels);` | `super` | Memanggil *constructor* `Vehicle(int numWheels)`. |
| **`Convertible.java`** | `public class _______ _______ _______` | `Convertible extends Car` | Menyatakan `Convertible` mewarisi *class* `Car`. |
| **`Convertible.java`** | `______(numWheels, numDoors, isElectric);` | `super` | Memanggil *constructor* `Car(int, int, boolean)`. |

---

### c. Kode Sumber Java Lengkap

#### 1. `Vehicle.java`

```java
public class Vehicle {
    private int numWheels;

    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getWheels() {
        return numWheels;
    }
}
```

#### 2. `Car.java`

```java
public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car(int numWheels, int numDoors, boolean isElectric) {
        super(numWheels);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public boolean getIsElectric() {
        return isElectric;
    }
}
```

#### 3. `Bicycle.java`

```java
public class Bicycle extends Vehicle {
    // Mountain bike, road bike, recumbent bike, etc.
    private String bikeType;

    public Bicycle(int numWheels, String bikeType) {
        super(numWheels);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }
}
```

#### 4. `Convertible.java`

```java
public class Convertible extends Car {
    // Soft top or rag top, or hard top
    private String roofType;

    public Convertible(int numWheels, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, numDoors, isElectric);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }
}
```