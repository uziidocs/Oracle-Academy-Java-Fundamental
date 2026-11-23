### Sintaks yang Digunakan

Untuk mengimpor seluruh kelas yang ada di dalam *package* utilitas Java, gunakan tanda bintang (*wildcard*) `*`:

```java
import java.util.*;
```

### Apakah Perlu Mengimpor Class Tambahan dalam Package yang Sama?

**Tidak perlu.** Jika Anda sudah menulis `import java.util.*;`, semua kelas dan *interface* publik yang berada langsung di dalam *package* `java.util` (seperti `Scanner`, `ArrayList`, `HashMap`, dan `Random`) otomatis dapat digunakan tanpa perlu diimpor satu per satu lagi.

| Skenario | Contoh Class | Perlu Import Terpisah? | Penjelasan |
| :--- | :--- | :---: | :--- |
| **Class di *package* yang sama** | `Scanner`, `ArrayList`, `HashMap` | **Tidak** | Sudah otomatis tercakup oleh `import java.util.*;`. |
| **Class di dalam *subpackage*** | `java.util.regex.Pattern` atau `java.util.stream.Stream` | **Ya** | Tanda `*` tidak berlaku secara rekursif untuk *subpackage* (folder di dalam `util`). |

### Contoh Penggunaan

```java
import java.util.*; // Sudah mencakup Scanner, ArrayList, HashMap, dll.
// import java.util.Scanner; -> Tidak perlu ditulis lagi

// Jika membutuhkan subpackage, tetap harus diimpor terpisah:
import java.util.regex.Pattern;

public class ContohUtilitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Budi");
        System.out.println(daftarNama);
    }
}
```