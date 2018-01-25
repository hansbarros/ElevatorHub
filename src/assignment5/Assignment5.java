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
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    
    static int currentFloor = 3;
    
    String nextLevel;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Assignment5 elevator = new Assignment5();
    }
    
    public Assignment5(){
      
      String[] states = {"standby", "operation", "destination", "abort"};
      String[] events = {"call", "close", "requestDown","requestUp","stop", "open","alarm","quit"};
      
      ConditionGraph elevatorMove = new ConditionGraph(events, states);
      LinkedList<Integer> floorList = new LinkedList<>();
      
      floorList.add(7); 

      elevatorMove.setCurrentState("standby");
      elevatorMove.setStateAction("call", "standby", new ElevatorLog(floorList));
      elevatorMove.setStateAction("open", "operation", new DoorOpen());
      elevatorMove.setStateAction("close", "operation", new DoorClose());
      elevatorMove.setStateAction("requestUp", "operation", new ElevatorMovement(floorList, currentFloor));
      elevatorMove.setStateAction("stop", "operation", new Standstill(floorList));
      elevatorMove.setStateAction("open", "destination", new DoorOpen());
      elevatorMove.setStateAction("close", "operation", new DoorClose());

      elevatorMove.handleEvent("call");
      elevatorMove.handleEvent("open");
      elevatorMove.handleEvent("close");
      elevatorMove.handleEvent("requestUp");
      elevatorMove.handleEvent("stop");
      elevatorMove.handleEvent("open");
      elevatorMove.handleEvent("close");
      elevatorMove.handleEvent("requestUp");
      elevatorMove.handleEvent("stop");
    }
    
}
