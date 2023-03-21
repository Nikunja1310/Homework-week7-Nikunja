package homework_week7_niks;

/**
 * 18. Write a Java program to sum values of an array.
 */

import java.util.Scanner;
public class Programme18SumArray {
    public static void main(String[] args) {

    Programme18SumArray obj = new Programme18SumArray();
    obj.sumArray();
    }
public void sumArray (){

        Scanner scan =new Scanner(System.in);

        int sum[] = new int[3];

    System.out.println("Input first number : ");
    sum[0] = scan.nextInt();
    System.out.println("Input second number ");
    sum[1] = scan.nextInt();
    System.out.println("Inout third number ");
    sum[2] = scan.nextInt();

    int total = 0 ;
    for ( int a = 0; a < sum.length; a++){
        total = total + sum[a];
    }

    System.out.println("Sum of the Arrays is = " + total);
}
}
