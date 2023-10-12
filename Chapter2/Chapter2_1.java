import java.util.Scanner;

public class Chapter2_1 {
    public static void main(String[] args){
//        (Convert Celsius to Fahrenheit)
        // Creating a Scanner
         Scanner input = new Scanner(System.in);

//          Enter a celsius degree
        System.out.print("Enter a degree in Celsius: ");
         double celsius = input.nextDouble();
//         convert celsius to fahrenheit
         double fahrenheit = (9 / 5.0) * celsius + 32;
         System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

         input.close();
    }
}
