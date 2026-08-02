import java.util.Scanner;

public class Digital_Extraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter  three digit number: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println("Hundredth place no.: " + hundreds);
        System.out.println("Tenth place no.: " + tens);
        System.out.println("Unit place no.: " + units);

}
}