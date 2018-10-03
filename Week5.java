/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.util.Scanner;

/**
 *
 * @author evan.horton
 */
public class Week5 {

    //start of the main class
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //initialize userAge
        double userAge;
        double ageing;
        int trueFalse;

        System.out.println("How old are you?");
        userAge = s.nextDouble();
        //starting a while loop to determine if age > 65.5

        while (userAge < 65.5) {

            System.out.println("You are not able to retire at this point");
            System.out.println("Have you gotten any older enter. 1 for true and 2 for false?");

            trueFalse = s.nextInt();

            if (trueFalse == 1) {//start if statement 

                System.out.println("How old are you now?");
                ageing = s.nextDouble();

                if (ageing <= userAge) {
                    System.out.println("Sorry you still cannot retire.");
                } else if (ageing > userAge) {
                    System.out.println("Let me check if you can retire");
                } else if (ageing > 65.5) {
                    System.out.println("You can officially retire");
                }

            } else {
                System.out.println("you can not retire");
            }//end else
        }//end while loop

        System.out.println("You can retire");

    }//close main method
}//end class
