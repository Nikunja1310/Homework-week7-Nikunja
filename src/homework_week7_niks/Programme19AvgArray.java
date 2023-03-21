package homework_week7_niks;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
import java.util.Scanner;
public class Programme19AvgArray {
    public static void main(String[] args) {

        Programme19AvgArray obj = new Programme19AvgArray();
        obj.containsValue();
    }

    public void containsValue() {
        Scanner scan = new Scanner(System.in);
      int sum = 0;
        System.out.println("Enter size of the array :");
        int n = scan.nextInt();

        int a[] = new int [n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n ; i++){

            a[i] = scan.nextInt();
            sum = sum + a[i];
        }

        float avg = sum/n;
        System.out.println("Average of Array is : " + avg);
        scan.close();
    }
    }