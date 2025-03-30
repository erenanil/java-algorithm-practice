import java.util.Scanner;
/*
 * Klavyeden girilen 25 adet sayı içerisinden negatif olanların toplamını,
çift sayıların çarpımını, 7'ye eşit olanların adetini bulup ekrana
yazdıran programın algoritma ve akış diyagramını çiziniz.
 */
public class OnDort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int negatifToplam=0;
        int ciftCarpim = 1;
        int kacYedi= 0 ;

        for(int i = 0; i<25 ;i++){
            System.out.println((25-i)+" tane sayı giriniz:");
            int sayi= scn.nextInt();

            if(sayi < 0){
             negatifToplam += sayi;
            }
            if (sayi%2==0) {
                ciftCarpim *= sayi;
            }
            if(sayi == 7){
                kacYedi++;
            }
            
        }
        System.out.println(negatifToplam);
        System.out.println(ciftCarpim);
        System.out.println(kacYedi);
    }
}
