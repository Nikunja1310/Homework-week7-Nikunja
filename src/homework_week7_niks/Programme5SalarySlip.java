package homework_week7_niks;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

import java.util.Scanner;
public class Programme5SalarySlip {
    public static void main(String[] args) {

        Programme5SalarySlip salaryslipobj = new Programme5SalarySlip();
        salaryslipobj.calculationOfSalarySlip();

    }

    public void calculationOfSalarySlip(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Employee ID : ");
        int id = scan.nextInt();
        System.out.println("Enter Employee name : ");
        String name = scan.next();
        System.out.println("Enter Basic Salary :");
        int sal = scan.nextInt();

        int hra = 10%sal;
        int da = 8%sal;
        int ta = 9%sal;
        int pf = 20%sal;
        int gross = sal +hra + ta + da - pf ;

        System.out.println("_________________________________");
        System.out.println("| Employee ID    :     "+id+"        |");
        System.out.println("| Employee Name  :     "+name+"      |");
        System.out.println("|________________________________|");
        System.out.println("|                                |");
        System.out.println("| Basic Salary   :     "+sal+"    |");
        System.out.println("| HRA 10%        :     "+hra+"        |");
        System.out.println("| TA  8%         :     "+ta+"         |");
        System.out.println("| DA  9%         :     "+da+"         |");
        System.out.println("| PF -20%        :     "+pf+"        |");
        System.out.println("|________________________________|");
        System.out.println("| Gross Salary   :               |");
        System.out.println("|================================|");

        scan.close();
    }
}


