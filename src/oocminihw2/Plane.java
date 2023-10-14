/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sande
 */
public class Plane extends Vehicle implements Flyable{
    
    //Declaring variables
    private float direction;
    private float speed;
    private String make;
    private String type;
    private float Altitude;
    
    //Overriding the gets
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

    @Override
    public float getAltitude() {
        return Altitude;
    }

    //Overriding the methods
    
    @Override
    public void accelerate(float speed){
        //The plane will take off by the speed imputed
        System.out.println("The plane will take off when reaches " + speed + " km/h.");
    }
    @Override
    public void brake(){
        //Sound plane braking
        System.out.println("!!SOUND OF THE PLANE BRAKING!!");
}
    @Override
    public void turn(float angle){
        //Planing turning right according to the angle inputed
        System.out.println("Plane is turning " + angle + "° to the right.");
}
    @Override
    public void changeAltitude(float change){
        //Plane will change the altitude according to the imput
        System.out.println("Plane if changing to " + change + " ft of Altitude.");
    }

}
