package homework_week7_niks;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
import java.util.Scanner;
public class Programme10Symbol {
    public static void main(String[] args) {
        Programme10Symbol symbol = new Programme10Symbol();
        symbol.symbolToNumber();
    }
    public void symbolToNumber (){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any two number  : " );
        int num1 = scan.nextInt();
        int num2 =scan.nextInt();
        System.out.println("Enter any symbol +, - ,* / , * : ");
        String s = scan.next();

        if(s.equals("+")){
            System.out.println("Addition of two number is " + (num1+num2));
        }else if(s.equals("-")){
            System.out.println("Subtraction of two number is " + (num1-num2));
        }else if(s.equals("*")){
            System.out.println("Multiplication of two number is " + (num1*num2));
        }else if(s.equals("/")){
            System.out.println("Division of two number is "+ (num1/num2));
        }else{
            System.out.println("Invalid Symbol");
        }
        scan.close();

    }
}
