package pkg3_ifelse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta dan mengambil total belanja dari pengguna
        System.out.print("Total Belanja = Rp. ");
        double total = input.nextDouble();
        System.out.println("Total Belanja Anda: Rp. " + total);

        // Mengevaluasi kondisi untuk memberikan diskon
        if (total >= 250000) {
            // Memberikan diskon 15%
            System.out.print("Anda Mendapat Diskon 15%");
            double diskon = 15 * total / 100;
            System.out.print(" Yaitu : Rp. " + diskon);
            total -= diskon;
        } else if (total >= 100000) {
            // Memberikan diskon 10%
            System.out.print("Anda Mendapat Diskon 10%");
            double diskon = 10 * total / 100;
            System.out.println(" yaitu : Rp. " + diskon );
            total -= diskon;
        } else {
            // Tidak mendapatkan diskon
            System.out.println("Tidak Dapat Diskon");
        }

        // Menampilkan jumlah yang harus dibayar setelah diskon (atau tanpa diskon)
        System.out.println("Yang Harus Dibayar : Rp. " + total);
    }
}