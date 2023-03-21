package homework_week7_niks;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8AlphaAtoZ {
    public static void main(String[] args) {

        Programme8AlphaAtoZ obj = new Programme8AlphaAtoZ();
        obj.cityName();
    }

    public void cityName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to Z : ");
        String alpha = scan.nextLine();

        if (alpha.equals("A")) {
            System.out.println("Adelaide");
        } else if (alpha.equals("B")) {
            System.out.println("Brisbane");
        } else if (alpha.equals("C")) {
            System.out.println("Canberra");
        } else if (alpha.equals("D")) {
            System.out.println("Darwin");
        } else if (alpha.equals("E")) {
            System.out.println("Elk Grove");
        } else if (alpha.equals("F")) {
            System.out.println("Florida");
        } else {
            System.out.println("Invalid Entry");
        }
        scan.close();
    }
}