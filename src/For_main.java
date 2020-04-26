public class For_main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh =225;


        System.out.println("Isi Gelas Sekearang : "+ isiGelas + "ml");
        System.out.println("Isi gelas Ketika Penuh :" + penuh +"ml");

        for (isiGelas=0;isiGelas<=penuh;isiGelas++){
            isiGelas++;
            System.out.println("Sedang mengisi Gelas...");
            System.out.println("Isi Gelas sekarang : " + isiGelas + "ml");

        }
        System.out.println("Finale: Isi Gelas sekarang :"+ isiGelas + "ml");


    }
}
