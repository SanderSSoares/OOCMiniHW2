/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sande
 */
public class Boat extends Vehicle implements Sailable {
    
    private boolean isSailHoisted=true;//declaring that sail hoisted is true 
    
    //Overriding the methods and outputing answers when called
    @Override
    public void hoistSail(){
        System.out.println("Hoisting Sails.");
    }
    @Override
    public void lowerSail(){
        System.out.println("Lowering Sails.");
    }
    @Override
    public boolean isSailHoisted(){
        //if sails are not hoisted, boat won't leave
        if (isSailHoisted=!true){
            System.out.println("We need to leave, please Hoist the sails");
        }else{
            //boat leaving when isSailHosted is true
            System.out.println("Ship is leaving...");
        }
        return this.isSailHoisted;
    }
    @Override
    public void landHo(){
        System.out.println("LanHo Captain!");
    }
    
    
}
