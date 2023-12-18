package pkg6_tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        int awal = scanner.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        int akhir = scanner.nextInt();

        System.out.println("Bilangan ganjil antara " + awal + " dan " + akhir + " adalah:");

        // Memastikan awal adalah bilangan ganjil
        if (awal % 2 == 0) {
            awal++; // Jika awal genap, maka tambahkan 1 agar menjadi ganjil
        }

        // Menggunakan perulangan while untuk mencetak bilangan ganjil
        int i = awal;
        while (i <= akhir) {
            System.out.print(i + " ");
            i += 2;
        }
        
        System.out.println("");

    }
}