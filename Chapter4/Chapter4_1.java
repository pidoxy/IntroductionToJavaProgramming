import java.util.Scanner;

public class Chapter4_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center of the pentagon to a vertex: ");
        double length = input.nextDouble();

        double area = ((5.0 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 5)));
        System.out.println("The area of the pentagon is " + area);

        input.close();
    }
}