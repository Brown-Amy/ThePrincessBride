/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import princessbride.model.Player;

/**
 *
 * @author amybrown
 */
public class PrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Westley");
        playerOne.setBestTime(7.77);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
