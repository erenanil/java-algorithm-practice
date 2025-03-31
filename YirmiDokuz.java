import java.util.Scanner;

public class YirmiDokuz {
    /*
     * Verilen yılın artık yıl olup olmadığını bulan programın algoritma ve
akış diyagramını çiziniz.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int yil = scn.nextInt();

        if ((yil%4 == 0 && yil%100 != 0) || (yil%400 == 0)) {
            System.out.println(yil+" artık yıldir");
        }else{
            System.out.println(yil+" artık yil değildir.");
        }
    }
}
