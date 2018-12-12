/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author evanhorton
 */
public class MiniProjectMysteryDoors {
    
    public static void main(String[]args){
        
        System.out.println("Choose the one door you would like to enter: door 1, door 2, or door 3.");
        Scanner s = new Scanner(System.in);
        double chosenNumber;
        int optionChoice = s.nextInt();
        
        switch(optionChoice){
            case 1:
                enterDoorOne();
                break;
                
            case 2:
                enterDoorTwo();
                break;
                
            case 3:
                System.out.println("since you have selected door three please select another number then hit enter");
                chosenNumber = s.nextDouble();
                enterDoorThree(chosenNumber);
                break;
                
            default:
                System.out.println("You have not selected a correct response");
                break;
        }//end switch statement
        
                System.out.println("Thank you for choosing to enter one of our doors today");
        
    }//end main method
    
    //this method gives the contestant no winnings
    public static void enterDoorOne() {
        
        System.out.println("You have chosen to enter door number one");
        System.out.println("Sorry you do not receive any prizes from this door choice");
        System.out.println("exit door number one");
        
    }//end door1
    
    //this method generates a random number for the contestant
    public static void enterDoorTwo() {
        
        System.out.println("You have chosen to enter door number two");
        System.out.println("You have won a random huge number");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100,r);
        System.out.println(bigInt);
        System.out.println("exit door number two");
        
    }//end door2
    
    //this method determines the number of tokens you win through use of user input
    public static void enterDoorThree(double number){
        
        System.out.println("You have chosen to enter door number three");
        double finalWinnings = number * 100;
        System.out.println("You win this number of tokens:" + finalWinnings);
        System.out.println("exit door number three");
        
    }//end door3
    
}//end class
