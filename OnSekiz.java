public class OnSekiz {
    public static void main(String[] args) {
        /*
         * Fibonacci serisinin ilk 10 terimini ekrana basan algoritma ve akış
diyagramını çiziniz.
         */
        // 0 1 1 2 3 5 8 13 21 34 ...

        int ilk =0, ikinci = 1;
        int siradaki;
        
        System.out.print(ilk + " " +ikinci + " ");
       for(int i=0; i<10; i++){
        siradaki = ilk + ikinci;

        System.out.print(siradaki + " ");
        ilk = ikinci;
        ikinci = siradaki;
       }

    }
}
