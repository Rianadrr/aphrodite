## 🧠 **Pre-Test Backend Engineer (Java, OOP, Spring Boot)**

---

### 🔸 **A. Pilihan Ganda (5 Soal)**

1. Apa yang menjadi tanggung jawab utama seorang Backend Engineer?

   - A. Mendesain UI
   - **B. Mengelola logika aplikasi dan komunikasi data dengan database**
   - C. Membuat animasi
   - D. Membuat desain grafis

2. Dalam OOP Java, konsep **encapsulation** berarti:

   - **A. Menyembunyikan detail implementasi dan menyediakan akses lewat method**
   - B. Mewarisi method dari class lain
   - C. Menambahkan method ke dalam class
   - D. Menghubungkan dua class yang berbeda

3. `@Autowired` pada Spring Boot digunakan untuk:

   - A. Menjalankan program utama
   - B. Menyimpan konfigurasi properties
   - **C. Meng-inject dependency otomatis ke dalam bean**
   - D. Mendaftarkan endpoint baru

4. Mengapa sebaiknya logika bisnis diletakkan di service layer?

   - A. **Agar controller lebih ringan dan fokus pada request/response**
   - B. Agar lebih cepat dalam compile
   - C. Karena controller tidak mendukung operasi logika
   - D. Agar dapat digunakan langsung tanpa testing

5. Di bawah ini adalah cara yang benar membuat endpoint di Spring Boot:

   - A. `@Route("/api")`
   - B. `@Mapping("/api")`
   - **C. `@GetMapping("/api")`**
   - D. `@WebRoute("/api")`

---

### 🔸 **B. True / False (5 Soal)**

6. Dalam arsitektur backend, service biasanya dipanggil langsung dari frontend. **(FALSE)**
7. Constructor Injection adalah cara yang direkomendasikan untuk dependency injection di Spring. **(TRUE)**
8. `@Service` digunakan untuk menandai sebuah class sebagai penyedia logika bisnis. **(TRUE)**
9. Semua logika bisa ditaruh dalam controller agar tidak perlu membuat banyak file. **(FALSE)**
10. Spring Boot memerlukan `main()` method untuk menjalankan aplikasinya. **(TRUE)**

---

### 🔸 **C. Jawaban Singkat Penjelasan (10 Soal)**

11. Jelaskan apa itu Backend dan bagaimana perannya dalam aplikasi.
-> Backend adalah sebuah logika aplikasi yang menjalankan, memproses aplikasi dari belakang atau dibalik UI antara server dan user.

12. Apa perbedaan antara class dan object dalam Java?
-> Class adalah cakupan atau ruang yang menyimpan beberapa object, sedangkan Object adalah bagian dari class
-> Contoh : CLassnya manusia objectnya Mike, Rian, Varrel

13. Sebutkan dan jelaskan 2 prinsip OOP lainnya selain encapsulation.
-> Inheritence adalah warisan atau turunan dari sifat class yang sudah ada
-> Abstraksi adalah membuat antarmuka yang sederhana untuk fungsionalitas yang kompleks

14. Mengapa kita menggunakan annotation `@RestController`?
-> untuk mengontrol atau menangani HTTP request dan mengembalikan berupa response JSON atau XML

15. Apa keuntungan menggunakan Spring Boot dibanding membuat server dari nol di Java?
-> menjadi lebih mudah karena seperti di sediakan template jadi tidak perlu membuat dari nol

16. Jelaskan cara kerja dependency injection di Spring Boot secara sederhana.
-> untuk menyediakan object secara otomatis yang dibutuhkan oleh class

17. Apa manfaat memisahkan controller dan service dalam arsitektur aplikasi?
-> Mengatur alur komunikasi antara client (frontend, API, browser) dan aplikasi
-> Berisi logika bisnis utama aplikasi dan penghubung antara controller dan repository

18. Jelaskan apa yang terjadi jika Anda tidak menambahkan `@Service` pada class yang berisi logika.
-> maka class tersebut tidak akan dikenali sehingga dependency injection tidak berjalan juga

19. Apa itu `@RequestParam` dan kapan digunakan?
-> untuk mengambil nilai dari parameter yang dikirim melalui query string atau form data pada HTTP request.

20. Bagaimana cara menghubungkan controller ke service menggunakan constructor?
-> cukup tandai class service dengan @Service dan gunakan constructor injection di controller. Spring akan secara otomatis membuat dan menyuntikkan objek service yang dibutuhkan.

---

### 🔸 **D. Koreksi Kode (5 Soal)**

> Jelaskan kesalahan dan berikan versi yang benar.

21.

```java
@RestController

@Service // harusnya di panggil servicenya 

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello(); // error
    }
}
```

22.

```java
public class Person {
    public String name;

    public Person(String name) { // void tidak dibutuhkan karena disini menggunakan this untuk mereturn name
        this.name = name;
    }
}
```

23.

```java
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody String name) { // kurang 'String' untuk tipe datanya
        return "Hello, " + name;
    }
}
```

24.

```java
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// controller
@RestController
public class InfoController {

    private final InfoService infoService;

    // menambahkan constructor Injection
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/info")
    public String get() {
        // InfoService info = new InfoService(); dihapus karena tidak menggunakan consturctor untuk membuat object service
        return info.getInfo();
    }
}
```

25.

```java
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) { // menambahkan '@RequestParam' untuk mendapatkan body request
        return a + b;
    }
}
```
