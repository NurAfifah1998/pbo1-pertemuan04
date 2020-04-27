package tugas01;

public class do_while_ {
    public static void main(String[] args) {
        int isianBarang = 0;
        int lusin_1 = 12;
        int lusin_2 = 24;

        System.out.println("masukkan jumlah barang :"+isianBarang+"buah");
        System.out.println("hasil dalam 1 lusin :"+lusin_1+"buah");
        System.out.println("hasil dalam 2 lusin :"+lusin_2+"buah");

        do {
            isianBarang++;
            System.out.println("memasukkan jumlah barang...");
            System.out.println("Isi barang : " + isianBarang+ "buah");

        } while (isianBarang != lusin_2);
        System.out.println("Finale: Isibarang:"+ isianBarang + "buah dalam 2 lusin");
    }
}
