import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Sistem Perhitungan Parkir ====");
        Scanner inputKendaraan = new Scanner(System.in);
        System.out.print("Masukkan jenis kendaraan (motor/mobil) \t\t: ");
        String jenisKendaraan = inputKendaraan.next().toLowerCase();

        // tarif jenis kendaraan
        int tarifAwal, tarifLanjut, tarifMaksimal;
        if (jenisKendaraan.equals("motor")) {
            tarifAwal = 2000;
            tarifLanjut = 1000;
            tarifMaksimal = 10000;
        } else if (jenisKendaraan.equals("mobil")) {
            tarifAwal = 5000;
            tarifLanjut = 2000;
            tarifMaksimal = 25000;
        } else {
            System.out.println("Jenis kendaraan tidak valid! Mohon masukkan motor/mobil!");
            return;
        }

        Scanner inputDurasi = new Scanner(System.in);
        System.out.print("Masukkan durasi parkir (dalam satuan jam) \t: ");
        int durasiParkir = inputDurasi.nextInt();


        // hitung total tarif
        int totalTarif;

        if (durasiParkir == 1) {
            totalTarif = tarifAwal;
        } else if (durasiParkir == 2) {
            totalTarif = tarifAwal * 2;
        } else {
            totalTarif = (tarifAwal * 2) + (durasiParkir - 2) * tarifLanjut;
        }

        // cek apakah tarif maksimal
        if (totalTarif > tarifMaksimal) {
            totalTarif = tarifMaksimal;
        }

        System.out.println("");
        System.out.println("==== Rincian Parkir ====");
        System.out.println("Jenis Kendaraan \t: " + jenisKendaraan);
        System.out.println("Durasi Parkir \t\t: " + durasiParkir + " Jam");
        System.out.println("Total Tarif Parkir \t: Rp." + String.format("%,d", totalTarif));

    }
}