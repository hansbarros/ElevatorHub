/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.LinkedList;

/**
 *
 * @author hansb
 */
public class ElevatorLog extends Condition {
    
    private int FloorLocation;
    private int curFloor;

    public ElevatorLog(LinkedList<Integer> destination) {
        this.FloorLocation = destination.peek();
        nextLevel = "operation";
    }
    
    public String execute()
    {
        System.out.println("User is on 3rd floor and requested the " + FloorLocation + " floor\n--------------------");
        this.curFloor = this.FloorLocation;
        return nextLevel;
    }
    
}
