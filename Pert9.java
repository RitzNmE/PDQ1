public class Pert9 {

    public static boolean isGanjil(int bilangan) {
        return bilangan % 2 != 0;
    }

    public static int getNilaiMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Uji Fungsi isGanjil()");
        int[] dataUji = {7, 10, 0, -3, 15, 22};

        for (int angka : dataUji) {
            if (isGanjil(angka)) {
                System.out.println(angka + " adalah bilangan ganjil");
            } else {
                System.out.println(angka + " adalah bilangan genap");
            }
        }

        System.out.println("Uji Fungsi getNilaiMax()");
        int[] arr1 = {12, 45, 7, 89, 23};
        int[] arr2 = {-5, -20, -1, -8};
        int[] arr3 = {3, 3, 3};

        System.out.println("Nilai maksimum arr1: " + getNilaiMax(arr1));
        System.out.println("Nilai maksimum arr2: " + getNilaiMax(arr2));
        System.out.println("Nilai maksimum arr3: " + getNilaiMax(arr3));
    }
}