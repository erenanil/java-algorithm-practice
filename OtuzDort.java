import java.util.Scanner;

public class OtuzDort {
    /*
     * Girilen dört basamaklı sayılardan ilk iki basamağı ile son iki
basamağının toplamının karesi, sayının kendine eşit olan sayılara
orijinal sayı denir. Girilen sayının orijinal olup olmadığını bulan
programın algoritma ve akış diyagramını çiziniz.

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen 4 basamaklı bir sayı giriniz: ");
        int sayi = scn.nextInt();
        if(sayi<1000 || sayi>9999){
            System.out.println("Lütfen 4 basamaklı sayı giriniz!");
            return;
        }
            
            int ilkIkiBasamak = sayi / 100;
            int sonIkiBasamak = sayi % 100;
            
            int toplam = ilkIkiBasamak + sonIkiBasamak;
            int orjinalSayi= toplam*toplam;
            
            if(orjinalSayi == sayi){
                System.out.println(sayi+" orjinal sayıdır.");
            }else{
                System.out.println(sayi+" orjinal sayı değildir.");
            }
    }
}
