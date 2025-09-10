--

## 🧩 Soal 4 – Internship Application System

### 📁 Repository: `internship-application-api`

### 🎯 Product Requirement:

Sistem mahasiswa melamar magang ke perusahaan.

### 📡 Endpoint (Minimal 8):

| Method | Endpoint                      | Description             |
| ------ | ----------------------------- | ----------------------- |
| POST   | `/companies`                  | Tambah perusahaan       |
| POST   | `/students`                   | Tambah mahasiswa        |
| POST   | `/applications`               | Ajukan lamaran          |
| GET    | `/applications`               | List semua lamaran      |
| GET    | `/applications/{id}`          | Detail lamaran          |
| PUT    | `/applications/{id}`          | Update status lamaran   |
| GET    | `/students/{id}/applications` | Lamaran milik mahasiswa |
| DELETE | `/applications/{id}`          | Hapus lamaran           |

### 🧪 Validasi:

- `@Email`, `@NotBlank` → student
- `@Pattern` → resume_link
- Enum: `status` (PENDING, ACCEPTED, REJECTED)

---

## 🧩 Soal 5 – Scholarship Management System

### 📁 Repository: `scholarship-management-api`

### 🎯 Product Requirement:

Sistem manajemen beasiswa dan pendaftaran mahasiswa.

### 📡 Endpoint (Minimal 8):

| Method | Endpoint                        | Description            |
| ------ | ------------------------------- | ---------------------- |
| POST   | `/scholarships`                 | Tambah beasiswa        | -->
| GET    | `/scholarships`                 | List beasiswa          |
| POST   | `/applicants`                   | Daftar beasiswa        |
| GET    | `/applicants`                   | List pendaftar         |
| GET    | `/applicants/{id}`              | Detail pendaftar       |
| PUT    | `/applicants/{id}`              | Update pendaftar       |
| DELETE | `/applicants/{id}`              | Hapus pendaftar        |
| GET    | `/scholarships/{id}/applicants` | Pendaftar per beasiswa |

### 🧪 Validasi:

- `@DecimalMin("0.00")`, `@DecimalMax("4.00")` → GPA
- `@Size(min=3)` → name
- Custom: `open_date < close_date`

---

## 🧩 Soal 6 – Complaint Reporting System

### 📁 Repository: `complaint-reporting-api`

### 🎯 Product Requirement:

Warga dapat melaporkan keluhan terhadap fasilitas umum.

### 📡 Endpoint (Minimal 8):

| Method | Endpoint                 | Description                     |
| ------ | ------------------------ | ------------------------------- |
| POST   | `/complaints`            | Kirim keluhan                   |
| GET    | `/complaints`            | List keluhan (filter by status) |
| GET    | `/complaints/{id}`       | Detail keluhan                  |
| PUT    | `/complaints/{id}`       | Ubah status keluhan             |
| DELETE | `/complaints/{id}`       | Hapus keluhan                   |
| GET    | `/complaints/statistics` | Statistik jumlah per status     |
| POST   | `/users`                 | Register user pelapor           |
| GET    | `/users/{id}/complaints` | List keluhan milik user         |

### 🧪 Validasi:

- `@NotBlank`, `@Size(min=20)` → message
- Enum: `status` (OPEN, IN_PROGRESS, RESOLVED)
- `@Pattern` → location format tertentu

---
