import java.util.Scanner;
/*
 * . Girilen a ve b sayısı 50'den büyük olduğunda c=a+b işlemini yapan
değilse bu sayılar uygun değil yazdıran programın algoritma ve akış
diyagramını çiziniz.
 */
public class YirmiBes {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("A sayısını giriniz: ");
        int a = scn.nextInt();
        System.out.println("B sayısını giriniz: ");
        int b = scn.nextInt();

        int c = a+b;

        if(a > 50 && b > 50){
            System.out.println("C sayısı = " + c);
        }
        else{
            System.out.println("Bu sayılar uygun değil.");
        }
    }
}
