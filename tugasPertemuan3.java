import java.util.Scanner;

public class tugasPertemuan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Penghitung IPS Mahasiswa");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = input.nextInt();

        double totalPoin = 0;
        int totalSKS = 0;

        for (int i = 1; i <= jmlMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Masukkan bobot nilai (0.0 - 4.0): ");
            double bobot = input.nextDouble();
            System.out.print("Masukkan jumlah SKS: ");
            int sks = input.nextInt();

            totalPoin += (bobot * sks);
            totalSKS += sks;
        }

        double ips = (totalSKS > 0) ? totalPoin / totalSKS : 0;
        int bebanMaksimal;

        if (ips >= 3.50) {
            bebanMaksimal = 24;
        } else if (ips >= 3.00) {
            bebanMaksimal = 22;
        } else if (ips >= 2.00) {
            bebanMaksimal = 20;
        } else {
            bebanMaksimal = 18;
        }
        System.out.println("\n--------------------------------------");
        System.out.printf("Total SKS yang diambil : %d\n", totalSKS);
        System.out.printf("IP Semester (IPS)      : %.2f\n", ips);
        System.out.println("Beban Belajar Maksimal : " + bebanMaksimal + " SKS");
        System.out.println("--------------------------------------");

        input.close();
    }
}
