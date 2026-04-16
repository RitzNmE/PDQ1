import java.util.Scanner;

public class KasirInimaret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahItem = 0;
        double total = 0;

        System.out.println("KASIR INIMARE");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nBarang ke-" + (i + 1));

            System.out.print("Nama barang  : ");
            String nama = sc.nextLine();

            System.out.print("Harga satuan : Rp ");
            double harga = sc.nextDouble();

            System.out.print("Jumlah (qty) : ");
            int qty = sc.nextInt();
            sc.nextLine();

            double subtotal = harga * qty;
            total += subtotal;
            jumlahItem++;

            System.out.println("Subtotal     : Rp " + (int) subtotal);

            if (i < 4) {
                System.out.print("Tambah barang lagi? (y/n): ");
                String lanjut = sc.nextLine();
                if (lanjut.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        System.out.println("\nRINGKASAN");
        System.out.println("Jumlah item   : " + jumlahItem + " barang");
        System.out.println("Total Belanja : Rp " + (int) total);

        System.out.print("Uang Bayar    : Rp ");
        double bayar = sc.nextDouble();

        if (bayar < total) {
            System.out.println("Uang tidak cukup!");
        } else {
            System.out.println("Kembalian     : Rp " + (int)(bayar - total));
        }

        sc.close();
    }
}