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
public class GeometricShapes {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("*****************************************************");
        System.out.println("Please enter the length of one side of the cube");
        double sLength = s.nextDouble();
        System.out.println("Volume of a cube: " + calcVolumeOfCube(sLength));
        System.out.println("****************************************************");
        
        System.out.println("******************************************************");
        System.out.println("Pleaase enter in the radius length for the cylinder");
        double userRadius = s.nextDouble();
        System.out.println("Please enter in the height of the cylinder");
        double userHeight = s.nextDouble();
        System.out.println("Volume of a cylinder: " + calcVolumeOfCylinder(userRadius,userHeight));
        System.out.println("*************************************************************");
        
        System.out.println("**************************************************************");
        System.out.println("Please enter in the raidus of the sphere");
        double userRadiusSphere = s.nextDouble();
        System.out.println("Volume of a sphere: " + calcVolumeOfSphere(userRadiusSphere));
        System.out.println("*************************************************************");
        
    }//end main method
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
        
    } //end calcVolumeCube
    
    public static double calcVolumeOfCylinder(double radius,double height){
        double VolumeOfCylinder = 3.14 * (radius * radius) * height;
        return VolumeOfCylinder;
        
    }//end calcVolumeCylinde
    
    public static double calcVolumeOfSphere (double radiusSphere){
       double volumeOfSphere = (4/3)* Math.pow(radiusSphere, 3)* 3.14;
        return volumeOfSphere;
        
    }//end calcVolumeSphere
    
}//end class
