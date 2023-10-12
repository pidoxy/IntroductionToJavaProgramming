import java.util.Scanner;

public class Chapter2_7 {
//    Find the number of years
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

//        a year is 365 days, a day is 24 hrs, and hr is 60 minutes
//        a year is 365 * 24 * 60 minutes
        int yearInMinutes = 365 * 24 * 60;
        int years = minutes / yearInMinutes;
//        The remainder of what would be years is days in minutes
        int days = (minutes % yearInMinutes) / (24 * 60);

        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");

        input.close();
    }
}
