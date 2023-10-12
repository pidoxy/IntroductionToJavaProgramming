// (Conversion from kilograms to pounds and pounds to kilograms) Write a program
// that displays the following two tables side by side:
// Kilograms Pounds | Pounds Kilograms
// 1 2.2 | 20 9.09
// 3 6.6 | 25 11.36
// ...
// 197 433.4 | 510 231.82
// 199 437.8 | 515 234.09

public class Chapter5_5 {
    public static void main(String[] args) {
        int kilogramOriginal = 1;
        int poundsOriginal = 20;

        System.out.println("Kilograms \t Pounds \t | \t Pounds \t Kilograms \n");

        while (kilogramOriginal < 200) {
            double poundConverted = 2.2 * kilogramOriginal;
            double kilogramConverted = poundsOriginal / 2.2;

            System.out.printf(kilogramOriginal + " \t %.1f \t | \t %d \t %.2f \n", poundConverted, poundsOriginal,
                    kilogramConverted);

            kilogramOriginal += 2;
            poundsOriginal += 5;
        }

    }
}
