import java.util.Scanner;
/*
 * 4 haneli bir sayının birler, onlar, yüzler ve binler hanesini bulan
programın algoritma ve akış diyagramını çiziniz
 */
public class OtuzYedi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz: ");
        int sayi = scn.nextInt();

        if (sayi<1000 || sayi>9999) {
            System.out.println("Lütfen sadece 4 basamaklı bir sayı giriniz.");
            return;
        }

        int birler
        ,onlar
        ,yuzler
        ,binler;

        birler = sayi %10;
        onlar = (sayi/10) %10;
        yuzler = (sayi/100) %10;
        binler = (sayi/1000);


        System.out.println("Birler basamağındaki değer = " +birler);
        System.out.println("Onlar basamağındaki değer = " +onlar);
        System.out.println("Yüzler basamağındaki değer = " +yuzler);
        System.out.println("Binler basamağındaki değer = "+binler );




    }
}
