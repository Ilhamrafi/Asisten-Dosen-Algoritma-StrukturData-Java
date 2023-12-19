package pkg11_studiKasusStack;

import java.util.Stack;

public class Main {
    
    private static final int MAX_CAPACITY = 5;

    public static void main(String[] args) {
        // Membuat objek Stack dengan tipe data String untuk merepresentasikan rak buku
        Stack<String> bookRack = new Stack<>();
        
        // Menampilkan buku-buku dalam rak (awalnya kosong)
        displayBooks(bookRack);
        
        // Menambahkan beberapa buku ke dalam rak
        addBook(bookRack, "Belajar Fundamental Java");
        addBook(bookRack, "Belajar Fundamental Python");
        addBook(bookRack, "Belajar Fundamental C++");
        
        // Menampilkan buku-buku dalam rak setelah penambahan
        displayBooks(bookRack);
        
        // Menghapus buku dari rak dan menampilkannya
        removeBook(bookRack);
        // Menampilkan buku-buku dalam rak setelah penghapusan
        displayBooks(bookRack);
        
        // Beberapa contoh penghapusan buku tambahan (dapat diaktifkan jika diinginkan)
        // removeBook(bookRack);
        // removeBook(bookRack);
        // removeBook(bookRack);
    }
    
    // Fungsi untuk menambahkan buku ke dalam rak
    private static void addBook(Stack<String> bookRack, String bookTitle){
        if (isFull(bookRack)) {
            System.out.println("Rak buku penuh. Tidak bisa menambahkan buku : " +bookTitle);
        } else {
            System.out.println("Menambahkan buku : " + bookTitle);
            bookRack.push(bookTitle);
        }
    }
    
    // Fungsi untuk menghapus buku dari rak
    private static void removeBook(Stack<String> bookRack){
        if (!bookRack.isEmpty()){
            String removedBook = bookRack.pop();
            System.out.println("Menghapus buku : " + removedBook);
        } else {
            System.out.println("Rak buku kosong.");
        }
    }
    
    // Fungsi untuk menampilkan buku-buku dalam rak
    private static void displayBooks(Stack<String> bookRack){
        if (!bookRack.isEmpty()){
            System.out.println("Buku-buku di-rak : " + bookRack);
        } else {
            System.out.println("Rak buku kosong.");
        }
    }
    
    // Fungsi untuk memeriksa apakah rak buku penuh
    private static boolean isFull(Stack<String> bookRack){
        return bookRack.size() >= MAX_CAPACITY;
    }
    
}