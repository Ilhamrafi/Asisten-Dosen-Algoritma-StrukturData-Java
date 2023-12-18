package pkg10_quickshort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Variable
        int[] bilangan = {5, 12, 3, 19, 1, 47};

        // Tampilkan bilangan
        System.out.println("Bilangan sebelum di sorting Quick Sort : " + Arrays.toString(bilangan));

        // Panggil metode Quick Sort
        quickSort(bilangan, 0, bilangan.length - 1, 1);

        // Tampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting: " + Arrays.toString(bilangan));
    }

    // Metode untuk mengurutkan array menggunakan algoritma Quick Sort
    public static void quickSort(int arr[], int low, int high, int iteration) {
        // Jika bagian array masih memiliki lebih dari satu elemen
        if (low < high) {
            // Temukan indeks pivot untuk membagi array menjadi dua bagian
            int pi = partition(arr, low, high);

            // Tampilkan proses pengurutan pada setiap iterasi
            System.out.println("\nIterasi " + iteration);
            System.out.println(Arrays.toString(arr));

            // Urutkan bagian sebelah kiri dan kanan dari pivot secara terpisah
            quickSort(arr, low, pi - 1, iteration + 1);
            quickSort(arr, pi + 1, high, iteration + 1);
        }
    }

    // Metode untuk membagi array dan menemukan indeks pivot
    private static int partition(int arr[], int low, int high) {
        // Pilih elemen tengah sebagai pivot
        int pivotIndex = low + (high - low) / 2;
        int pivot = arr[pivotIndex];

        // Tukar elemen pivot dengan elemen terakhir agar pivot ada di posisi terakhir
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        // Inisialisasi indeks i dan j
        int i = low;
        int j = high - 1;

        // Iterasi melalui array untuk membandingkan elemen dengan pivot
        while (i <= j) {
            // Temukan elemen yang lebih besar dari pivot di sebelah kiri
            while (arr[i] < pivot) {
                i++;
            }

            // Temukan elemen yang lebih kecil dari pivot di sebelah kanan
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            // Jika elemen yang lebih besar ditemukan di sebelah kiri dan elemen yang lebih kecil di sebelah kanan
            if (i <= j) {
                // Tukar elemen arr[i] dengan arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Pindah ke elemen berikutnya di kiri dan kanan
                i++;
                j--;
            }
        }

        // Tukar elemen arr[i] dengan elemen pivot (kembali ke posisi awal)
        temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        // Kembalikan indeks pivot yang sudah terurut
        return i;
    }
}