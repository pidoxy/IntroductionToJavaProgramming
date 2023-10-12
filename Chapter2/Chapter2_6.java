import java.util.Scanner;
public class Chapter2_6 {
//    Sum the digits in an integer
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

//        use % 10 to get the unit value and keep repeating until number is in unit form

        int sumOfDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sumOfDigits);

        input.close();
    }
}
