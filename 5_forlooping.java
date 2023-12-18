package pkg5_forlooping;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        
        // Meminta input dari pengguna untuk rentang bilangan prima
        System.out.println("BILANGAN PRIMA");
        System.out.print("Awal  : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
        
        // Memeriksa validitas input dan menampilkan bilangan prima dalam rentang yang ditentukan
        if (awal <= akhir && awal >= 2) {
            System.out.print("Bilangan prima antara " + awal + " dan " + akhir + " adalah: ");
            for(int i = awal; i <= akhir; i++){
                if (cekPrima(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Pindah baris setelah selesai mencetak bilangan prima
        } else {
            System.out.println("Input tidak valid. Pastikan awal <= akhir dan awal >= 2.");
        }
    }
    
    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    public static boolean cekPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}