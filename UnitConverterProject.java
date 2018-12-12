/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;
import java.util.Scanner;
/**
 *
 * @author evanhorton
 */
public class UnitConverterProject {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("Please enter in the weight in pounds");
        double userWeight_Pounds = s.nextDouble();
        System.out.println("The weight of the object in kilograms is: " + convertPoundsToKilograms(userWeight_Pounds));
        System.out.println("********************************************");
        
        System.out.println("please enter the number of days");
        double userDays = s.nextDouble();
        System.out.println("The number of seconds in " + userDays + " days is:" + convertDaysToSeconds(userDays));
        System.out.println("********************************************");
        
        System.out.println("please enter in the number of miles");
        double user_miles=s.nextDouble();
        System.out.println("The number of cm in a mile is: " + convertMilesToCentimeters(user_miles));
        System.out.println("********************************************");

        
        
    }//end main method
    
    public static double convertPoundsToKilograms(double pounds){
        double kilograms = pounds / 2.2046226218;
        return kilograms;
    }//end convertPoundsToKilograms
    
    public static double convertDaysToSeconds (double days){
        double seconds = days * 24 * 60 * 60;
        return seconds;
    }//endConvertDaysToSeconds
    
    
    public static double convertMilesToCentimeters (double miles){
        double centimeters = miles * 5280 * 12 * (1/2.54);
        return centimeters;
    }//end
    
}
