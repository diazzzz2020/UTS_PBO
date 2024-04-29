# UTS_PBO


Berikut adalah penjelasan tambahan untuk program tersebut:

1. Encapsulation: Setiap kelas memiliki variabel yang bersifat privat (private) seperti `alas`, `tinggi`, `sisi`, dan `tinggi` pada masing-masing kelas. Ini berarti variabel-variabel tersebut tidak dapat diakses langsung dari luar kelas, yang mengikuti prinsip encapsulation. Untuk mengakses dan mengubah nilai-nilai ini, kita menggunakan metode setter dan getter yang disediakan.

2. Setter dan Getter: Setiap kelas memiliki metode setter untuk mengatur nilai variabel privat dan getter untuk mengambil nilainya. Contohnya, di kelas `Segitiga`, terdapat metode `setAlas()` dan `setTinggi()` untuk mengatur nilai `alas` dan `tinggi`, serta metode `getAlas()` dan `getTinggi()` untuk mengambil nilai `alas` dan `tinggi`. Ini memungkinkan akses kontrol yang lebih baik terhadap variabel-variabel tersebut dan menghindari perubahan langsung dari luar kelas.

3. Inheritance: Kelas `Segitiga`, `Persegi`, dan `Balok` adalah turunan dari kelas-kelas lain. `Segitiga` dan `Persegi` adalah turunan dari kelas `BangunDatar`, sementara `Balok` adalah turunan dari kelas `Segitiga` dan juga mengimplementasikan interface `BangunRuang`. Ini menunjukkan penggunaan inheritance untuk mewarisi sifat-sifat dan perilaku dari kelas-kelas lain.

4. Interface: Interface `BangunRuang` digunakan untuk mewakili bangun ruang yang memiliki metode `hitungVolume()`. Kelas `Balok` mengimplementasikan interface ini dengan menghitung volume balok. Ini menunjukkan penggunaan interface untuk membuat kontrak yang harus dipatuhi oleh kelas yang mengimplementasikannya.

Dengan menggunakan konsep-konsep ini, program tersebut menjadi lebih terstruktur, aman, dan mudah dimengerti. Konsep-konsep tersebut merupakan bagian penting dari pemrograman berorientasi objek yang memungkinkan pembangunan aplikasi yang skalabel dan mudah diatur.
