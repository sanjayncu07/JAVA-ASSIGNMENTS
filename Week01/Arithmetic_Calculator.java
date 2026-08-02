
import java.util.Scanner;


public class Arithmetic_Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no.:");
        int num1= sc.nextInt();
        System.out.println("Enter second no.:");
        int num2= sc.nextInt();

      System.out.println("sum:"+(num1+num2));
       System.out.println("Product:"+(num1*num2));
        System.out.println("Difference:"+(num1-num2));
         System.out.println("Remainder:"+(num1%num2));
          System.out.println("Quotient:"+(num1/num2));
    }
}
