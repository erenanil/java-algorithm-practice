import java.util.Scanner;

public class OnDokuz {
    public static void main(String[] args) {
        /*
         * Klavyeden girilen bir sayının negatif, pozitif veya 0 olup olmadığını
bulan programın algoritma ve akış diyagramını çiziniz
         */
        Scanner scn = new Scanner(System.in);

         System.out.println("Bir sayi giriniz:");
         int x = scn.nextInt();
         
         if (x<0) {
            System.out.println("Sayı negatif");
         }else if(x>0){
            System.out.println("Sayı pozitif.");
         }
         else{
            System.out.println("Sayi sifir");
         }
    }
}
