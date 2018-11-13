/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myfirstsubroutine;

/**
 *
 * @author antho6229
 */

import java.util.Scanner;

public class MyFirstSubroutine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner kinput = new Scanner(System.in);
        
        //variable declaration
        int choice = 0;
        double radius;
        
        //loop to keep running until they wish to exit
        while(choice != 6){
            System.out.println("Would you like to:\n\n1: Find the area of a circle\n2: Find the circumference of a circle\n3: Find the volume of a sphere\n4: Find the surface area of a sphere\n5: Find the area of a rectangle\n6: Exit");
            
            //get input
            choice = kinput.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Please enter the radius:");
                    radius = kinput.nextDouble();
                    areaOfCircle(radius);
                    break;
                case 2:
                    System.out.println("Please enter the radius:");
                    radius = kinput.nextDouble();
                    circumferenceOfCircle(radius);
                    break;
                case 3:
                    System.out.println("Please enter the radius:");
                    radius = kinput.nextDouble();
                    volumeOfSphere(radius);
                    break;
                case 4:
                    System.out.println("Please enter the radius:");
                    radius = kinput.nextDouble();
                    surAreaOfSphere(radius);
                    break;
                case 5:
                    System.out.println("Please enter the length:");
                    double length = kinput.nextDouble();
                    System.out.println("Please enter the width");
                    double width = kinput.nextDouble();
                    areaOfRectangle(length, width);
                case 6:
                    System.out.println("Exiting.");
                    break;
            }
        }
        
    }
    
    /**
     * This method finds and outputs the area of a circle.
     * @param rad 
     */
    public static void areaOfCircle(double rad){
        double area = Math.PI*rad*rad;
        area = (Math.round(area*100));
        area/=100;
        System.out.println("The area is " + area + " square units.");
    }
    
    
    /**
     * This method finds and outputs the circumference of a circle.
     * @param rad 
     */
    public static void circumferenceOfCircle(double rad){
        double circumference = Math.PI*rad*2;
        circumference = (Math.round(circumference*100));
        circumference/=100;
        System.out.println("The circumference is" + circumference + " units.");
    }
    
    /**
     * This method finds and outputs the volume of a sphere.
     * @param rad 
     */
    public static void volumeOfSphere(double rad){
        double volume = (4/3)*Math.PI*Math.pow(rad, 3);
        volume = Math.round(volume*100);
        volume/=100;
        System.out.println("The volume is " + volume + " cube units.");
    }
    
    
    /**
     * This method finds and outputs the surface area of a sphere.
     * @param rad 
     */
    public static void surAreaOfSphere(double rad){
        double area = 4*Math.PI*Math.pow(rad, 2);
        area = Math.round(area*100);
        area/=100;
        System.out.println("The surface area is " + area + " square units.");
    }
    
    /**
     * This method finds and outputs the area of a rectangle.
     * @param length
     * @param width 
     */
    public static void areaOfRectangle(double length, double width){
        double area = length * width;
        area = Math.round(area*100);
        area /= 100;
        System.out.println("The area is " + area + " square units.");
    }
    
}
