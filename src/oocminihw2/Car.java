/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sande
 */
public class Car extends Vehicle implements Drivable{//Extending a class and implementing from a interface
    
    //Declaring variables
    private float direction;
    private float speed;
    private String make;
    private String type;

    //Overriding gets from Drivable
    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    //Overriding methods from Drivable
    
    @Override
    public void accelerate(float speed){
        //Adding a comment when this method runs at speed chose by the user.
        System.out.println("Your car is accelerating... The speedometer marks "+ speed +" km/h.");
    }
    @Override
    public void brake(){
        //Adding an "effect sound" when car brakes
        System.out.println("!!SOUND OF THE CAR BRAKING!!");
}
    @Override
    public void turn(float angle){
        //Car turns left with angle given by the user
        System.out.println("Car turning " + angle + "° to the left.");
    }
}
