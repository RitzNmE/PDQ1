import java.util.Scanner;

public class latihanPercabanganrevisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaMember = "", alamatMember = "", noHpmember = "";
        
        // Perbaikan 1: Tambahkan instruksi sebelum input
        System.out.print("Apakah anda member? (Y/T): ");
        String jawab = scanner.nextLine();

        String namaBarang = "";
        double harga = 0.0, jumlah = 0.0, diskon = 0.0, grandtotal = 0.0, total = 0.0;

        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Nama anda : ");
            namaMember = scanner.nextLine();
            System.out.print("Alamat anda : ");
            alamatMember = scanner.nextLine();
            System.out.print("No Hp anda : ");
            noHpmember = scanner.nextLine();

            System.out.print("Ingin berlanjut berbelanja? (Y/T): ");
            jawab = scanner.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                System.out.print("Nama Barang : ");
                namaBarang = scanner.nextLine();
                
                System.out.print("Harga : ");
                harga = scanner.nextDouble(); // Pakai double
                
                System.out.print("Jumlah Beli : ");
                jumlah = scanner.nextDouble();

                total = harga * jumlah;
                
                // Perbaikan 2: Cek angka terbesar dulu agar diskon tidak tertukar
                if (total > 300000.0) {
                    diskon = total * 0.1; // Diskon 10%
                } else if (total > 100000.0) {
                    diskon = total * 0.05; // Diskon 5%
                }
                
                grandtotal = total - diskon;

                System.out.println("\nNOTA PEMBAYARAN");
                System.out.println("Nama Barang  : " + namaBarang);
                System.out.println("Total Awal   : Rp " + total);
                System.out.println("Diskon       : Rp " + diskon);
                System.out.println("Grand Total  : Rp " + grandtotal);
            }
        } else {
            System.out.println("Selamat Belanja, Silahkan masuk!");
        }
        
        scanner.close();
    }
}