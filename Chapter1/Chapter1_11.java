import java.util.Scanner;


public class Chapter1_11 {
    public static void main(String[] args) {
//         One birth every 7 seconds
//         One death every 13 seconds
//         One new immigrant every 45 seconds
        // current population
        long currentPopulation = 312032486;

        // Calculate the population for each of the next five years
        for (int year = 1; year <= 5; year++) {
            long secondsPerYear = (365 * 24 * 60 * 60);
            long babies = secondsPerYear / 7;
            long deaths = secondsPerYear / 13;
            long immigrants =  secondsPerYear / 45;
            long addedPopulation = babies + immigrants + deaths;
            long population = currentPopulation + (addedPopulation * year);
            System.out.println("Year " + year + " population is : " + population);
        }
    }
}