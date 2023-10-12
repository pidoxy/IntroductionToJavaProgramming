// (Conversion from kilograms to pounds) Write a program that displays the follow-
// ing table (note that 1 kilogram is 2.2 pounds):

// Kilograms Pounds
// 1 2.2
// 3 6.6
// ...
// 197 433.4
// 199 437.8

public class Chapter5_3{
    public static void main(String[] args) {
        int kilogram = 0;
        System.out.println("Kilograms \t Pounds");
        while (kilogram < 200) {
            double pounds = 2.2 * kilogram;
            System.out.printf(kilogram + " \t %.1f \n", pounds);
            kilogram += 1;
        }

    }
}
