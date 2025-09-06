package Basicsjva;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {

         Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:");
//         int a= num.nextInt();
        // odd or even number
//         if (a%2==0){
//             System.out.println("even");
//         }
//         else {
//             System.out.println("odd");
//         }

        // divisible by 5 or not
//        if (a%5==0){
//            System.out.println("divisible by 5");
//
//        }
//        else {
//            System.out.println("not divisible by 5");
//        }
        // leap year

//        if (a%100!=0 && a%4==0 || a%100==0 && a%400==0){
//            System.out.println("leap year");
//        }
//        else {
//            System.out.println("not leap year");
//        }

        // absolute number
//        if (a<0){
//            a= a*(-1);
//        }
//        System.out.println("The absolute number is " + a);

        // cp     and  sp
        int sp= num.nextInt();
        int cp= num.nextInt();

        if (cp<sp){
            System.out.println("Profit");
        }
        else {
            System.out.println("loss");
        }
    }
}
