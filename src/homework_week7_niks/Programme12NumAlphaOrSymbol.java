package homework_week7_niks;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol
 */
import java.util.Scanner;
public class Programme12NumAlphaOrSymbol {
    public static void main(String[] args) {

        Programme12NumAlphaOrSymbol object = new Programme12NumAlphaOrSymbol();
        object.numAlphaSymbol();
    }
    public void numAlphaSymbol (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any value :");
        char a = scan.nextLine().charAt(0);

        if (Character.isDigit(a)){
            System.out.println("Input is a number.");
        }else if(Character.isAlphabetic(a)){
            System.out.println("Input is a Alphabet");
        }else{
            System.out.println("Input is Symbol");
        }

    }
}
