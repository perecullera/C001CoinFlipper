/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c001coinfliper;

import java.util.Random;

/**
 *
 * @author perecullera
 */
public class Coin {
    //Randomly get Tail Or Head 
    public Random TailOrHead;
    
    //variable to keep the numeric result for Head or Tail
    public int result;
    
public Coin(){
    TailOrHead = new Random();
}

//method to get randomly True for Tail  False for Head
public boolean getTailOrHead() {
        return TailOrHead.nextBoolean();
    }
    
}
