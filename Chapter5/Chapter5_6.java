// (Conversion from miles to kilometers) Write a program that displays the follow-
// ing two tables side by side:

// Miles Kilometers | Kilometers Miles
// 1 1.609 | 20 12.430
// 2 3.218 | 25 15.538
// ...
// 9 14.481 | 60 37.290
// 10 16.090 | 65 40.398

public class Chapter5_6 {
    public static void main(String[] args){
        int milesOriginal = 1;
        int kilometerOriginal = 20;

        System.out.println("Kilograms \t Pounds \t | \t Pounds \t Kilograms \n");

        while (milesOriginal < 200) {
            double kilometerConverted = 1.609 * kilometerOriginal;
            double milesConverted = kilometerOriginal / 1.609;

            System.out.printf(milesOriginal + " \t %.1f \t | \t %d \t %.2f \n", kilometerConverted, kilometerOriginal,
                    milesConverted);

            milesOriginal += 1;
            kilometerOriginal += 5;
        }
    }
    
}
