/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c001coinfliper;

/**
 *
 * @author perecullera
 */
public class C001CoinFliper {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialise class to acces non-static methods
        C001CoinFliper coinFlip  = new C001CoinFliper();
        
        //3 Coin Objects
        Coin coin1;
        Coin coin2;
        Coin coin3;
        
        //Array to keep round results
        int [] ResArray = new int[6];
        
        //last String result
        String result = "";
        
        //initialise Coins
        coin1 = new Coin();
        coin2 = new Coin();
        coin3 = new Coin();
        
        System.out.println("Starting...");
        
        //play the 6 rounds to get the Coins result
        for(int i = 0; i < 6; i++){
            int round = i+1;
            System.out.println("Round " + round);
            ResArray[i] = coinFlip.getCoinResult(coin1)+coinFlip.getCoinResult(coin2)+coinFlip.getCoinResult(coin3);
            System.out.println("Result for round "+ round +": " + ResArray[i]);
        }
        
        //from ResArray to String result
        for (int i = ResArray.length-1; i>=0 ; i--){
            result = result+ResArray[i];
        }
        System.out.println("Result: " + result);
    }
    
    //complementary method to add value to head or tail
    public int getCoinResult(Coin coin){
        int result;
        boolean TailHead = coin.getTailOrHead();
        //True is Tails so its 2
        if (TailHead){
                coin.result = 2;
            //False is Head so its 3
            }else{
                coin.result = 3; 
            }
        return coin.result;
    }
    
}

