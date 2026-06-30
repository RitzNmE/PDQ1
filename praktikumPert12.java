import java.util.Scanner;

public class praktikumPert12 {

    static void cetakGaris() {
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void tmpMhs(String nama, String nim, double ipk) {
        cetakGaris();
        System.out.println("DATA MAHASISWA");
        cetakGaris();
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        cetakGaris();
    }

    static void cetakTabel(int angka) {
        cetakGaris();
        System.out.println("  Tabel Perkalian " + angka);
        cetakGaris();
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
        cetakGaris();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = sc.nextDouble();
        System.out.println();

        tmpMhs(nama, nim, ipk);

        System.out.println();

        cetakTabel(3);

        sc.close();
    }
}