# Pre-Test: Spring Data JPA & Spring Web Development

## Bagian A – Pilihan Ganda (10 Soal)

1. Annotation apa yang digunakan untuk menandai sebuah class sebagai **Entity** di JPA?

```
 a) `@Table`
 b) `@Entity` **TRUE**
 c) `@Column`
 d) `@Repository`

```

2. Untuk membuat **primary key** otomatis bertambah di JPA, annotation yang digunakan adalah:

```
 a) `@GeneratedValue` **TRUE**
 b) `@Id`
 c) `@PrimaryKey`
 d) `@AutoIncrement`
```

3. Apa fungsi `JpaRepository` di Spring Data JPA?

```
   a) Menyediakan konfigurasi database
   b) Menyediakan implementasi CRUD secara otomatis **TRUE**
   c) Membuat koneksi HTTP
   d) Mengganti controller
```

4. Annotation apa yang digunakan untuk **REST Controller** di Spring Web?

```
   a) `@Controller`
   b) `@RestController` **TRUE**
   c) `@Service`
   d) `@Component`
```

5. Untuk membuat mapping endpoint `/api/users` dengan method GET, digunakan:

```
   a) `@GetMapping("/api/users")` **TRUE**
   b) `@PostMapping("/api/users")`
   c) `@RequestMapping("/api/users", method=POST)`
   d) `@RestMapping("/api/users")`
```

6. Annotation `@Column(nullable = false)` berarti:

   ```
   a) Kolom boleh kosong **TRUE**
   b) Kolom tidak boleh `null` **TRUE**
   c) Kolom tidak akan muncul di tabel
   d) Kolom adalah primary key
   ```

7. Apa kegunaan `@Autowired` dalam Spring?

   ```
   a) Mengatur database schema
   b) Melakukan dependency injection **TRUE**
   c) Menambahkan logging
   d) Membuat endpoint REST
   ```

8. Saat kita menggunakan `findById(id)` pada `JpaRepository`, return type biasanya adalah:

```
 a) `Entity` 
 b) `Optional<Entity>` **TRUE**
 c) `List<Entity>`
 d) `Map<String, Entity>`
```

9. Annotation `@RequestBody` digunakan untuk:

```
 a) Mengambil query parameter dari URL
 b) Mengambil data JSON dari body request **TRUE**
 c) Mengambil header request
 d) Mengambil path variable
```

10. Spring Boot secara default menggunakan database apa untuk **in-memory testing**?

```
    a) MySQL
    b) PostgreSQL
    c) H2 **TRUE**
    d) MongoDB
```

---

## Bagian B – True / False (5 Soal)

1. `@Entity` hanya bisa digunakan sekali di satu aplikasi. (F)
2. `@Repository` digunakan untuk menandai interface JPA repository. (T)
3. `@RestController` sudah termasuk `@ResponseBody` secara default. (T)
4. `JpaRepository` harus selalu diimplementasikan secara manual. (F)
5. `@PathVariable` digunakan untuk mengambil nilai dari URL. (T)

---

## Bagian C – Isian Singkat (5 Soal)

1. Sebutkan perbedaan utama antara `@Controller` dan `@RestController` di Spring Web.
-> **@Controller secara default akan mengembalikan data dalam bentuk HTML atau JSP. Jika ingin mengembalikan data (misalnya JSON), kita harus menambahkan @ResponseBody. Sementara itu, @RestController lebih sederhana karena otomatis mengembalikan data dalam bentuk JSON atau XML tanpa perlu anotasi tambahan.**

2. Apa perbedaan `save()` dan `saveAll()` di JPA?
-> **save() digunakan untuk menyimpan satu entitas ke dalam database, sedangkan saveAll() digunakan untuk menyimpan banyak entitas sekaligus ke dalam database**

3. Bagaimana cara membuat relasi **OneToMany** antara `User` dan `Order` di JPA?
-> Gunakan @OneToMany di User → karena satu user memiliki banyak order.
-> Gunakan @ManyToOne di Order → karena banyak order dimiliki oleh satu user.
-> mappedBy digunakan di sisi One untuk menunjuk field pemilik relasi.
-> @JoinColumn digunakan di sisi Many untuk membuat foreign key. 

4. Apa fungsi dari `application.properties` di Spring Boot?
-> **application.properties berfungsi untuk mengatur konfigurasi aplikasi Spring Boot seperti, Port server, Koneksi database, Logging, Profil aplikasi**

5. Sebutkan 2 keuntungan menggunakan Spring Data JPA dibanding JDBC manual.
**Mengurangi Boilerplate Code (Kode Berulang)**
- JDBC manual → kita harus menulis banyak kode untuk membuat koneksi, menyiapkan statement SQL, mengeksekusi query, memproses ResultSet, dan menutup koneksi secara manual.
- Spring Data JPA → cukup membuat interface repository dan Spring akan secara otomatis membuat implementasinya.

**Mendukung Object Relational Mapping (ORM)**
- JDBC manual → kita harus melakukan mapping data secara manual dari tabel database ke objek Java menggunakan ResultSet.
- Spring Data JPA → data otomatis diubah menjadi objek Java karena menggunakan Hibernate di balik layar.
---

## Bagian D – Perbaikan Kode (5 Soal)

**Soal 1**

```java
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTIFY) // menambahkan untuk auto increment
   private Long id;
   private String name;
}
```

Buat agar id auto increment.

---

**Soal 2**

```java
@RestController
public class UserController {

   @Autowired                                // menambahkan autowired untuk mengatasi dependency injection
   private UserRepository userRepository; 

   @GetMapping("/users")
   public List<User> getAllUsers() {
       return userRepository.findAll();
   }
}
```

Perbaiki error dependency injection `userRepository`.

---

**Soal 3**

```java
public interface UserRepository extends JpaRepository<User, Long> { // menambahkan extend JpaRepository
   User findByName(String name);
}
```

Ubah agar bisa menggunakan Spring Data JPA.

---

**Soal 4**

```java
@PostMapping("/users")
public User addUser(@RequestBody User user) { // menambahkan @RequestBody
   return userRepository.save(user);
}
```

Perbaiki agar data bisa diterima dari request body JSON.

---

**Soal 5**

```java
@Entity
public class Order {
   @Id
   @GeneratedValue
   private Long id;

   @ManyToOne
   private User user;

   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true) // seperti ini mungkin??
   private List<Order> orders;
}
```

Tambahkan mapping di sisi `User` agar relasi bidirectional.

---
