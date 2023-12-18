package pkg8_bahasresponsi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        double totalNilai = 0;
        
        // Menggunakan loop untuk menginput nilai mahasiswa dan menentukan grade
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            
            // Memeriksa validitas nilai dan menentukan grade
            if (nilai >= 0 && nilai <= 100) {
                if (nilai >= 81) {
                    System.out.println("Nilai Mahasiswa ke-" + i + ": A");
                } else if (nilai >= 61) {
                    System.out.println("Nilai Mahasiswa ke-" + i + ": B");
                } else if (nilai >= 41) {
                    System.out.println("Nilai Mahasiswa ke-" + i + ": C");
                } else if (nilai >= 21) {
                    System.out.println("Nilai Mahasiswa ke-" + i + ": D");
                } else {
                    System.out.println("Nilai Mahasiswa ke-" + i + ": E");
                }
                totalNilai += nilai; // Menambahkan nilai ke total
            } else {
                // Menampilkan pesan kesalahan jika nilai tidak valid
                System.out.println("Nilai tidak valid untuk mahasiswa ke-" + i + ". Mohon masukkan nilai antara 0 dan 100.");
                i--; // Mengurangi nilai i agar input ulang untuk mahasiswa yang sama
            }
        }
        
        // Menghitung rata-rata nilai dan menampilkannya
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai dari seluruh mahasiswa: " + rataRata);
    }   
}