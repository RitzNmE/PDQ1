//Nomer 1
// import java.util.Scanner;
//  public class pert5Praktikum {
//      public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);

//          System.out.print("Masukkan jumlah bintang: ");
//          int n = scanner.nextInt();

//          for (int i = 0; i < n; i++) {
//              for (int j = 0; j < n; j++) {
//                  System.out.print("*");
//              }
//              System.out.println();
//          }

//          scanner.close();
//      }
//  }   

//Nomer 2
// import java.util.Scanner;
// public class pert5Praktikum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan jumlah bintang: ");
//         int n = scanner.nextInt();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }

// //Nomer 4
// import java.util.Scanner;
// public class pert5Praktikum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan jumlah bintang: ");
//         int n = scanner.nextInt();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }

// //Percobaan 2 & 3
// import java.util.Scanner;   
// public class pert5Praktikum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan jumlah bintang: ");
//         int n = scanner.nextInt();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = n - 2; i >= 0; i--) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }

// //nomer 3
import java.util.Scanner;
public class pert5Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}