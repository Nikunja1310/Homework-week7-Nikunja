package homework_week7_niks;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
import java.util.Scanner;
public class Programme1OddOrEven {
    public static void main(String[] args) {

        Programme1OddOrEven object = new Programme1OddOrEven();
        object.oddOrEven();
    }
    public void oddOrEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any number.");
        int a  = scan.nextInt();


        String result = a%2==0 ? "even" : "Odd";
        System.out.println(a + " is " + result);
        scan.close();
    }

}
