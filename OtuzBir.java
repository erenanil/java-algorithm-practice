import java.util.Scanner;

public class OtuzBir {
    /*
     * Dairenin alanını ve çevresini bulan programın algoritma ve akış
diyagramını çiziniz.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Dairenin çapını giriniz: ");
        double cap = scn.nextDouble();
        double yariCap = cap/2;

        double alan = (yariCap*yariCap)*Math.PI;
        System.out.println("Dairenin alanı = "+ alan);

        double cevre = (2*Math.PI)*yariCap;
        System.out.println("Dairenin çevresi = "+ cevre);
    }
}
