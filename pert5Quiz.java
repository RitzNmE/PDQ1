import java.util.Scanner;

public class pert5Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int menu = 0, total = 0, harga = 0, status = 0;
        String namaBarang = "", jumlah = "";

        do {
            System.out.println("1. Entry Data");
            System.out.println("2. Print Data");
            System.out.println("3. Exit");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entry Data");
                    while (true) {
                        System.out.print("nama Barang   : ");
                        namaBarang = sc.next();
                        System.out.print("Jumlah Barang : ");
                        jumlah = sc.next();
                        System.out.print("Harga         : Rp ");
                        harga = sc.nextInt();
                        total += harga;
                        status++;

                        System.out.print("Tambah data lagi? (y/n) : ");
                        String lanjut = sc.next();
                        if (lanjut.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                        System.out.println("=== PRINT DATA ===");
                        System.out.println("Nama Barang : " + namaBarang);
                        System.out.println("Jumlah      : " + jumlah);
                        System.out.println("Harga       : Rp " + harga);
                        System.out.println("Total       : Rp " + total);
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (menu != 3); {

        }
        sc.close();
    }

}
