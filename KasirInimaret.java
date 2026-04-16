import java.util.Scanner;

public class KasirInimaret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaBarang = new String[5];
        int[] qty = new int[5];
        double[] harga = new double[5];
        int jumlahItem = 0;

        System.out.println("KASIR INIMARE");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nBarang ke-" + (i + 1));
            System.out.print("Nama barang  : ");
            namaBarang[i] = sc.nextLine();

            System.out.print("Harga satuan : Rp ");
            harga[i] = sc.nextDouble();

            System.out.print("Jumlah (qty) : ");
            qty[i] = sc.nextInt();
            sc.nextLine();

            jumlahItem++;

            if (i < 4) {
                System.out.print("Tambah barang lagi? (y/n): ");
                String lanjut = sc.nextLine();
                if (lanjut.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        double total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            total += harga[i] * qty[i];
        }

        System.out.println("DATA PENJUALAN");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] +
                " | Qty: " + qty[i] +
                " | Subtotal: Rp " + (int)(harga[i] * qty[i]));
        }

        System.out.println("Total Belanja : Rp " + (int) total);

        System.out.print("Uang Bayar    : Rp ");
        double bayar = sc.nextDouble();
        System.out.println("Kembalian     : Rp " + (int)(bayar - total));

        sc.close();
    }
}