package PartIII;

/**
 * @author David Manouchehri
 *         Created on 6/5/15 at 2:21 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Use algorithm from Part I, output should be formatted the same.
 */

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        /* All percentages in decimal */
        final double taxRate = 0.12;
        final double snowShare = 0.20;
        final double dwarfShare = 0.20;
        final double cinderellaShare = 0.10;
        final double rapunzelShare = 0.10;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter amount won: ");
        double winnings = userInput.nextDouble();

        double tax = winnings * taxRate;
        double postTax = winnings - tax;

        double snow = postTax * snowShare;
        double postSnow = postTax - snow;

        double dwarf = postSnow * dwarfShare;
        double postDwarf = postSnow - dwarf;

        double cinderella = postDwarf * cinderellaShare;
        double rapunzel = postDwarf * rapunzelShare;

        System.out.printf("Winner's Tax: %.1f\n", tax);
        System.out.printf("Snow White's Share: %.1f\n", snow);
        System.out.printf("Each Dwarf Share: %.1f\n", dwarf);
        System.out.printf("Cinderella's Share: %.1f\n", cinderella);
        System.out.printf("Rapunzel's Share: %.1f", rapunzel);
    }
}
