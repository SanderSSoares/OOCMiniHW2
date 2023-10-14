/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //Calling each objects and using all methods.
        
        //Calling the car
        System.out.println("----CREATING A CAR----");
        Car car1 = new Car();
        car1.accelerate(50);
        car1.brake();
        car1.turn(30);
        
        //Calling the plane
        System.out.println("----CREATING A PLANE----");
        Plane plane1 = new Plane();
        plane1.accelerate(285);
        plane1.brake();
        plane1.turn(60);
        plane1.changeAltitude(3000);
        
        //Calling the boat
        System.out.println("----CREATING A BOAT----");
        Boat boat1 = new Boat();
        boat1.hoistSail();
        boat1.isSailHoisted();
        boat1.landHo();
        boat1.lowerSail();   
    }
    
}
