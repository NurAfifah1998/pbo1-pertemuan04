public class do_while {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh =225;


        System.out.println("Isi Gelas Sekearang : "+ isiGelas + "ml");
        System.out.println("Isi gelas Ketika Penuh :" + penuh +"ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi Gelas...");
            System.out.println("Isi Gelas sekarang : " + isiGelas + "ml");

        } while (isiGelas != penuh);
        System.out.println("Finale: Isi Gelas sekarang :"+ isiGelas + "ml");


    }
}
