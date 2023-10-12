import java.util.Scanner;

public class Chapter2_2 {
//    Compute the volume of a cylinder
    public static void main(String[] args){
        final double PI = 3.14159; // Declare a constant
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area + "\n" + "The volume is " + volume);
        input.close();

    }
}
