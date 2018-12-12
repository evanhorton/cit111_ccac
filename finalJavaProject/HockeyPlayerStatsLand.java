/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalJavaProject;
import java.util.Scanner;
/**
 *
 * @author evan.horton
 */
public class HockeyPlayerStatsLand {
    public static void main(String args[]){
        
        HockeyPlayer player1 = new HockeyPlayer();
        player1.playerName = "Phil Kessel";
        player1.playerNumber = 81;
        player1.playerPosition = "Right Wing";
        player1.shotSide = "Shoots Right";
        
        HockeyPlayerStats player1_Stats = new HockeyPlayerStats();
                
        player1_Stats.year = "2015-2016";
        player1_Stats.gamesPlayed = 82;
        player1_Stats.goals = 26;
        player1_Stats.assists = 33;
        player1_Stats.plusMinus = 9;
        player1_Stats.age = 28;
        
        player1.stats15_16_PhilKessel = player1_Stats;
        //System.out.println(player1.stats15_16_PhilKessel.age);
        
        player1_Stats.year = "2016-2017";
        player1_Stats.gamesPlayed = 82;
        player1_Stats.goals = 23;
        player1_Stats.assists = 47;
        player1_Stats.plusMinus = 3;
        player1_Stats.age = 29;
        
        player1.stats16_17_PhilKessel = player1_Stats;
        //System.out.println(player1.stats16_17_PhilKessel.age);
        
        HockeyPlayer player2 = new HockeyPlayer();
        player2.playerName = "Kris Letang";
        player2.playerNumber = 58;
        player2.playerPosition = "Defenseman";
        player2.shotSide = "Shoots Right";
        
        HockeyPlayerStats player2_Stats = new HockeyPlayerStats();
        player2_Stats.year = "2015-2016";
        player2_Stats.gamesPlayed = 71;
        player2_Stats.goals = 16;
        player2_Stats.assists = 51;
        player2_Stats.plusMinus = 9;
        player2_Stats.age = 28;
        
        player2.stats15_16_KrisLetang = player2_Stats;
        
        player2_Stats.year = "2016-2017";
        player2_Stats.gamesPlayed = 41;
        player2_Stats.goals = 5;
        player2_Stats.assists = 29;
        player2_Stats.plusMinus = 2;
        player2_Stats.age = 29;
        
        player2.stats16_17_KrisLetang = player2_Stats;
       Scanner s = new Scanner(System.in);
        System.out.println("Please select 1 if you would like to compare "
                + "Player Phil Kessels goals scored to "
                + "Player 2 Kris Letangs goal total for year 2015-2016");
        System.out.println("Please select 2 if you would like to compare Phil Kessel' assist toatal "
                + "to Kris Letangs assist total for year 2017-2018");
        System.out.println("Please select 3 if you would like to compare"
                + "the games played by Phill Kessel in the last two seasons vs"
                + " the games played by Kris Letanfg in the last two seasons");
       int optionChoice = s.nextInt();
       switch(optionChoice){
           //case 1 will compare player 1's goals and 15/16 to player 2's goals in 15/16
           case 1:
               System.out.println("Who scored more in 15 16");
               compareGoals15_16(player1,player2);
               break;
           //case 2 will compare assists in 17/18     
           case 2:
               System.out.println("who assisted more in 16 17");
               compareAssists17_18(player1,player2);
               break;
           //case 3 will compare games played in the last couple of seasons    
           case 3:
               System.out.println("Who played more games in the last two years");
               compareGamesPlayedBothSeasons(player1,player2);
               break;
               
           default:
               System.out.println("You did not select choice 1, 2, or 3");
               break;
       }//end switch statement
       
        System.out.println("Thank you for running my program");
    } //end mainmethod
    
    //case 1 will compare player 1's goals and 15/16 to player 2's goals in 15/16
       public static void compareGoals15_16(HockeyPlayer player1,HockeyPlayer player2){
           if(player1.stats15_16_PhilKessel.goals > player2.stats15_16_KrisLetang.goals){
               System.out.println("Phil scored " + player1.stats15_16_PhilKessel.goals + "goals");
               System.out.println("While Kris Letang only scored " + player2.stats15_16_KrisLetang.goals + "goals");
           }else{
               System.out.println("Kris scored more goals than Phil");
           }//end if else
           
       }//end compare Goals
       
    //case 2 will compare assists in 17/18     
       public static void compareAssists17_18(HockeyPlayer player1,HockeyPlayer player2){
           if(player1.stats16_17_PhilKessel.assists>player2.stats16_17_KrisLetang.assists){
               System.out.println("Phil assisted on more goals than Kris Letang");
           }else{
               System.out.println("Kris assisted on more goals then Phil");
           }//end if else
           
       }//end Compare Assists
       
    //case 3 will compare games played in the last couple of seasons    
       public static void compareGamesPlayedBothSeasons(HockeyPlayer player1,HockeyPlayer player2){
           if((player1.stats15_16_PhilKessel.gamesPlayed+player1.stats16_17_PhilKessel.gamesPlayed)>(player2.stats15_16_KrisLetang.gamesPlayed+player2.stats16_17_KrisLetang.gamesPlayed)){
               System.out.println("Phil played more games than Kris Letang");
           }else{
               System.out.println("Kris Letang played more games than Phil Kessel");
               
           }//end if else

       }//end compare Games
       
}//end class HockeylayerStatsLand
