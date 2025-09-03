import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Sistem Absensi Karyawan ====");
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan\t\t\t\t\t\t: ");
        String namaKaryawan = inputNama.next();

        Scanner inputJam = new Scanner(System.in);
        System.out.print("Masukkan jam (contoh 815 untuk jam 08:15)\t: ");
        int jamMasuk = inputJam.nextInt();

        Scanner inputGaji = new Scanner(System.in);
        System.out.print("Masukkan gaji karyawan\t\t\t\t\t\t: ");
        double gajiKaryawan = inputGaji.nextDouble();

        // cek kehadiran dan hitung potongan gaji
        String statusKehadiran;
        double potonganGaji, gajiSetelahPotongan;

        if (jamMasuk <= 800) {
            statusKehadiran = "Tepat Waktu";
            potonganGaji = 0.0;
            gajiSetelahPotongan = gajiKaryawan - potonganGaji;
        } else if (jamMasuk >= 801 && jamMasuk <= 815) {
            statusKehadiran = "Terlambat Ringan";
            potonganGaji = gajiKaryawan * 0.01;
            gajiSetelahPotongan = gajiKaryawan - potonganGaji;
        } else if (jamMasuk >= 816 && jamMasuk <= 830) {
            statusKehadiran = "Terlambat Sedang";
            potonganGaji = gajiKaryawan * 0.03;
            gajiSetelahPotongan = gajiKaryawan - potonganGaji;
        } else {
            statusKehadiran = "Terlambat Berat";
            potonganGaji = gajiKaryawan * 0.05;
            gajiSetelahPotongan = gajiKaryawan - potonganGaji;
        }

        System.out.println("");
        System.out.println("==== Rincian Absensi Karyawan ====");
        System.out.println("Nama Karyawan \t\t\t: " + namaKaryawan);
        System.out.println("Status Kehadiran \t\t: " + statusKehadiran);
        System.out.println("Gaji Sebelum Potongan \t: Rp." + gajiKaryawan);
        System.out.println("Potongan Gaji \t\t\t: Rp." + potonganGaji);
        System.out.println("Gaji yang Diterima \t\t: Rp." + gajiSetelahPotongan);
    }
}