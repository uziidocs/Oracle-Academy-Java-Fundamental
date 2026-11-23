## Hierarki *Class* `Person` dan `Student`

### a. Analisis *Access Modifier* (Enkapsulasi)

Seluruh *instance variable* pada *class* `Student` (`studentId`, `gpa`, `major`, `degree`, dan `expectedGraduationYear`) dideklarasikan sebagai **`private`** dengan pertimbangan berikut:
* **Keamanan & Integritas Data:** Data akademik seperti NIM (`studentId`) dan IP (`gpa`) bersifat sensitif sehingga tidak boleh diubah secara langsung dari luar *class* tanpa validasi atau mekanisme perhitungan yang sah.
* **Kontrol Akses Terpusat:** Pembacaan data dilakukan melalui *getter* (`public`), sedangkan perubahan data tertentu—seperti perpindahan jurusan oleh administrator (`setMajor`) atau pembaruan nilai IP (`calculateGPA`)—hanya dapat dilakukan melalui *method* `public` yang disediakan.

---

### b. Diagram UML Terperinci (`Person` dan `Student`)

Simbol `-` menandakan *access modifier* **`private`**, simbol `+` menandakan **`public`**, dan panah segitiga tertutup (`▲`) menunjukkan bahwa `Student` mewarisi (*extends*) *class* `Person`.

```text
+-----------------------------------------------------------------------+
|                                Person                                 |
+-----------------------------------------------------------------------+
| - firstName : String                                                  |
| - middleName : String                                                 |
| - lastName : String                                                   |
| - dateOfBirth : Date                                                  |
+-----------------------------------------------------------------------+
| + Person(firstName : String, middleName : String, lastName : String,  |
|          dateOfBirth : Date)                                          |
| + getFirstName() : String                                             |
| + getMiddleName() : String                                            |
| + getLastName() : String                                              |
| + getName() : String                                                  |
| + getDateOfBirth() : Date                                             |
+-----------------------------------------------------------------------+
                                    ▲
                                    |
+-----------------------------------------------------------------------+
|                                Student                                |
+-----------------------------------------------------------------------+
| - studentId : String                                                  |
| - gpa : double                                                        |
| - major : String                                                      |
| - degree : String                                                     |
| - expectedGraduationYear : int                                        |
+-----------------------------------------------------------------------+
| + Student(firstName : String, middleName : String, lastName : String, |
|           dateOfBirth : Date, studentId : String, major : String,     |
|           degree : String, expectedGraduationYear : int)              |
| + getStudentId() : String                                             |
| + getGpa() : double                                                   |
| + getMajor() : String                                                 |
| + getDegree() : String                                                |
| + getExpectedGraduationYear() : int                                   |
| + setMajor(major : String) : void                                     |
| + calculateGPA(grades : String[]) : double                            |
+-----------------------------------------------------------------------+
```