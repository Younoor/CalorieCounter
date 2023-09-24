/* Program: Counting Calories burned during a month
 * Name: Yousef Noor
 * Class: CS1083 - 005
 * Date: 9/9/23
 */
import java.util.*;
public class CalorieCount{
    public static void main(String[] args){
        //Output for title
        System.out.println("Fall 2023 - CS1083 - Section 005 - Project 1 – CalorieCount - written by Yousef Noor" +"\n");
        Scanner scnr = new Scanner(System.in);
        //Variables for calories of the week
        int calMon, calTues, calWed, calThurs, calFri, calSat, calSun;
        int weekTotal, monthTotal = 0;
        //Constant of how many days are in the month
        final int month = 30;
        int i;
        int k = 1;

        //Asking for all the calories of the week
        System.out.println("Calories burnt on Monday: ");
        calMon = scnr.nextInt();
        System.out.println("Calories burnt on Tuesday: ");
        calTues = scnr.nextInt();
        System.out.println("Calories burnt on Wednesday: ");
        calWed = scnr.nextInt();
        System.out.println("Calories burnt on Thursday: ");
        calThurs = scnr.nextInt();
        System.out.println("Calories burnt on Friday: ");
        calFri = scnr.nextInt();
        System.out.println("Calories burnt on Saturday: ");
        calSat = scnr.nextInt();
        System.out.println("Calories burnt on Sunday: ");
        calSun = scnr.nextInt();

        // Just a lil output for whitespace
        System.out.print("\n");

        //Output for first row of table
        System.out.println("Week" + "\t" + "Monday" + "\t" + "Tuesday" + "\t" + "Wednesday" + "Thursday" + "Friday" + "\t" + "Saturday" + "Sunday" + "\t" + "Total/Week");

        //Loop for output of each week
        for(i=1;i<=5;i++){
            System.out.print(i + "\t" + "\t");
            weekTotal = 0;
            //If statements for output if the date is before the 30th
            if(k<=month){
                System.out.print(k + "-" + calMon + "\t");
                k++;
                weekTotal += calMon; //Adding the dates as they output to the end output of the week
                if(k<=month){
                    System.out.print(k + "-" + calTues + "\t");
                    k++;
                    weekTotal += calTues;
                    if(k<=month){
                        System.out.print(k + "-" + calWed + "\t");
                        k++;
                        weekTotal += calWed;
                        if(k<=month){
                            System.out.print(k + "-" + calThurs + "\t");
                            k++;
                            weekTotal += calThurs;
                            if(k<=month){
                                System.out.print(k + "-" + calFri + "\t");
                                k++;
                                weekTotal += calFri;
                                if(k<=month){
                                    System.out.print(k + "-" + calSat + "\t");
                                    k++;
                                    weekTotal += calSat;
                                    if(k<=month){
                                        System.out.print(k + "-" + calSun + "\t");
                                        k++;
                                        weekTotal += calSun;
                                    }
                                    else{
                                        System.out.print("0-0" + "\t");
                                    }
                                }
                                else{
                                    System.out.print("0-0" + "\t" + "0-0" + "\t");
                                }
                            }
                            else{
                                System.out.print("0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t");
                            }
                        }
                        else{
                            System.out.print("0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t");
                        }
                    }
                    else{
                        System.out.print("0-0" + "\t" + "\t" + "0-0" + "\t" + "\t" + "0-0" + "\t" + "\t" + "0-0" + "\t" + "\t" + "0-0" + "\t" + "\t");
                    }
                }
                else{
                    System.out.print("0-0" + "\t" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t");
                }
            }
            else{
                System.out.print("0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0" + "\t" + "0-0");
            }
            //Output for the end of the weeks
            System.out.println("W" + i + "-" + weekTotal);
            //Adding the dates so that the months line up at the end as well
            monthTotal += weekTotal;
        }

        //Output for the month at the ending
        System.out.print("Total Calories: " + monthTotal);
    }
}
