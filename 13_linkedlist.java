package pkg13_linkedlist;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> linkedlist = new LinkedList<>();
        
        // Menambahkan elemen ke linkedlist 
        linkedlist.add("Ani");
        linkedlist.add("Budi");
        linkedlist.add("Cahyo");
        
        // Menghapus elemen pertama dari linked list
        linkedlist.poll();
        
        // Menampilkan isi Linked List
        System.out.println("Linked List : " + linkedlist);       
        
        
        // ARRAY
        int[] array = {10, 20, 30, 40, 50};
        
        // Menampilan elemen secara acak (indeks 2)
        int element = array[2];
        
        System.out.println("Element at index 2 : " + element);
    }
    
}
