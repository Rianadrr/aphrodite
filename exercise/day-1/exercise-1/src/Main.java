//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        1. **Cerita Kue Andi**
//        Andi punya 12 kue. Dia kasih 4 kue ke adiknya. Berapa kue yang tersisa?
//        Operator apa yang bisa dipakai untuk menghitungnya?

        int kueAndi = 12;
        int kueAdik = 4;
        System.out.println("Kue yang tersisa adalah " + (kueAndi - kueAdik));

//        2. **Cerita Ongkir Toko Online**
//        Sebuah toko online pasang ongkir Rp 25.000. Saat promo, ongkir dipotong setengah. Berapa ongkir yang harus dibayar?
//        Operator apa yang bisa dipakai untuk menghitungnya?

        int hargaOnkir = 25000;
        System.out.println("Harga ongkir menjadi : RP " + hargaOnkir / 2);

//        3. **Cerita Permen Sinta**
//        Sinta punya 20 permen dan mau dibagi rata ke 6 temannya. Berapa sisa permen yang tidak terbagi?
//        Operator apa yang bisa dipakai untuk menghitung sisa pembagian?

        int permenSinta = 20;
        System.out.println("Sisa permen yang tidak terbagi adalah " + (permenSinta % 6));

//        4. **Cerita Point Game**
//        Seorang pemain game punya 80 point. Setiap naik level, point bertambah 15. Setelah naik level sekali, berapa total point pemain itu?
//        Operator apa yang bisa dipakai untuk menambahkan point dengan cepat?

        int point = 80;
        int pointLevelUp = 15;
        point += pointLevelUp;
        System.out.println("Point pemain menjadi " + point + " Point");

//        5. **Cerita Tiket Bioskop**
//        Budi mau nonton film. Syaratnya, hanya boleh masuk kalau umur ≥ 18. Jika umur Budi 16, apakah dia bisa masuk?
//        Operator apa yang digunakan untuk membandingkan umur dengan syarat tersebut?

        int umur = 16;
        if (umur >= 18){
            System.out.println("Anda boleh masuk!");
        }else{
            System.out.println("Umur anda belum mencukupi!");
        }
    }
}