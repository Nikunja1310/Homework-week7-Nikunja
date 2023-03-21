package homework_week7_niks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme20ArraySpecificVal { public static void main(String[] args) {

    Programme18SumArray obj = new Programme18SumArray();
    obj.sumArray();
}
    public void sumArray (){

        Scanner scan =new Scanner(System.in);

        int avg[] = new int[3];

        System.out.println("Input first number : ");
        avg[0] = scan.nextInt();
        System.out.println("Input second number ");
        avg[1] = scan.nextInt();
        System.out.println("Input third number ");
        avg[2] = scan.nextInt();

       int sum = 0;
       for ( int a = 0; a<avg.length; a++){
              sum= sum+avg[a];
       }
       float average = (float) sum/ avg.length;

        System.out.println("Sum of the Arrays is = " + Arrays.toString(avg));


    }
}
