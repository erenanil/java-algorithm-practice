import java.util.Scanner;
/*
 *  Girilen sayının abundant (güçlü) sayı mı ya da Deficient (güçsüz) sayı
mı olduğunu bulan programın algoritma ve akış diyagramını çiziniz.
Güçlü (Abundant) Sayı; pozitif bölenlerinin toplamının o sayıdan büyük olma durumu.
Zayıf (Deficient) Sayı; pozitif bölenlerinin toplanının o sayıdan küçük olma durumu.
 */
public class YirmiIki {
    public static int tamBolenToplam(int sayi){
        int toplam = 0;
        for(int i = 1; i < sayi; i++){
            if(sayi % i == 0){
                toplam+=i;
            }
        }
        return toplam;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = scn.nextInt();

        int toplam = tamBolenToplam(sayi);

        if(toplam > sayi){
            System.out.println("Güçlü (Abundant) Sayıdır");
        }else if(toplam<sayi){
            System.out.println("Zayıf (Deficient) Sayıdır");
        }else{
            System.out.println("Mükemmel Sayıdır");
        }
    }
}
