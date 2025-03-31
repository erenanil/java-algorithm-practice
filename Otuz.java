import java.util.Scanner;

public class Otuz {
    public static void main(String[] args) {
        /*
         * Boyu ile kilosu girilen kişinin şişman mı, zayıf mı yoksa ideal kiloda mı
olduğunu gösteren programın algoritma ve akış diyagramını çiziniz.
         */

         Scanner scn = new Scanner(System.in);

         System.out.println("Boyunuzu giriniz:");
         int boy = scn.nextInt();

         System.out.println("Kilonuzu giriniz:");
         int kilo = scn.nextInt();

         boy %= 100;
         if (boy - kilo <= 11) {
            System.out.println("Kilo vermelisin.");
         }else if (boy - kilo>= 11) {
            System.out.println("Kilo almalısın.");
         }else{
            System.out.println("İdeal kilodasınız.");
         }
         System.out.println(boy-kilo);
    }
}
