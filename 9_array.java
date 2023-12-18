package pkg9_array;

public class Main {

    public static void main(String[] args) {
        // Mendefinisikan array dua dimensi
        int[][] a = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18}
        };

        // Iterasi melalui setiap baris dan kolom array untuk menampilkan elemennya
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                // Menampilkan elemen array pada baris dan kolom tertentu
                System.out.print(a[row][col] + " ");
            }
            // Pindah baris setelah menampilkan elemen dalam satu baris
            System.out.println();
        }
    }
}