package homework_week7_niks;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;
public class Programme6OddOrEven {
    public static void main(String[] args) {

        Programme6OddOrEven obj = new Programme6OddOrEven();
        obj.evenOrOdd();
    }

    public void evenOrOdd (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number");
        int num = scan.nextInt();

        String result = num%2==0 ? "even" : "Odd";
        System.out.println(num +" is "+ result + " number.");
        scan.close();
    }
}
