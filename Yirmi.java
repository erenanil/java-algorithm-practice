import java.util.Scanner;

public class Yirmi {
    /*
     * Girilen sayının mükemmel sayı olup olmadığını bulan programın
algoritma ve akış diyagramını çiziniz.
    (Kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse)
     */
    public static void mukemmelSayi ( int sayi ){

        int toplam = 0;
        
        for (int i = 1; i < sayi; i++){
                if(sayi % i == 0){
                    toplam +=i;
                }
        }
        if (toplam == sayi) {
            System.out.println("Mükemmel sayidir.");
        }
        else{
            System.out.println("Mükemmel sayi değildir.");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scn.nextInt();

        mukemmelSayi(sayi); 

    }
}
