package PartIII;

/**
 * @author David Manouchehri
 *         Created on 6/5/15 at 2:58 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 76, Question P2.27
 */

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        final double maxDiscount = 75;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of movie rentals: ");
        int numOfRentals = userInput.nextInt();
        System.out.print("Enter the number of members referred to the video club: ");
        int numOfRefs = userInput.nextInt();
        double userDiscount = Math.min(maxDiscount, numOfRefs + numOfRentals);
        System.out.printf("The discount is equal to:     %.2f percent.", userDiscount);
    }
}
