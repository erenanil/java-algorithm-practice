import java.util.Random;
import java.util.Scanner;

public class OtuzDokuz {
    public static void main(String[] args) {
        /*
         * Sayı bulmaca oyunu programının algoritma ve akış diyagramı çiziniz.
Kural: 10 sefer hakkınız var
Kullanıcının tahminine göre tahmini yükselt yada tahmini azalt diyerek yönlendirme
yapacak.
Bulduğu sefer sayısını ekrana basacak veya üzgünüz bir daha ki sefere diyecek.
         */
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        int rastgeleSayi = rnd.nextInt(10)+1;

        int tahmin;

        for (int i = 1; i <= 10; i++){
            System.out.print("Tahmin giriniz: ");
            tahmin = scn.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler doğru bildiniz!");
                return;
            }else if(tahmin>rastgeleSayi){
                System.out.println("Tahmini azalt.");
            }else if(tahmin<rastgeleSayi){
                System.out.println("Tahmini artır.");
            }
        }
        System.out.println("Tahmin sınırını aştınız lütfen tekrar deneyiniz..");
    }
}
