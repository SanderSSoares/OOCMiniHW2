/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sande
 */
public class Car extends Vehicle implements Drivable{
    
    private float Direction;
    private float speed;
    private String make;
    private String type;

    @Override
    public float getDirection() {
        return Direction;
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

    
    @Override
    public void accelerate(float speed){
        System.out.println("Your car is accelerating... The speedometer marks "+ speed +" km/h.");
    }
    @Override
    public void brake(){
        System.out.println("!!SOUND OF THE CAR BRAKING!!");
}
    @Override
    public void turn(float angle){
        System.out.println("Car turning " + angle + "° to the left.");
    }
}
