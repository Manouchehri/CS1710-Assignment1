package PartIII;

/**
 * @author David Manouchehri
 *         Created on 6/5/15 at 2:58 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 72, Question P2.8
 */

import java.util.Scanner;

public class ComputeDim {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] side = new double[2];
        System.out.print("Enter the first side: ");
        side[0] = userInput.nextDouble();
        System.out.print("Enter the second side: ");
        side[1] = userInput.nextDouble();
        double area = side[0] * side[1];
        double perimeter = 2 * (side[0] * side[1]);
        double diagonal = Math.sqrt(Math.pow(side[0], 2) + Math.pow(side[1], 2));
        System.out.printf("The rectangle has an area of %.3f, a perimeter of %.3f and a diagonal of %.3f.", area, perimeter, diagonal);
    }
}
