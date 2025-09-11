## 📘 **PRETEST **

---

### 🔹 A. **Pilihan Ganda (20 Soal)**

#### ✅ Spring Boot Security

1. Anotasi yang digunakan untuk mengaktifkan Spring Security:
   A. `@EnableSecurity`
   B. `@EnableWebSecurity` **TRUE**
   C. `@EnableSpringBootSecurity`
   D. `@EnableSecureApp`

2. Apa itu `AuthenticationManager` dalam Spring Security?
   A. Komponen untuk mengatur authorization 
   B. Class yang memproses autentikasi user **TRUE**
   C. Konfigurasi password encoder
   D. Token parser

3. Apa peran dari `@PreAuthorize("hasRole('ADMIN')")`?
   A. Mengatur login
   B. Menghindari token expiry
   C. Membatasi akses method hanya untuk ADMIN **TRUE**
   D. Menyimpan role ke database

4. Class `UserDetails` diimplementasikan untuk...?
   A. Konfigurasi JPA
   B. Logging REST request
   C. Representasi user dalam security context **TRUE**
   D. Mapping endpoint

5. Library umum untuk hashing password di Spring Security:
   A. AES
   B. MD5
   C. BCrypt **TRUE**
   D. HMAC256

---

#### 🌐 Basic REST API (Spring Web)

6. Anotasi `@RestController` adalah gabungan dari...?
   A. `@Controller` + `@RequestParam`
   B. `@Controller` + `@PathVariable`
   C. `@Controller` + `@ResponseBody` **TRUE**
   D. `@RequestMapping` + `@Service`

7. HTTP method `PUT` biasanya digunakan untuk...?
   A. Menghapus data
   B. Mengupdate atau mengganti resource **TRUE**
   C. Mengambil file
   D. Menyambungkan endpoint

8. Jika Anda ingin mengambil parameter dari `/product/{id}`, Anda akan menggunakan...?
   A. `@RequestParam`
   B. `@RequestHeader`
   C. `@PathVariable` **TRUE**
   D. `@PathParam`

9. Untuk membaca JSON body dan mengonversinya ke object Java, kita gunakan...?
   A. `@RequestMapping`
   B. `@RequestBody`**TRUE**
   C. `@PathVariable`
   D. `@GetMapping`

10. Kode status HTTP yang sesuai untuk `Resource Not Found`:
    A. 200
    B. 201
    C. 404 **TRUE**
    D. 500

---

#### 🧩 Spring Data JPA

11. Anotasi `@Entity` di JPA digunakan untuk...?
    A. Mengatur mapping DTO
    B. Menandai class sebagai table di database **TRUE**
    C. Mendaftarkan bean service
    D. Mengatur konfigurasi Spring Boot

12. Apa tujuan dari `@Id` dalam entity class?
    A. Menandai kolom biasa
    B. Menyimpan objek transient
    C. Menandai primary key **TRUE**
    D. Mengatur sorting

13. Anotasi `@GeneratedValue(strategy = GenerationType.IDENTITY)` digunakan untuk...?
    A. Menyimpan record tanpa ID
    B. Membuat kolom unik
    C. Membiarkan database membuat ID otomatis **TRUE**
    D. Mengatur batch update

14. Apa peran `JpaRepository` dalam Spring Data?
    A. Konfigurasi controller
    B. Layer service REST
    C. Abstraksi akses data CRUD **TRUE**
    D. Mapping response JSON

15. Relasi One-to-Many di JPA ditandai dengan...?
    A. `@ManyToMany`
    B. `@OneToOne`
    C. `@OneToMany` **TRUE**
    D. `@Column(unique = true)`

---

#### 🧪 Unit Testing

16. Apa anotasi JUnit 5 untuk membuat method menjadi test unit?
    A. `@Run`
    B. `@TestCase`
    C. `@Test`**TRUE**
    D. `@Execute`

17. Mockito digunakan untuk...?
    A. Menyimpan object ke file
    B. Menguji performance
    C. Membuat object palsu (mock) **TRUE**
    D. Mengatur cache object

