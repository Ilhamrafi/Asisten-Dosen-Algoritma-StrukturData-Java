package pkg3_input;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();

        // Meminta pengguna untuk memasukkan lebar.
        System.out.print("Masukkan Nama: ");
        // Membaca nilai lebar yang dimasukkan oleh pengguna.
        String nama = input.next();

        // Meminta pengguna untuk memasukkan lebar.
        System.out.print("Masukkan Jurusan: ");
        // Membaca nilai lebar yang dimasukkan oleh pengguna.
        String jurusan = input.next();

        // Meminta pengguna untuk memasukkan lebar.
        System.out.print("Masukkan kelas: ");
        // Membaca nilai lebar yang dimasukkan oleh pengguna.
        char kelas = input.next().charAt(0);

        System.out.println("=============================================");

        System.out.println("NIM saya adalah: " + NIM);
        System.out.println("Nama saya adalah: " + nama);
        System.out.println("Jurusan saya : " + jurusan);
        System.out.println("Kelas saya adalah: " + kelas);
    }
}
