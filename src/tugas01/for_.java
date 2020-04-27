package tugas01;

public class for_ {
    public static void main(String[] args) {
        int isianBarang = 0;
        int lusin_1 = 12;
        int lusin_2 = 24;

        System.out.println("masukkan jumlah barang :"+isianBarang+"buah");
        System.out.println("hasil dalam 1 lusin :"+lusin_1+"buah");
        System.out.println("hasil dalam 2 lusin :"+lusin_2+"buah");

        for (isianBarang=0;isianBarang<=lusin_2;isianBarang++){
            isianBarang++;
            System.out.println("memasukkan jumlah barang...");
            System.out.println("Isi Barang : " + isianBarang + "Buah");

        }
        System.out.println("Finale: Isi Gelas sekarang :"+ isianBarang + "Buah dalam 2 lusin");


    }
}
