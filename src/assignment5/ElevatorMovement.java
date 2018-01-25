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
public class ElevatorMovement extends Condition{
    
    private int curFloor;
    private int FloorLocation;
    
    public ElevatorMovement(LinkedList<Integer> destination, int currentFloor) {
        this.curFloor = currentFloor;
        this.FloorLocation = destination.peek();
        nextLevel = "operation";
    }
    
    public String execute()
    {
        System.out.println("The elevator is moving up");
        for(int i = curFloor; i <= FloorLocation; i++) {
            System.out.println("Elevator: " + curFloor + " nextLevelFloor");
            curFloor++;
        }
        
        return nextLevel;
    }
    
}
