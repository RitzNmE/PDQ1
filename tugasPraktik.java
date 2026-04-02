import java.util.Scanner;

public class tugasPraktik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Hitung IP Semester");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();

        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("Mata Kuliah ke-" + i);
            System.out.print("Masukkan jumlah SKS: ");
            int sks = input.nextInt();
            
            System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
            char nilaiHuruf = input.next().toUpperCase().charAt(0);

            double bobot = 0;

            // Penggunaan Switch Case untuk menentukan bobot nilai
            switch (nilaiHuruf) {
                case 'A':
                    bobot = 4.0;
                    break;
                case 'B':
                    bobot = 3.0;
                    break;
                case 'C':
                    bobot = 2.0;
                    break;
                case 'D':
                    bobot = 1.0;
                    break;
                case 'E':
                    bobot = 0.0;
                    break;
                default:
                    System.out.println("Nilai tidak valid! Dianggap 0.");
                    bobot = 0;
                    break;
            }

            totalBobotSKS += (bobot * sks);
            totalSKS += sks;
        }

        double ips = (totalSKS == 0) ? 0 : totalBobotSKS / totalSKS;

        int sksMaksimal;
        if (ips >= 3.50) {
            sksMaksimal = 24;
        } else if (ips >= 3.00) {
            sksMaksimal = 22;
        } else if (ips >= 2.00) {
            sksMaksimal = 20;
        } else {
            sksMaksimal = 18;
        }

        System.out.println("Hasil Perhitungan");
        System.out.printf("IP Semester (IPS) Anda: %.2f", ips);
        System.out.println("Beban Belajar Maksimal: " + sksMaksimal + " SKS");
        
        input.close();
    }
}