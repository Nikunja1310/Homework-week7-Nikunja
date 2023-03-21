package homework_week7_niks;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13WeekDays {
    public static void main(String[] args) {

        Programme13WeekDays switchweek = new Programme13WeekDays();
        switchweek.cityAtoZ();
    }

    public void cityAtoZ (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7 : ");
        int num = scan.nextInt();
        String week;

        switch (num){
            case 1:
        week = "Sunday";
        break;
            case 2 :
                week = "Monday";
                break;
            case 3:
                week = "Tuesday";
                break;
            case 4 :
                week = "Wednesday";
                break;
            case 5 :
                week = "Thursday";
                break;
            case 6 :
                week = "Friday";
                break;
            case 7:
                week = "Saturday";
                break;
            default:
                week = "week contains 1 to 7 days ";
        }
        System.out.println(week);
        scan.close();
    }

}

