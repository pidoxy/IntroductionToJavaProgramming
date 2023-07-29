import java.util.Scanner;

public class Chapter1_13 {

    public static void main(String[] args) {
        // Get the coefficients of the system of equations
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of the first equation: ");
        double a = 3.14;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        System.out.println("Enter the constants of the first equation: ");
        double e = 44.5;
        double f = 5.9;

        // Calculate the determinant of the system
        double det = a * d - b * c;

        // Calculate the numerators of x and y
        double numX = e * d - b * f;
        double numY = a * f - e * c;

        // Calculate x and y
        double x = numX / det;
        double y = numY / det;

        // Print the values of x and y
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}