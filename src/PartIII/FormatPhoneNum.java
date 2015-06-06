package PartIII;

/**
 * @author David Manouchehri
 *         Created on 6/5/15 at 2:58 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 75, Question P2.23
 */

import java.util.Scanner;

public class FormatPhoneNum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String rawPhone = userInput.next();
        String areaCode = rawPhone.substring(0, 3);
        String subCode = rawPhone.substring(3, 6);
        String endNum = rawPhone.substring(6, 10);
        System.out.printf("(%s) %s-%s", areaCode, subCode, endNum);
    }
}
