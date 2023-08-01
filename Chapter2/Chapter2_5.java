import java.util.Scanner;
public class Chapter2_5 {
//    Financial application: calculate tips
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity (%) rate: ");

        double subtotal = input.nextDouble();
        double gratuityInp = input.nextDouble();

        double gratuity = gratuityInp * subtotal / 100.0;

        double total = subtotal + gratuity ;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);


    }
}
