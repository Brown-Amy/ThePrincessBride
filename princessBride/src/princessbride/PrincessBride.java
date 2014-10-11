/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import princessbride.model.Actor;
import princessbride.model.Item;
import princessbride.model.Player;
/**
 *
 * @author alexanderknudson
 */
public class PrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Jim");
        playerOne.setBestTime(7.68);        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //-------------------------------
        
        Actor actorOne = new Actor();
        
        actorOne.setActorName("Buttercup");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //-------------------------------
        
        Item itemOne = new Item();
        
        itemOne.setType("rope");
        itemOne.setDescription("a strong coil of rope");
        itemOne.setSpecialAbility("Can be used to rescue someone in peril");
        itemOne.setRequiredAmount(3);
        itemOne.setActualAmount(2);
                
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //---------------------------------
        
        
        
    }
    
}
