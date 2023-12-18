package pkg4_switchcase;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan menu pilihan
        System.out.print("input (1/2/3) = ");
        int pilihan = input.nextInt();

        switch(pilihan) {
            case 1:
                // Menghitung luas persegi panjang
                System.out.print("Masukkan panjang = ");
                double panjang = input.nextDouble();
                
                System.out.print("Masukkan Lebar = ");
                double lebar = input.nextDouble();
                
                double luas = panjang * lebar;
                
                // Menampilkan hasil luas
                System.out.println("Luas Persegi Panjang = " + luas);
                break;
            case 2:
                // Menghitung luas segitiga
                System.out.print("Masukkan Alas = ");
                double alas = input.nextDouble();
                
                System.out.print("Masukkan Tinggi = ");
                double tinggi = input.nextDouble();
                
                double luasSegitiga = 0.5 * alas * tinggi;
                
                // Menampilkan hasil luas segitiga
                System.out.println("Luas Segitiga = " + luasSegitiga);
                break;
            case 3:
                // Menampilkan pesan default untuk pilihan 3
                System.out.println("No Gender");
                break;
            default:
                // Menampilkan pesan kesalahan jika pilihan tidak valid
                System.out.println("Pilihan Salah");
        } 
    }    
}