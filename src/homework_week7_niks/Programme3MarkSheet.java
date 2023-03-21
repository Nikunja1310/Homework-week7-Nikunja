package homework_week7_niks;

/** 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
        * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        * Input, Marks should between 0 to 100”) and find out total, percentage and result.
        * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        * _______________________________
        * | |
        * | Mark Sheet |
        * |_______________________________|
        * | Name : Jay |
        * | Roll No: 08 |
        * |_______________________________|
        * | Subjects : Marks |
        * |_______________________________|
        * | Math : 98 |
        * | Science : 90 |
        * | English : 85 |
        * |_______________________________|
        * | Total : 273 |
        * |_______________________________|
        * | Percentage : 91.0 |
        * | Result : Pass |
        * | Grade : A+ |
        * |_______________________________|
        */

import java.util.Scanner;
public class Programme3MarkSheet {
    public static void main(String[] args) {

        Programme3MarkSheet marksheetobject = new Programme3MarkSheet();
        marksheetobject.markSheet();

    }
    public void markSheet (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'Student Name' ");
        String name = scan.nextLine();
        System.out.println("Enter 'Roll no' ");
        int num = scan.nextInt();
        System.out.println("Enter marks in Math, Science and English ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int total = num1+num2+num3;
        float percentage = (total/3.0f);

        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________|");
        System.out.println("|   Name        :  "+ name+ "         |" );
        System.out.println("|   Roll No     :  "+ num  +"           |");
        System.out.println("|________________________________|");
        System.out.println("|   Subjects    :     Marks      |");
        System.out.println("|________________________________|");

        if((num1<0 || num1 > 100 || num2 <0 || num2>100 || num3 <0 ||num3>100 )){
            System.out.println("Invalid Input, " +
                    "Marks should be between 0 to 100");
        }else{
            System.out.println("|   Math        :  "+   num1+"            |");
            System.out.println("|   Science     :  "+   num2+"            |");
            System.out.println("|   English     :  "+   num3+"            |");
        }

        System.out.println("|________________________________|");
        System.out.println("|  Total        :  " + total +"           |");
        System.out.println("|________________________________|");
        System.out.println("|  Percentage   :  " + percentage +"          |");

        if(percentage>=35){
            System.out.println();
            System.out.println("|  Result       :     Pass       |");
        }else{
            System.out.println("|  Result       :     Fail       |");
        }

        if(percentage>=80){
            System.out.println("|  Grade        :     A+         |");
        } else if (percentage>=60) {
            System.out.println("|  Grade        :     A          |");
        } else if (percentage>50) {
            System.out.println("|  Grade        :     B          |");
        }else {
            System.out.println("|  Grade        :     C          |");
        }

        System.out.println("|________________________________|");

        scan.close();
    }
}

