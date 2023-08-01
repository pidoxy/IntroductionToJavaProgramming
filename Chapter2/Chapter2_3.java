import java.util.Scanner;

public class Chapter2_3 {
//    Convert feet into meters
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = 0.305 * feet;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
