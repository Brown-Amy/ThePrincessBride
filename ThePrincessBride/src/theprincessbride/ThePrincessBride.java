/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theprincessbride;

import theprincessbride.model.Game;

/**
 *
 * @author amybrown
 */
public class ThePrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game gameOne = new Game();
        
        gameOne.setBestTime(10.00);
        gameOne.setLastSave("today");
        gameOne.setTotalTime(5.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
