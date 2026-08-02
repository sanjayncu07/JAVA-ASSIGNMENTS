
import java.util.Scanner;
public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(("Enter temp. in Celsius:"));
        double celsius=sc.nextDouble();
        double fahrenheit =(celsius*9.0/5.0)+32;
        System.out.println("Temp="+fahrenheit);
        
    }
}
