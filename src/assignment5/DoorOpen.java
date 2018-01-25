/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author hansb
 */
public class DoorOpen extends Condition{
    
    public DoorOpen() {
         nextLevel = "operation";
    }
    
    public String execute()
    {
        System.out.println("the elevator door is open!");
        return nextLevel;
    }
    
}
