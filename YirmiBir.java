public class YirmiBir {
    /*
     * 1-100 arasındaki çift sayıların toplamının mükemmel sayı olup olmadığını bulan programın algoritma ve akış diyagramını çiziniz.
     */
    public static void main(String[] args) {
        int toplamCift = 0;
        for(int i = 1; i<=100; i++){
            if(i%2 == 0){
                toplamCift+=i;
            }
        }
        System.out.println("1-100 olan sayıların toplamı = " + toplamCift);

        int toplam = 0;
        for(int i = 1; i < toplamCift;  i++){
            if(toplamCift % i == 0){
                toplam+=i;
            }
        }

        System.out.println(toplamCift+"'ü tam bölenlerin toplamı = "+toplam);

        if (toplam == toplamCift) {
            System.out.println("Mükemmel sayidir.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
