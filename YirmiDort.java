public class YirmiDort {
    /*
     * 1'den 500'e kadar olan tamsayıların toplamını bulan programın
algoritma ve akış diyagramını çiziniz.
     */
    public static void main(String[] args) {
        int toplam = 0;
        for(int i = 1; i<=500; i++){
            toplam+=i;
        }
        System.out.println("1'den 500'e kadar olan tam sayıların toplamı = "+toplam);
    }
}