18. `@MockBean` biasanya digunakan di...?
    A. Spring Boot Application utama
    B. Test berbasis Spring context **TRUE**
    C. File konfigurasi YAML
    D. Static class

19. `MockMvc` berguna untuk...?
    A. Testing service layer
    B. Membuat dummy API
    C. Menguji controller REST tanpa menjalankan server **TRUE**
    D. Logging request

20. Apa tujuan dari anotasi `@BeforeEach`?
    A. Menjalankan test terakhir
    B. Setup sebelum setiap test method **TRUE**
    C. Cleanup setelah test
    D. Menentukan environment

---

### 🔸 B. **Benar / Salah (10 Soal)**

21. Spring Security secara default memblokir semua endpoint. **TRUE**
22. `@PathVariable` digunakan untuk membaca data dari query parameter. **FALSE**
23. `JpaRepository` menyediakan method seperti `findAll()` dan `save()`. **TRUE**
24. `@GeneratedValue` dapat digunakan bersama `@Id`. **TRUE**
25. Spring Boot membutuhkan konfigurasi manual untuk mapping JSON ke class. **FALSE**
26. `@RestController` hanya bisa digunakan untuk GET request. **FALSE**
27. `BCryptPasswordEncoder` menghasilkan hash yang konsisten tanpa salt. **FALSE**
28. Penamaan variable sebaiknya camelCase. **TRUE**
29. Nama class di Java sebaiknya menggunakan PascalCase. **TRUE**
30. `assertEquals(expected, actual)` digunakan untuk membandingkan dua nilai dalam unit test. **TRUE**

---

### 🧾 C. **Isian Singkat (5 Soal)**

31. Apa perbedaan antara `@RestController` dan `@Controller`?
-> @Controller mengembalikan view atau dalam bentuk HTML.
-> @RestController adalah gabungan dari @Controller dan @ResponseBody, selain itu @RestController mengembalikan JSON/XML sebagai response.

32. Jelaskan fungsi `@ManyToOne` dan contoh penggunaannya dalam relasi data.
-> @ManyToOne untuk mendefinisikan relasi banyak-ke-satu antara dua entitas, contoh seperti banyak orang dapat mendaftar ke satu beasiswa.

33. Apa itu `principal` dalam konteks Spring Security?
-> principal adalah representasi dari user yang sedang dicek atau di autentikasi didalam spring security.

34. Sebutkan dua konvensi penamaan dalam Java (untuk class dan variable).
-> Penamaan variable sebaiknya camelCase. Contoh : namaUser
-> Penamaan class sebaiknya menggunakan PascalCase. Contoh : UserEntity.java

35. Mengapa penting menggunakan mocking saat membuat unit test?
-> karena dapat mensimulasikan dependensi dengan objek tiruan sehingga tidak perlu menggunakan objek nyata. dan tidak akan mengganggu dependensi eksternal karena hanya fokus pada bagian yang di test

---

### 🔧 D. **Koreksi Kode (5 Soal)**

36.

```java
@Entity
public class Product {
    @Id                                                 // Menambahkan @Id untuk memberi tahu bahwa variabel id ini adalah Primary Key di database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
```

37.

```java
@GetMapping("/user/{id}")
public User getUser(/*@RequestParam*/ @PathVariable Long id) { // Seharusnya menggunakan @PathVariable untuk membaca nilai dari path, @RequestParam hanya untuk query parameter
    ...
}
```

38.

```java
@PostMapping("/register")
public String registerUser(@RequestBody User user) { // seharusnya menggunakan @RequestBody untuk mapping JSON request kedalam object user
    ...
}
```

39.

```java
@Mock
UserService userService = new UserServiceImpl();
```
```java
@Mock
UserService userService; // harusnya ini untuk deklarasi

@Test           // lalu membuat fungsi untuk melakukan testing dengan menggunakan userService yang sudah di deklarasi
void test(){
    when(userService.findByUsername("TEST"));
    //......
}
```


40.

```java
public class /*userService*/ UserService {  // seharusnya penamaan class dibuat PascalCase
    public void saveUser(User user) { ... }
}
```

---
