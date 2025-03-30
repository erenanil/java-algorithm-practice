import java.util.Scanner;
/*
 * Klavyeden girilen 20 adet sayıdan çift sayıların toplamının tek
sayıların toplamına oranını bulan programın algoritma ve akış
diyagramını çiziniz.
 */
class OnIki {
   static int tekToplam =0;
   static int ciftToplam = 0;

    public static void tekCiftToplam(int sayi){

        if (sayi % 2 == 0){
            ciftToplam += sayi;
        }
        else{
            tekToplam += sayi;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 20 ; i++){
            int adet = 20 - i;

            System.out.println(adet+" adet sayı giriniz:");
            int sayi = scn.nextInt();
            tekCiftToplam(sayi);          

        }

        if (ciftToplam == 0) {
            System.out.println("Hiç çift sayı girilmedi, oran hesaplanamaz.");
        } else {
            double oran = (double) ciftToplam / tekToplam;

            System.out.println("Çift sayıların toplamının, tek sayıların toplamına oranı: " + oran);
        }
        
        
    
    }
}