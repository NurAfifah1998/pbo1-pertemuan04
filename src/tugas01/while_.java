package tugas01;

public class while_ {
    public static void main(String[] args) {
        int isianBarang = 0;
        int lusin_1 = 12;
        int lusin_2 = 24;

        System.out.println("masukkan jumlah barang :"+isianBarang+"buah");
        System.out.println("hasil dalam 1 lusin :"+lusin_1+"buah");
        System.out.println("hasil dalam 2 lusin :"+lusin_2+"buah");

        while (isianBarang != lusin_1){
            isianBarang++;
            System.out.println("memasukkan jumlah barang...");
            System.out.println("Isi barang : " + isianBarang + "buah");

        }
        System.out.println("Akhir Isi baramng:"+ isianBarang + "buah dalam 1 lusin");



    }
}
