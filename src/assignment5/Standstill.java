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
public class Standstill extends Condition{
    
private int FloorLocation;
    

public Standstill(LinkedList<Integer> destination){
        this.FloorLocation = destination.removeFirst();
        nextLevel = "operation";
    }
    
public String execute(){
        System.out.println("----------------------\nThe elevator arrived the destination " + FloorLocation + " Floor!\n--------------------");
        return nextLevel;
    }

}
