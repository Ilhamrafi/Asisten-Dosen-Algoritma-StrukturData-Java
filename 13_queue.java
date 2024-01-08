package pkg13_queue;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Membuat objek Queue menggunakan implementasi LinkedList
        Queue<String> antrian = new LinkedList<>();
        
        // Menambahkan elemen ke dalam antrian
        antrian.add("Ani");
        antrian.add("Budi");
        antrian.add("Ilham");
        antrian.add("Aulia");
        
        System.out.println("Antrian : " + antrian);
        
        antrian.add("Cahyo");
        antrian.add("Adit");
        
        System.out.println("Antrian : " + antrian);
        
        antrian.poll();
        System.out.println("Antrian : " + antrian);
        
        antrian.remove();
        System.out.println("Antrian : " + antrian);
        
        System.out.println("Dipanggil Element: " + antrian.element());
        
        System.out.println("Jumlah Antrian : " + antrian.size());
       
    }
    
}
