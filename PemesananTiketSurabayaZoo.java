import java.util.Scanner;

public class PemesananTiketSurabayaZoo {
    static Scanner sc = new Scanner(System.in);

    static String[] kategori = new String[10];
    static double[] harga    = new double[10];
    static int[]    jumlah   = new int[10];
    static int jumlahKategori = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("  Pemesanan Tiket SurabayaZoo");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: inputKategoriDanHarga();
                    break;
                case 2:  inputJumlahBeli();
                    break;
                case 3:  lihatTotalBayar();
                    break;
                case 4:  System.out.println("Terima kasih! Program selesai.");
                    break;
                default:  System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);
    }

    static void inputKategoriDanHarga() {
        System.out.print("Masukkan jumlah kategori tiket: ");
        jumlahKategori = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlahKategori; i++) {
            System.out.print("Kategori tiket ke-" + (i + 1) + ": ");
            kategori[i] = sc.nextLine();
            System.out.print("Harga tiket " + kategori[i] + ": Rp ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
            jumlah[i] = 0; 
        }

        System.out.println("Data kategori dan harga berhasil disimpan!");
    }

    static void inputJumlahBeli() {
        if (jumlahKategori == 0) {
            System.out.println("Data kategori belum diinput! Silakan pilih menu 1 terlebih dahulu.");
            return;
        }

        System.out.println("Daftar Kategori Tiket");
        for (int i = 0; i < jumlahKategori; i++) {
            System.out.printf("Rp ", (i + 1), kategori[i], harga[i]);
        }

        for (int i = 0; i < jumlahKategori; i++) {
            System.out.print("Jumlah tiket " + kategori[i] + " yang dibeli: ");
            jumlah[i] = sc.nextInt();
        }

        System.out.println("Jumlah tiket berhasil disimpan!");
    }

    static void lihatTotalBayar() {
        if (jumlahKategori == 0) {
            System.out.println("Data kategori belum diinput! Silakan pilih menu 1 terlebih dahulu.");
            return;
        }

        double totalBayar = 0;

        System.out.println("STRUK PEMBELIAN TIKET");
        System.out.println("SurabayaZoo");
        System.out.printf( "Kategori", "Jumlah", "Harga", "Subtotal");

        for (int i = 0; i < jumlahKategori; i++) {
            double subtotal = harga[i] * jumlah[i];
            totalBayar += subtotal;
            System.out.printf("Rp ",
                    kategori[i], jumlah[i], harga[i], subtotal);
        }

        System.out.printf("TOTAL BAYAR         : Rp %.0f%n", totalBayar);

    }
}
