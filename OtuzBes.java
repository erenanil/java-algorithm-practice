public class OtuzBes {
    /*
     * 1 ile 500 arasındaki tam sayılardan tek sayıların toplamı ile çift
sayıların toplamının farkı negatif mi, pozitif mi olduğunu bulan
programın algoritma ve akış diyagramını çiziniz.
     * 
     */
    public static void main(String[] args) {
        int tekToplam = 0, ciftToplam = 0;
        
        for (int i = 1; i<=500; i++){
            if (i%2==0) {
                ciftToplam+=i;
            }else{
                tekToplam+=i;
            }
        }
        int fark = tekToplam - ciftToplam;

        if (fark > 0) {
            System.out.println("pozitif");
        } else if (fark < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("sıfır");
        }
    }
}
