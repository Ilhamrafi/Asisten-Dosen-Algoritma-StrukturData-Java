package pkg6_whileloop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        
        // Meminta input awal dan akhir dari pengguna
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();

        // Memeriksa kevalidan input dan menampilkan deret angka dari awal ke akhir
        if(akhir > awal){
            System.out.println("Salah Bro !"); // Menampilkan pesan kesalahan jika input tidak valid
        } else {
            int b = awal;
            while(b >= akhir){
                System.out.print(b + " ");
                b--;
            }
        }
        
        System.out.println(""); // Pindah baris setelah selesai mencetak deret angka
    }
}