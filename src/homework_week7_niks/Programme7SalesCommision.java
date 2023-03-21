package homework_week7_niks;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;
public class Programme7SalesCommision {
    public static void main(String[] args) {

        Programme7SalesCommision objectCom = new Programme7SalesCommision();
        objectCom.salesCommision();
    }

    public void salesCommision (){
        Scanner scan =new Scanner (System.in);
        System.out.println("Input Sales Id : ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.println("Input Seller's name : ");
        String name = scan.nextLine();

        System.out.println("Input Sales amount : ");
        int sales = scan.nextInt();

        System.out.println("Input Salary Basic : ");
        int salary = scan.nextInt();

        if(sales>=50000){
            System.out.println("Commission is 35% :"+ (sales*35/100));
        } else if (sales>=30000) {
            System.out.println("Commission is 20% :"+ (sales*20/100));
        } else if (sales>=20000) {
            System.out.println("Commission is 10% :"+ (sales*10/100));
        } else if (sales>=10000) {
            System.out.println("Commission is 5% :"+ (sales*5/100));
        }else{
            System.out.println("Commission is 2% :"+ (sales*2/100));
        }
        scan.close();
    }
}
