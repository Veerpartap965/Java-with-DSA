package Basicsjva;
import java.util.Scanner;
public class if_else2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= sc.nextInt();
        // area , perimetr of rectangle
//         int l= sc.nextInt();
//         int b= sc.nextInt();
//         int a = l*b;
//        System.out.println("Area of reactrangle :"+a);
//        int p = 2*(l+b);
//        System.out.println("perimeter of reactrangle :"+p);

        // two digit number or not
//
//        if (n<1000 && n<100){
//            System.out.println("two digits numbetr");
//        }
//        else {
//            System.out.println("not two digit number");
//        }

        // divisible by  5 and 3
//        if (n%5==0 && n%3==0){
//            System.out.println("Number divisible by 3 and 5");
//        }
//        else {
//            System.out.println(" Number Not divisible by 3 and 5");
//        }
        // side of triangle
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if ((b+c)>a && (a+c)>b && (a+b)>c){
//            System.out.println("Valid triangle");
//        }
//        else {
//            System.out.println("Not Valid triangle");
//
//        }
        // positive number or not
//        if (n>0){
//            System.out.println("positive no");
//        }
//        else {
//            System.out.println("not positive no");
//        }
        // nested if else
//        if (n>0){
//            if (n%3==0) {
//                System.out.println("positive no");
//            }
//        }
//        else {
//            System.out.println("not positive no");
//        }

        // switch case
        switch (n){
            case 1:
            System.out.println("MOnday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thrusday");
            break;
            case 5:
            System.out.println("Fridday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
                System.out.println("Sunday");
                break;
        }
    }

}
