package homework_week7_niks;

/**
 *
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
import java.util.Scanner;
public class Programme2LeapYear {
    public static void main(String[] args) {
        Programme2LeapYear object = new Programme2LeapYear();
        object.leapYearOrNot();
    }
    public void leapYearOrNot () {                                                  // A year is a leap year if it is divisible by 4 and not divisible by 100
        Scanner scan = new Scanner (System.in);                                             // unless it is also divisble by 400 i:e or
        System.out.println("Input any year to find out if it is a leap year or not?");
        int year = scan.nextInt();
        scan.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }

    }
}
