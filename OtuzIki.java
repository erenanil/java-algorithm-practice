import java.util.Scanner;

public class OtuzIki {
    /*
     * Kenarları A,B,C,D olan bir dörtgenin kare olup olmadığını bulan
programın algoritma ve akış diyagramını çiziniz.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("A kenarının değerini giriniz: ");
        int a = scn.nextInt();
        
        System.out.print("B kenarının değerini giriniz: ");
        int b = scn.nextInt();
        
        System.out.print("C kenarının değerini giriniz: ");
        int c = scn.nextInt();
        
        System.out.print("D kenarının değerini giriniz: ");
        int d = scn.nextInt();

        if (a+c == b+d) {
            System.out.println("Kare'dir.");
        }else{
            System.out.println("Kare değildir.");
        }
    }
}