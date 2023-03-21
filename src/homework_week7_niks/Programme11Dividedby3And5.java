package homework_week7_niks;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme11Dividedby3And5 {
    public static void main(String[] args) {

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
        }
    }
}