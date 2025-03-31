import java.util.Scanner;
import java.util.Stack;

public class YirmiSekiz {
    /*
     * Binary olarak girilen sayıyı decimal sayıya çeviren programın
algoritma ve akış diyagramını çiziniz.
    1100 12 
    Kullanıcıdan bir binary sayı al.

Sağdan başlayarak her basamağı 2'nin kuvvetiyle çarp ve topla.

Decimal sonucu ekrana yazdır.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Binary sayı giriniz:");
        int binary = scn.nextInt();

        int decimal = 0, base =1;
        while (binary>0) {
           int sonBasamak = binary % 10;
           decimal += sonBasamak*base;
           binary /= 10;
           base *= 2;
        }
        System.out.println(decimal);
    }
}
