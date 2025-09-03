import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Sistem Peminjaman Buku ====");
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Masukkan nama anggota \t\t\t\t\t\t\t: ");
        String  namaAnggota = inputNama.next();

        Scanner inputJenis = new Scanner(System.in);
        System.out.print("Masukkan jenis anggota (mahasiswa/dosen/umum)\t: ");
        String jenisAnggota = inputJenis.next();

        Scanner inputDurasi = new Scanner(System.in);
        System.out.print("Masukkan hari peminjaman yang sudah berlalu\t\t: ");
        int  hariPeminjaman = inputDurasi.nextInt();

        int batasMaksimal, totalDenda;
        String statusPeminjaman;

        switch (jenisAnggota) {
            case "mahasiswa":
                batasMaksimal = 14;
                if (hariPeminjaman <= batasMaksimal){
                    statusPeminjaman = "Tepat Waktu";
                    totalDenda=0;
                } else if (hariPeminjaman - batasMaksimal <= 30) {
                    statusPeminjaman = "Terlambat";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 1000;
                } else {
                    statusPeminjaman = "Suspensi";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 1000;
                }
                break;
            case "dosen":
                batasMaksimal = 21;
                if (hariPeminjaman <= batasMaksimal){
                    statusPeminjaman = "Tepat Waktu";
                    totalDenda=0;
                } else if (hariPeminjaman - batasMaksimal <= 30) {
                    statusPeminjaman = "Terlambat";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 2000;
                } else {
                    statusPeminjaman = "Suspensi";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 2000;
                }
                break;
            case "umum":
                batasMaksimal = 7;
                if (hariPeminjaman <= batasMaksimal){
                    statusPeminjaman = "Tepat Waktu";
                    totalDenda=0;
                } else if (hariPeminjaman - batasMaksimal <= 30) {
                    statusPeminjaman = "Terlambat";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 500;
                } else {
                    statusPeminjaman = "Suspensi";
                    totalDenda = (hariPeminjaman - batasMaksimal) * 500;
                }
                break;
            default:
                System.out.println("Jenis anggota tidak valid!");
                return;
        }

        System.out.println("");
        System.out.println("==== Rincian Peminjaman ====");
        System.out.println("Nama Anggota \t\t: " + namaAnggota);
        System.out.println("Status Peminjaman \t: " + statusPeminjaman);
        if (totalDenda != 0){
            System.out.println("Total Denda \t\t: Rp." + String.format("%,d", totalDenda));
        } else {
            System.out.println("Total Denda \t\t: Tidak Ada Denda");
        }
    }
}