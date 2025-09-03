import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        System.out.println("==== Sistem Diskon Belanja Online ====");
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli\t\t\t\t\t\t\t\t: ");
        String  namaPembeli = inputNama.next();

        Scanner inputTotal = new Scanner(System.in);
        System.out.print("Masukkan total belanja\t\t\t\t\t\t\t\t: ");
        double totalBelanja = inputTotal.nextDouble();

        Scanner inputStatus = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli regular/premium/non-member)\t: ");
        String  statusMember = inputStatus.next();

        int persentaseDiskon;
        double nominalDiskon, totalSetelahDiskon;

        switch (statusMember) {
            case "regular":
                if (totalBelanja >= 500000) {
                    persentaseDiskon = 10;
                    nominalDiskon = totalBelanja * 0.1;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                } else if (totalBelanja >= 100000) {
                    persentaseDiskon = 5;
                    nominalDiskon = totalBelanja * 0.05;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                } else {
                    persentaseDiskon = 0;
                    nominalDiskon = 0;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                }
                break;

            case "premium":
                if (totalBelanja >= 500000) {
                    persentaseDiskon = 20;
                    nominalDiskon = totalBelanja * 0.2;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                } else if (totalBelanja >= 300000) {
                    persentaseDiskon = 15;
                    nominalDiskon = totalBelanja * 0.15;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                } else if (totalBelanja >= 100000) {
                    persentaseDiskon = 10;
                    nominalDiskon = totalBelanja * 0.1;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                } else {
                    persentaseDiskon = 0;
                    nominalDiskon = 0;
                    totalSetelahDiskon = totalBelanja - nominalDiskon;
                }
                break;

            case "non-member":
                persentaseDiskon = 0;
                nominalDiskon = 0;
                totalSetelahDiskon = totalBelanja - nominalDiskon;
                break;

            default:
                System.out.println("Status membership tidak valid!");
                return;
        }

        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("");
        System.out.println("==== Rincian Pembayaran ====");
        System.out.println("Nama Pembeli \t\t: " + namaPembeli);
        System.out.println("Status Membership \t: " + statusMember);
        System.out.println("Total Belanja \t\t: Rp." + rupiahFormat.format(totalBelanja));
        System.out.println("Persentase Diskon \t: " + persentaseDiskon + "%");
        System.out.println("Nominal Diskon \t\t: Rp." + rupiahFormat.format(nominalDiskon));
        System.out.println("Total Bayar \t\t: Rp." + rupiahFormat.format(totalSetelahDiskon));
    }
}