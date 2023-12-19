package pkg11_pengenalanstack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Stack dengan tipe data String
        Stack<String> stk = new Stack<>();
        
        // Memeriksa apakah stack kosong
        boolean isEmpty = stk.empty();
        System.out.println("Apakah stack kosong : " + isEmpty);
        
        // Menambahkan elemen ke dalam stack
        stk.push("Apel");
        stk.push("Pisang");
        stk.push("Mangga");
        stk.push("Nangka");
        stk.push("Semangka");
        
        // Menampilkan elemen-elemen dalam stack
        System.out.println("Elemen dalam stack : " + stk);
        // System.out.println("Apakah stack kosong : " + isEmpty);
        
        // Mengambil dan menghapus elemen paling atas dari stack (pop)
        // stk.pop();
        // System.out.println("Elemen dalam stack setelah di pop : " + stk);
        
        // Menampilkan item paling atas dalam stack tanpa menghapusnya (peek)
        System.out.println("Item paling atas adalah : " + stk.peek());
        
        // Memeriksa apakah stack penuh
        boolean isFull = stk.size() == 5;
        System.out.println("Apakah stack full : " + isFull);
        
        // Menghapus semua elemen dari stack
        stk.clear();
        System.out.println("Elemen dalam stack setelah di-clear : " + stk);
    }
}