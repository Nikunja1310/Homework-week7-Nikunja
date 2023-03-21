package homework_week7_niks;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme16PosNegZero {

    public static void main(String[] args) {

        Programme16PosNegZero obj = new Programme16PosNegZero();
        obj.posNegZero();
    }

    public void posNegZero() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = scan.nextInt();

        if(num<0){
            System.out.println(num + " is a negative number.");
        }else if (num>0){
            System.out.println(num + " is a positive number.");
        }else{
            System.out.println(num + " is a zero.");
        }
    }

}
