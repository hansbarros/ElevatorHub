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
public class ConditionGraph {
    
    String [] stateNames;
    String [] eventNames;
    String currentState;
    Condition [][] chart = null;
    
    public ConditionGraph(String[] events, String[] states)
    {
        chart = new Condition[events.length][states.length];
        eventNames = events;
        stateNames = states;
    }
    
    int findState(String state)
    {
        int result = -1;
        for(int i = 0; i < stateNames.length; i++)
        {
            if(state.equals(stateNames[i]))
            {
                result = i;
            }
        }
        return result;
    }
    
      public void setStateAction(String event, String state, Condition action)
    {
        chart[findEvent(event)][findState(state)] = action;
    }
   
    public void setCurrentState(String state)
    {
        currentState = state;
        System.out.println("Current condition of elevator:  " + currentState +"\n");
    }
    
    public String handleEvent(String event)
    {
        int ev = findEvent(event);
        int st = findState(currentState);
        
        if(ev < 0)
        {
            System.out.println("undefined " + event);
        }
        else
        {
            Condition state = chart[ev][st];
            if(state != null)
            {
                state.execute();
                currentState = state.nextLevel;
            }
            else
            {
                System.out.println("undefined" + currentState + "to" + event);
            }
        }
        return currentState;
    }
    
    int findEvent(String event)
    {
        int result = -1;
        for(int i = 0; i < eventNames.length; i++)
        {
            if(event.equals(eventNames[i]))
            {
                result = i;
            }
        }
        return result;
    }
}

