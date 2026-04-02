import java.util.Scanner;
public class LatihanPercabangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     
     //Daftar member (nama, alamat, no hp)
        String namaMember = "", alamatMember = "", noHpmember = "" ;
        String jawab = scanner.nextLine();
     //Transaksi belanja
        String namaBarang="";
        double harga = 0.0, jumlah = 0.0, diskon = 0.0, grandtotal = 0.0, total = 0.0;

     //Cek jawwaban user, jwabannya Y atau T menggunakan IF
     //equals = case sesitive (perhatikan kaapital/tidaknya)
     //equalsIgnoreCase = cases non sensitive
        if (jawab.equalsIgnoreCase("y")) { //cek string = equals/equalsIgnoreCase
        // Contoh "Jawab = Y/y"
        //jawab Y
        System.out.print("Nama anda : ");
        namaMember = scanner.nextLine();
        System.out.print("Alamat anda : ");
        alamatMember = scanner.nextLine();
        System.out.print("No Hp anda : ");
        noHpmember = scanner.nextLine();

        System.out.println("Ingin berlanjut berbelanja? (Y/T)");
        jawab = scanner.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
             System.out.print("Nama Baranng : ");
            namaBarang = scanner.nextLine(); //nextLine utk String
            System.out.print("Harga : ");
            harga = scanner.nextInt(); //nextInt untuk Integer
            System.out.print("Jumlah Beli : ");
            jumlah = scanner.nextInt();
            
            System.out.println();

            total = harga * jumlah;
            System.out.println("Total : " + total);
            //hitung total
                if (total > 100000.0) {
                diskon = total * 0.05 * 0.02;
                } else if (total > 300000.0) {
                diskon = total * 0.1 * 0.2;
                 }
             grandtotal = total - diskon;

             System.out.println("\n NOTA PEMBAYARAN");
             System.out.println("Nama Barang  : " + namaBarang);
             System.out.println("Total Awal   : Rp " + total);
             System.out.println("Diskon       : Rp " + diskon);
             System.out.println("Grand Total  : Rp " + grandtotal);
            
             }
        } else {
        //jawab T
        System.out.println("Selamat Belanja");
     }
        scanner.close();
     }
}
