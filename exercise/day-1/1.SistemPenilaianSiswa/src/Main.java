import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Sistem Penilaian Siswa ====");
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Masukkan nama siswa \t: ");
        String namaSiswa = inputNama.next();

        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Masukkan nilai siswa \t: ");
        int nilaiSiswa = inputNilai.nextInt();

        char gradeSiswa;
        if (nilaiSiswa >= 90 && nilaiSiswa <= 100) {
            gradeSiswa = 'A';
        } else if (nilaiSiswa >= 80 && nilaiSiswa < 90) {
            gradeSiswa = 'B';
        } else if (nilaiSiswa >= 70 && nilaiSiswa < 80) {
            gradeSiswa = 'C';
        } else if (nilaiSiswa >= 60 && nilaiSiswa < 70) {
            gradeSiswa = 'D';
        } else {
            gradeSiswa = 'E';
        }

        System.out.println("");
        System.out.println("==== Penilaian ====");
        System.out.println("Nama Siswa \t\t: " + namaSiswa);
        System.out.println("Nilai Siswa \t: " + nilaiSiswa);
        System.out.println("Grade Siswa \t: " + gradeSiswa);
    }
}