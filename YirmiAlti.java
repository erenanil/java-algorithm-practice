import java.util.Scanner;

public class YirmiAlti {
    /*
     * 1'den 63'e kadar olan sayılar arasında istenilen sayıyı maksimum 6
seferde bulan programın algoritma ve akış diyagramını çiziniz.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ile 63 arasında bir sayı yazın bilgisayar bunu bulmaya çalışacak :");
        int tutulanSayi = scanner.nextInt();
        if(tutulanSayi<1 || tutulanSayi >63){
            System.out.println("Lütfen 1 ile 63 arasında bir sayi giriniz: ");
        }
        else{
            int alt = 1, üst = 63;
            int adimSayisi=0;
            
            while (alt <= üst && adimSayisi <= 6 ) {
                int orta = (alt + üst) / 2;
                adimSayisi++;

                if (orta == tutulanSayi) {
                    System.out.println("Tuttuğunuz sayı "+adimSayisi+". adımda bulundu."+" Tuttuğunuz sayı = "+ orta);
                    break;
                }else if (orta > tutulanSayi) {
                    System.out.println("Tahmin edilen sayı büyük. Yeni aralık: " + alt + " - " + (orta - 1));
                    üst = orta-1;
                }else{
                    System.out.println("Tahmin edilen sayı küçük. Yeni aralık: " + (orta + 1) + " - " + üst);
                    alt= orta + 1;
                }
            
            }
        }
    }
}
