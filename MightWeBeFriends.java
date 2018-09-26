/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.util.Scanner;
/**
 *Implements logic for checking friend compatibility using if statements
 * @author evan.horton
 */
public class MightWeBeFriends {//start of class
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        //read a line from the user and store in var
        System.out.println("Welcome to the friend picker");
//        System.out.println("You Typed: " + userImput);

        
            
            
         System.out.println("How old are you?");
            int age = myScanner.nextInt();
            int sports;
            int outdoors;
            int music;
            int moviesTv;
            int totalPoints = 400;
            double percentage=0.0;
            int earnedPoints = 0;
            
            if(18<=age&&age<=30){
                System.out.println("Awesome, you are in the right age range");
                System.out.println("How much do you like watching sports/hockey out of 100 points?");
                sports = myScanner.nextInt();
                System.out.println("How much do you like watching movies or TV shows out of 100 points?");
                moviesTv = myScanner.nextInt();
                System.out.println("How much do you like spending time outdoors out of 100 points?");
                outdoors = myScanner.nextInt();
                System.out.println("How much do you like listening to music out of 100 points");
                music = myScanner.nextInt();
            earnedPoints = music + moviesTv + sports + outdoors;
            percentage = ((double)earnedPoints / (double)totalPoints) * 100;
            
            if(percentage>=60){
                System.out.println("We'll definitely be friends");
            }
            else if(40<=percentage&&percentage<=60){
                System.out.println("We may be friends");
            }
            else {
                System.out.println("Sorry we will probably not be friends");
            }//end if else
            
            
            }
            else{
                System.out.println("Sorry we won't be friends");
            }//closes if else chain
            
    }//end main method
}//end public class
