package homework_week7_niks;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Programme17SortNumString {
    public static void main(String[] args) {
        Programme17SortNumString obj = new Programme17SortNumString();
        obj.sortNumString();
    }

    public void sortNumString() {
        Scanner scan = new Scanner(System.in);

        int[] numArray = new int[4];

        System.out.println("Enter first number :");
        numArray[0] = scan.nextInt();
        System.out.println("Enter second number :");
        numArray[1] = scan.nextInt();
        System.out.println("Enter third number :");
        numArray[2] = scan.nextInt();
        System.out.println("Enter fourth number ");
        numArray[3] = scan.nextInt();

        String[] stringArray = new String[4];

        System.out.println("Enter first name");
        stringArray[0] = scan.next();
        System.out.println("Enter second name");
        stringArray[1] = scan.next();
        System.out.println("Enter third name");
        stringArray[2] = scan.next();
        System.out.println("Enter fourth name");
        stringArray[3] = scan.next();

        Arrays.sort(numArray);
        Arrays.sort(stringArray);

        System.out.println("Sorted numbers  = " + Arrays.toString(numArray));
        System.out.println("Sorted string names = " + Arrays.toString(stringArray));
    }
}