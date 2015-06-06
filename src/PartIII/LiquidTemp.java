package PartIII;

/**
 * @author David Manouchehri
 *         Created on 6/5/15 at 2:59 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 76, Question P2.30
 */

import java.util.Scanner;

public class LiquidTemp {
    public static void main(String[] args) {
        final int resistance_0 = 1075; /* in ohms. */
        final int temp_0 = 75; /* in °C. */
        final int beta = 3969; /* in K. No clue if it's really called beta or not. */

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the thermistor resistance (R) in ohms: ");
        double resistance_f = userInput.nextDouble();

        /* No idea if this is the correct math or not. */
        double temp_f = ((beta * temp_0)/(temp_0 * Math.log(resistance_f / resistance_0) + beta)) - CtoK(0);

        System.out.printf("The final liquid temperature is %.2f °C.", temp_f);
    }

    /* I thought there was going to be more unit conversions than just one.  */
    public static double CtoK(double C) {
        double K = C + 273.15;
        return K;
    }
}
