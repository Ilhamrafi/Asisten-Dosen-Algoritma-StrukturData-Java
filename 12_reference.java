package pkg12_reference;

public class Main {
    // Metode untuk menampilkan informasi individu
    static void displayIndividualInfo(String[] names, int[] ages) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Nama: " + names[i] + ", Umur: " + ages[i]);
        }
    }
    
    // Metode untuk melakukan perubahan nilai umur individu pada posisi tertentu dalam array
    static void changeAge(int[] ages, int index, int newAge) {
        ages[index] = newAge;
    }
    public static void main(String[] args) {
        // Array untuk menyimpan informasi individu
        String[] names = {"Ilham", "Cahyo", "Aulia"};
        int[] ages = {25, 30, 22};

        // Menampilkan informasi awal individu
        System.out.println("Informasi Awal:");
        displayIndividualInfo(names, ages);

        // Melakukan perubahan nilai umur individu pada posisi tertentu dalam array
        int indexToChange = 1; // misalnya, mengubah umur individu pada posisi indeks 1 (Alice)
        changeAge(ages, indexToChange, 32);

        // Menampilkan informasi setelah perubahan nilai umur
        System.out.println("\nInformasi Setelah Perubahan Umur:");
        displayIndividualInfo(names, ages);
    }
}