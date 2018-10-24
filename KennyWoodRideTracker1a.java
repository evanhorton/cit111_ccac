/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Random;

/**
 *
 * @author evan.horton
 */
public class KennyWoodRideTracker1a {
    
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    final static int Min_Height_Thrill_Riders = 0;
    final static int Min_Height_Theme_Riders = 0;
    
    
   public static void main(String [] args) {
       
       
   }//end main method
    public static void rideBlackWidow (int riders, int avgHeight) {
        
        if(avgHeight >= Min_Height_Thrill_Riders ){
            System.out.println("Riding Black Widow");
            totalRiders = riders + totalRiders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = numSickRiders + totalSickRiders;
        }else{
            System.out.println("Sorry these people were too short for the ride");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("Number of Riders turned away" + totalFailedRideAttempts);
            
            
        }//end if else
    
}//close rideBlackWidow
    
    public static void rideMerryGoRound(int riders, int avgHeight) {
    
        if(avgHeight >= Min_Height_Theme_Riders ){
            System.out.println("Riding Merry Go Round");
            totalRiders = riders + totalRiders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = numSickRiders + totalSickRiders;
        }else{
            System.out.println("Sorry these people were too short for the ride");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("Number of Riders turned away" + totalFailedRideAttempts);
    
        }//close else
    }//close Ride Merry Go Round
    
    public static void printRideStats(){
            System.out.println("**********************Rider Stats**************");
            System.out.println("Total Riders:" + totalRiders);
            System.out.println("Total Failed Ride Attempts:" + totalFailedRideAttempts);
            System.out.println("Total Sick Riders:" + totalSickRiders);
            System.out.println("**************************");
    } //print Ride Stats end
    
}//end class
