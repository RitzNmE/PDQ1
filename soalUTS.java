// import java.util.Scanner;
// public class soalUTS {
//     public static void main(String[] args) {
//     static Scanner sc = new Scanner(System.in);

//     int jumlahPeserta;
//     do {
//         System.out.println("Masukkan jumlah peserta (Minimal 5 orang): ");
//         jumlahPeserta = sc.nextInt();
//         if (jumlahPeserta < 5) {
//             System.out.println("Jumlah peserta minimal 5 orang. Silakan coba lagi.");
//         }
//     } while (jumlahPeserta < 5);

//     System.out.println("Masukkan nilai minimum kelulusan: ");
//     int nilaiMinimum = sc.nextInt();
//     scanneer.nextLine();

//     String[] namaPeserta = new String[jumlahPeserta];
//     int[] nilaiUjian = new int[jumlahPeserta];
//     String[] status = new String[jumlahPeserta];

//     System.out.println("Input Data Peserta");
//     for (int i = 0; i < jumlahPeserta; i++) {
//         System.out.print("Nama Peserta Ke- "+(i+1)+": ");
//         namaPeserta[i] = sc.nextLine();
//         System.out.print("Nilai Ujian "+ namaPeserta[i]+": ");
//         nilaiUjian[i] = sc.nextInt();
//         scanner.nextLine();
//     }

//     int jumlahLulus = 0;
//     int jumlahTidakLulus = 0;

//     for (int i = 0; i < jumlahPeserta; i++) {
//         if (nilaiUjian[i] >= nilaiMinimum) {
//             status[i] = "Lulus";
//             jumlahLulus++;
//         } else {
//             status[i] = "Tidak Lulus";
//             jumlahTidakLulus++;
//         }
    

//         System.out.println("         HASIL UJIAN PELATIHAN          ");
//         System.out.printf("Nilai Minimum Kelulusan : ", nilaiMinimum);

//         for (int i = 0; i < jumlahPeserta; i++) {
//             System.out.printf("%d %s %d %s%n", (i + 1), namaPeserta[i], nilaiUjian[i], status[i]);
//         }

//         System.out.println("Jumlah Peserta : " + jumlahPeserta);
//         System.out.println("Jumlah Lulus   : " + jumlahLulus);
//         System.out.println("Jumlah Gagal   : " + jumlahTidakLulus);
//     }
// }



// import java.util.Scanner;

// public class soalUTS {
//     static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {

//         int jumlahPeserta = 0;
//         do {
//             System.out.print("Masukkan jumlah peserta (Minimal 5 orang): ");
//             jumlahPeserta = sc.nextInt();
//             if (jumlahPeserta < 5) {
//                 System.out.println("Jumlah peserta minimal 5 orang. Silakan coba lagi.");
//             }
//         } while (jumlahPeserta < 5);

//         System.out.print("Masukkan nilai minimum kelulusan: ");
//         int nilaiMinimum = sc.nextInt();
//         sc.nextLine();

//         String[] namaPeserta = new String[jumlahPeserta];
//         int[]    nilaiUjian  = new int[jumlahPeserta];
//         String[] status      = new String[jumlahPeserta];

//         System.out.println("\nInput Data Peserta");
//         for (int i = 0; i < jumlahPeserta; i++) {
//             System.out.print("Nama Peserta Ke-" + (i + 1) + ": ");
//             namaPeserta[i] = sc.nextLine();
//             System.out.print("Nilai Ujian " + namaPeserta[i] + ": ");
//             nilaiUjian[i] = sc.nextInt();
//             sc.nextLine(); 
//         }

//         int jumlahLulus      = 0;
//         int jumlahTidakLulus = 0;

//         for (int i = 0; i < jumlahPeserta; i++) {
//             if (nilaiUjian[i] >= nilaiMinimum) {
//                 status[i] = "Lulus";
//                 jumlahLulus++;
//             } else {
//                 status[i] = "Tidak Lulus";
//                 jumlahTidakLulus++;
//             }
//         } 

//         System.out.println("HASIL UJIAN PELATIHAN");
//         System.out.printf("Nilai Minimum Kelulusan : %d%n", nilaiMinimum);
//         System.out.printf("%-5s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");

//         for (int i = 0; i < jumlahPeserta; i++) {
//             System.out.printf("%-5d %-20s %-8d %-12s%n",
//                 (i + 1), namaPeserta[i], nilaiUjian[i], status[i]);
//         }

//         System.out.println("Jumlah Peserta     : " + jumlahPeserta);
//         System.out.println("Jumlah Lulus       : " + jumlahLulus);
//         System.out.println("Jumlah Tidak Lulus : " + jumlahTidakLulus);

//         sc.close();
//     }
// }

import java.util.Scanner;

public class soalUTS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int jumlahPeserta = 0;
        do {
            System.out.println("Masukkan jumlah peserta (Minimal 5 orang): ");
            jumlahPeserta = sc.nextInt();
            if (jumlahPeserta < 5) {
                System.out.println("Jumlah peserta minimal 5 orang. Silakan coba lagi.");
            }
        } while (jumlahPeserta < 5);

        System.out.println("Masukkan nilai minimum kelulusan: ");
        int nilaiMinimum = sc.nextInt();
        sc.nextLine();

        String[] namaPeserta = new String[jumlahPeserta];
        int[] nilaiUjian = new int[jumlahPeserta];
        String[] status = new String[jumlahPeserta];

        System.out.println("Input Data Peserta");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Nama Peserta Ke- " + (i + 1) + ": ");
            namaPeserta[i] = sc.nextLine();
            System.out.print("Nilai Ujian " + namaPeserta[i] + ": ");
            nilaiUjian[i] = sc.nextInt();
            sc.nextLine();
        }

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahPeserta; i++) {
            if (nilaiUjian[i] >= nilaiMinimum) {
                status[i] = "Lulus";
                jumlahLulus++;
            } else {
                status[i] = "Tidak Lulus";
                jumlahTidakLulus++;
            }
        }

        System.out.println("HASIL UJIAN PELATIHAN");
        System.out.println("Nilai Minimum Kelulusan : " + nilaiMinimum);

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println((i + 1) + " " + namaPeserta[i] + " " + nilaiUjian[i] + " " + status[i]);
        }

        System.out.println("Jumlah Peserta : " + jumlahPeserta);
        System.out.println("Jumlah Lulus   : " + jumlahLulus);
        System.out.println("Jumlah Gagal   : " + jumlahTidakLulus);

        sc.close();
    }
}