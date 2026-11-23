no4 
1. Pengujian dengan Nilai Standar (Angka Bulat Positif)
Masukkan angka bulat positif yang hasilnya mudah dihitung secara manual atau dengan kalkulator, misalnya 1 atau 10. Jika input 10 menghasilkan output 37.85, artinya rumus konversi (gallons * 3.785) sudah berjalan dengan akurat.
2. Pengujian dengan Nilai Desimal (Pecahan)
Masukkan angka desimal seperti 2.5 atau 0.5. Pengujian ini bertujuan memastikan tipe data double dan metode in.nextDouble() mampu membaca serta menghitung nilai pecahan dengan presisi tanpa membulatkan atau memotong angka di belakang koma.
3. Pengujian Nilai Batas dan Input Tidak Valid (Edge Cases)
Uji ketahanan program menggunakan input di luar kondisi normal:

    - Angka nol (0): Memastikan program tetap berjalan lancar dan mengeluarkan hasil 0.0 liter.

    - Angka negatif (misalnya -5) atau teks/huruf (misalnya "abc"): Mengamati perilaku program saat menerima input yang tidak logis atau salah tipe data (seperti munculnya error InputMismatchException ketika pengguna mengetik huruf).