public class ArrayPerhitungan {
    public static void main(String[] args) {
        // Array untuk angka bulat (int)
        int[] angka = {10, 20, 30, 40, 50};

        // Array untuk angka desimal (double)
        double[] hasilPerhitungan = new double[angka.length];

        // Faktor perkalian
        double faktor = 2.5;

        // Perulangan untuk menghitung hasil perkalian
        for (int i = 0; i < angka.length; i++) {
            hasilPerhitungan[i] = angka[i] * faktor;
            System.out.printf("Hasil dari %d x %.1f = %.2f\n", angka[i], faktor, hasilPerhitungan[i]);
        }
    }
}
