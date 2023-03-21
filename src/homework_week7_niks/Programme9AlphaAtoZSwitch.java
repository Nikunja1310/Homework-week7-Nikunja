package homework_week7_niks;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
public class Programme9AlphaAtoZSwitch {
    public static void main(String[] args) {

        Programme9AlphaAtoZSwitch obj = new Programme9AlphaAtoZSwitch();
        obj.cityAtoZ();
    }


     public void cityAtoZ (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to Z : ");
        String alpha = scan.nextLine();
        String city;

        switch (alpha){
            case "A":
                city = "Adelaide";
                break;
            case "B" :
                city = "Brisbane";
                break;
            case "C" :
                city = "Canberra";
                break;
            case "D" :
                city = "Darwin";
                break;
            case "E":
                city = "Elk Grove";
                break;
            case "F" :
                city = "Florida";
                break;
            default :
                city ="Invalid Entry";
                break;
        }
        System.out.println(city);
        scan.close();
        }
    }
