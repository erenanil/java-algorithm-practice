import java.util.Scanner;

public class OtuzSekiz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int pozitifSayac = 0, negatifSayac = 0, sifirSayac = 0;
        for (int i = 0; i<50;i++){
            System.out.print((50-i) +" adet sayı giriniz:");
            
            int sayi = scn.nextInt();

            if (sayi<0) {
                negatifSayac++;
            }else if (sayi>0) {
                pozitifSayac++;
            }else{
                sifirSayac++;
            }
        }
        System.out.println("Negatif sayı adedi = " + negatifSayac);
        System.out.println("Pozitif sayı adedi = " + pozitifSayac);
        
    }
}
