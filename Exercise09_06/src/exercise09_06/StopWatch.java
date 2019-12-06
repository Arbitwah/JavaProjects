/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09_06;

public class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch(){
        //no arg contructor that sets start time.
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return getEndTime() - getStartTime() ;
    }
   //<editor-fold desc="getters">
    //getter--instructions did not want a setter
    public long getStartTime(){
    return startTime; 
    }
    
    public long getEndTime(){
    return endTime;
    }
    //</editor-fold>
    
}
