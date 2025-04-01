public class Kirk {
    public static void main(String[] args) {
        /*
         * 10 ile 200 arasındaki tam sayılardan 3 katının 2 fazlası 5 ile tam
bölünebilen sayıları gösteren programın algoritma ve akış
diyagramını çiziniz.
         */

         for(int i = 10; i<=200; i++){
            if((3*i+2)%5 == 0){
                System.out.println(i);
            }
         }
    }
}
