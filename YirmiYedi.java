import java.util.Scanner;
import java.util.Stack;

public class YirmiYedi {
    public static void main(String[] args) {
        /*
         * Girilen decimal (onluk) bir sayının binary (ikilik) bir sayıya dönüştüren
programın algoritma ve akış diyagramını çiziniz.

        2 ye böl kalanı al ters çevir 
        13 ÷ 2 = 6, kalan 1

        6 ÷ 2 = 3, kalan 0

        3 ÷ 2 = 1, kalan 1

        1 ÷ 2 = 0, kalan 1
         */
        
         
        Scanner scn = new Scanner(System.in);

        System.out.print("Binary sisteme çevirmek istediğiniz sayıyı giriniz:");
        int sayi = scn.nextInt();

        Stack<Integer> stack = new Stack<>();
        
        while (sayi > 0) {
            stack.push(sayi % 2);
            sayi /= 2;
        }
        
        
        System.out.println("Binary karşılığı");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        





    }
}
