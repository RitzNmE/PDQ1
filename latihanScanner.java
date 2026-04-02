//1. Import class
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
     //2. deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

    //3. Input (deklarasi Variabel)
    //value dlm variabel harus diberikan nilai default
    String namaBarang = "";
    int harga = 0, jumlahBeli = 0, total = 0;

    //text Input
    System.out.print("Nama Baranng : ");
    namaBarang = scanner.nextLine(); //nextLine utk String
    System.out.print("Harga : ");
    harga = scanner.nextInt(); //nextInt untuk Integer
    System.out.print("Jumlah Beli : ");
    jumlahBeli = scanner.nextInt();

    System.out.println();

    //4. Output
    total = harga * jumlahBeli;
    System.out.println("Total ; " + total);

    //5. Close Scanner
    scanner.close();
    
    }
}