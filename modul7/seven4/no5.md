## 5. Hierarki *Inheritance* Alat Musik (`Instrument`, `StringInstrument`, `Guitar`)

### a. Diagram UML Hierarki *Class*

Berdasarkan spesifikasi soal Oracle Academy Bagian 7.4 Nomor 5, hubungan pewarisan (*multilevel inheritance*) dimulai dari *superclass* **`Instrument`**, diturunkan ke **`StringInstrument`**, dan diturunkan lagi ke **`Guitar`**:

```text
+------------------------------------------+
|                Instrument                |
+------------------------------------------+
| - onSale : boolean                       |
| - price : double                         |
| - numInStock : int                       |
+------------------------------------------+
| + Instrument()                           |
| + Instrument(price : double,             |
|              numInStock : int,           |
|              onSale : boolean)           |
| + getPrice() : double                    |
| + applyEmployeeDiscount() : double       |
| + setOnSale(onSale : boolean) : void     |
| + getOnSale() : boolean                  |
| + setPrice(price : double) : void        |
| + setNumInStock(numInStock : int) : void |
| + getNumInStock() : int                  |
+------------------------------------------+
                     ▲
                     |
+------------------------------------------+
|             StringInstrument             |
+------------------------------------------+
| - numStrings : int                       |
+------------------------------------------+
| + StringInstrument()                     |
| + StringInstrument(price : double,       |
|                    numInStock : int,     |
|                    onSale : boolean,     |
|                    numStrings : int)     |
| + getNumStrings() : int                  |
| + setNumStrings(numStrings : int) : void |
+------------------------------------------+
                     ▲
                     |
+------------------------------------------+
|                  Guitar                  |
+------------------------------------------+
| - isElectric : boolean                   |
+------------------------------------------+
| + Guitar()                               |
| + Guitar(price : double,                 |
|          numInStock : int,               |
|          onSale : boolean,               |
|          numStrings : int,               |
|          isElectric : boolean)           |
| + getIsElectric() : boolean              |
| + setIsElectric(isElectric : boolean)    |
+------------------------------------------+
```

---

### b. Implementasi Kode Java

#### 1. `Instrument.java` (*Superclass*)

```java
public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;

    // Default constructor
    public Instrument() {
        this.price = 0.0;
        this.numInStock = 0;
        this.onSale = false;
    }

    // Parameterized constructor
    public Instrument(double price, int numInStock, boolean onSale) {
        this.price = price;
        this.numInStock = numInStock;
        this.onSale = onSale;
    }

    // Jika onSale bernilai true, kembalikan harga 15% lebih murah (85% dari harga asli)
    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    // Diskon karyawan sebesar 25% (membayar 75% dari harga)
    public double applyEmployeeDiscount() {
        return getPrice() * 0.75;
    }

    // Getter dan Setter
    public boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}
```

#### 2. `StringInstrument.java` (*Subclass* dari `Instrument`)

```java
public class StringInstrument extends Instrument {
    private int numStrings;

    // Default constructor
    public StringInstrument() {
        super();
        this.numStrings = 0;
    }

    // Parameterized constructor
    public StringInstrument(double price, int numInStock, boolean onSale, int numStrings) {
        super(price, numInStock, onSale);
        this.numStrings = numStrings;
    }

    // Getter dan Setter
    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
```

#### 3. `Guitar.java` (*Subclass* dari `StringInstrument`)

```java
public class Guitar extends StringInstrument {
    private boolean isElectric;

    // Default constructor
    public Guitar() {
        super();
        this.isElectric = false;
    }

    // Parameterized constructor
    public Guitar(double price, int numInStock, boolean onSale, int numStrings, boolean isElectric) {
        super(price, numInStock, onSale, numStrings);
        this.isElectric = isElectric;
    }

    // Getter dan Setter
    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
}
```

#### 4. `TestMusicStore.java` (*Driver Class* Pengujian)

```java
public class TestMusicStore {
    public static void main(String[] args) {
        // 1. Gitar Akustik (tidak sedang diskon / onSale = false)
        Guitar acousticGuitar = new Guitar(2000000.0, 5, false, 6, false);

        System.out.println("=== Gitar Akustik (Normal) ===");
        System.out.println("Stok Tersedia         : " + acousticGuitar.getNumInStock());
        System.out.println("Jumlah Senar          : " + acousticGuitar.getNumStrings());
        System.out.println("Gitar Listrik?        : " + acousticGuitar.getIsElectric());
        System.out.println("Status On Sale        : " + acousticGuitar.getOnSale());
        System.out.printf("Harga Jual            : Rp %.2f%n", acousticGuitar.getPrice());
        System.out.printf("Harga Diskon Karyawan : Rp %.2f%n", acousticGuitar.applyEmployeeDiscount());

        // 2. Gitar Listrik (sedang promo / onSale = true)
        Guitar electricGuitar = new Guitar(4000000.0, 3, true, 6, true);

        System.out.println("\n=== Gitar Listrik (On Sale 15%) ===");
        System.out.println("Stok Tersedia         : " + electricGuitar.getNumInStock());
        System.out.println("Jumlah Senar          : " + electricGuitar.getNumStrings());
        System.out.println("Gitar Listrik?        : " + electricGuitar.getIsElectric());
        System.out.println("Status On Sale        : " + electricGuitar.getOnSale());
        System.out.printf("Harga Jual (Sale)     : Rp %.2f%n", electricGuitar.getPrice());
        System.out.printf("Harga Diskon Karyawan : Rp %.2f%n", electricGuitar.applyEmployeeDiscount());
    }
}
```

---

### c. Contoh *Output* & Penjelasan Logika Perhitungan

```text
=== Gitar Akustik (Normal) ===
Stok Tersedia         : 5
Jumlah Senar          : 6
Gitar Listrik?        : false
Status On Sale        : false
Harga Jual            : Rp 2000000.00
Harga Diskon Karyawan : Rp 1500000.00

=== Gitar Listrik (On Sale 15%) ===
Stok Tersedia         : 3
Jumlah Senar          : 6
Gitar Listrik?        : true
Status On Sale        : true
Harga Jual (Sale)     : Rp 3400000.00
Harga Diskon Karyawan : Rp 2550000.00
```