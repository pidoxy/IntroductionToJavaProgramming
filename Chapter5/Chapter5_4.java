// (Conversion from miles to kilometers) Write a program that displays the follow-
// ing table (note that 1 mile is 1.609 kilometers):

// Miles Kilometers
// 1 1.609
// 2 3.218
// ...
// 9 14.481
// 10 16.090


public class Chapter5_4 {
    public static void main(String[] args){
        int miles = 0;
        System.out.println("Miles \t Kilograms");
        while (miles < 10) {
            double Kilometers = 1.609 * miles;
            System.out.printf(miles + " \t %.3f \n", Kilometers);
            miles += 1;
        }
    }
}
