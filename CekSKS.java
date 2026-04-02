import java.util.Scanner;

public class CekSKS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan IP Semester (IPS): ");
        double ips = input.nextDouble();

        
        if (ips > 4.0 || ips < 0.0) {
            System.out.println("Input tidak valid! IPS harus di antara 0.0 - 4.0");
        } else {
        
            int sksMaksimal = tentukanSKS(ips);
            String predikat = tentukanPredikat(sksMaksimal);
            
            System.out.println("HASIL EVALUASI AKADEMIK");
            System.out.println("IPS Anda          : " + ips);
            System.out.println("Predikat          : " + predikat);
            System.out.println("Beban SKS Maksimal: " + sksMaksimal + " SKS");
            
        }

        input.close();
    }

    public static int tentukanSKS(double ips) {
        if (ips >= 3.50) {
            return 24;
        } 
        if (ips >= 3.00) {
            return 22;
        } 
        if (ips >= 2.00) {
            return 20;
        } 
        return 18; 
    }

    public static String tentukanPredikat(int sksMaksimal) {
    //    int sksMaksimal = (int) ips;
       System.out.println(sksMaksimal);
       String predikat = "";
        
        switch (sksMaksimal) {
            case 24:
                predikat= "Sangat Memuaskan (Cum Laude)";
                break;
            case 22:
                predikat = "Memuaskan";
                break;
            case 20:
                predikat = "Cukup";
                break;
            case 18:
                predikat = "Kurang";
                break;
        }
        // System.out.println(predikat);
        return predikat;
    } 
}