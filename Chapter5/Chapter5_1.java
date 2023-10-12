// (Count positive and negative numbers and compute the average of numbers) Write
// a program that reads an unspecified number of integers, determines how many
// positive and negative values have been read, and computes the total and average of
// the input values (not counting zeros). Your program ends with the input 0. Display
// the average as a floating-point number. Here is a sample run:

import java.util.Scanner;

public class Chapter5_1{
    public static void main(String[] args){
        // set sentinel values
        // count numbers below zero - negative
        // count numbers above zero - positive
        // find the average

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;

        if (number == 0){
            System.out.println("No numbers are entered except 0");
            input.close();
            return;
        }


        while (number != 0){
            total += number;
            if (number > 0){
                positiveCount++;
            }
            else{
                negativeCount++;
            }
            number = input.nextInt();
        }
        double average = total * 1.0 / (positiveCount + negativeCount);

        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        input.close();
        



    }
}