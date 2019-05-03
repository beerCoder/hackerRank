package com.java.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

class Runners extends Thread{
    boolean  bExit = false;
  
    public void exit(boolean bExit){
        this.bExit = bExit;
    }
  
    @Override
    public void run(){
        while(!bExit){
            System.out.println("Thread is running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Runners.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}